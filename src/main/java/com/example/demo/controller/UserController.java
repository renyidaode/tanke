//package com.example.demo.controller;
//
//import com.alibaba.fastjson.JSONObject;
//import com.example.demo.common.Result;
//import com.example.demo.model.User;
//import com.example.demo.exception.CustomException;
//import com.example.demo.service.UserService;
//import com.example.demo.utils.JWT.Audience;
//import com.example.demo.utils.JWT.JwtIgnore;
//import com.example.demo.utils.JWT.JwtTokenUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletResponse;
//import java.util.List;
//import java.util.UUID;
//
///**
// * (User)表控制层
// *
// * @author makejava
// * @since 2021-03-26 18:05:51
// */
//@RestController
//@RequestMapping("/user")
//@Slf4j
//public class UserController {
//    /**
//     * 服务对象
//     */
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private Audience audience;
//
//    @GetMapping("/info")
//    @JwtIgnore
//    public Result login(HttpServletResponse response, String userName, String userPassword) throws CustomException {
//
//        String userId = UUID.randomUUID().toString();
//        String role = "admin";
//
//        //创建token
//        String token = JwtTokenUtil.createJWT(userId, role, userName, audience);
//        log.info("## 登录成功, token={} ###", token);
//
//        //将token放在响应头
//        response.setHeader(JwtTokenUtil.AUTH_HEADER_KEY, JwtTokenUtil.TOKEN_PREFIX + token);
//        //将token响应给客户端
//        JSONObject result = new JSONObject();
//        result.put("token", token);
//        return Result.SUCCESS(result);
//    }
//
//
//    @PostMapping("/add")
//    public Integer add(User user){
//        return userService.add(user);
//    }
//
//    @GetMapping("/ByUserName")
//    public Result ByUserName(String userName){
////        if (userName == null){
////            return commonResult.error(ResultCode.REQUEST_INFO_ERROR.message());
////        }
//        List<User> user = userService.getByUserName(userName);
//        System.out.print(user);
//        return Result.SUCCESS(user);
//    }
//}
