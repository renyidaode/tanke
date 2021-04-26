package com.example.demo.utils.JWT;


import com.example.demo.common.ResultCode;
import com.example.demo.exception.CustomException;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

/*****
 *@className: JwtTokenUtil
 *@date: 2021/3/25  16:49
 *@User: create By haha
 *
 */


public class JwtTokenUtil {

    private static Logger logger = LoggerFactory.getLogger(JwtTokenUtil.class);

    public static final String AUTH_HEADER_KEY = "Authorization";

    public static final String TOKEN_PREFIX = "Bearer";

    /*
    * 解析token*/

    public static Claims parseJWT(String jsonWebToken, String base64Security) throws CustomException {
        try{
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(base64Security))
                    .parseClaimsJws(jsonWebToken).getBody();

            return claims;
        }catch (ExpiredJwtException e){
            logger.error("====Token过期=====", e);
            throw new CustomException(ResultCode.PERMISSION_TOKEN_EXPIRED);
        }catch (Exception e){
            logger.error("======token解析异常=====", e);
            throw new CustomException(ResultCode.PERMISSION_TOKEN_INVALID);
        }
    }


    /**
     *构建token      role权限
     */

    public static String createJWT(String userId, String role, String userName, Audience audience) throws CustomException {
        try{
            SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

            //获取现在时间
            Long nowMillis = System.currentTimeMillis();
            Date now = new Date(nowMillis);

            //生成签名密钥
            byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(audience.getBase64Secret());
            Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

            //userId是重要信息，进行加密下
//            String encryId = Base64Util.encode(userId);

            JwtBuilder builder = Jwts.builder().setHeaderParam("type", "JWT")
                    .claim("userId", userId)
                    .claim("role", role)
                    .setSubject(userName)
                    .setIssuer(audience.getClientId())
                    .setIssuedAt(new Date())
                    .setAudience(audience.getName())
                    .signWith(signatureAlgorithm, signingKey);
            //添加过期时间
            Integer TTLMillis = audience.getExpiresSecond();
            if (TTLMillis >= 0){
             Long expMillis = nowMillis + TTLMillis;
             Date exp = new Date(expMillis);
             builder.setExpiration(exp)
                     .setNotBefore(now);
            }
            return builder.compact();
        }catch (Exception e){
            logger.error("签名失败", e);
            throw new CustomException(ResultCode.PERMISSION_TOKEN_INVALID);
        }
    }

    public static String getUserName(String token, String base64Security) throws CustomException {
        return parseJWT(token, base64Security).getSubject();
    }

    public static String getUserId(String token, String base64Security) throws CustomException {
        return parseJWT(token, base64Security).get("userId", String.class);
    }

    //查看token是否过期
    public static boolean isExpiration(String token, String base64Security) throws CustomException {
        return parseJWT(token, base64Security).getExpiration().before(new Date());
    }
}
