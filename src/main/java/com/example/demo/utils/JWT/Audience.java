package com.example.demo.utils.JWT;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*****
 *@className: Audience
 *@date: 2021/3/29  16:54
 *@User: create By haha
 *
 */

@Data
@Component
@ConfigurationProperties(value = "audience")
public class Audience {

    private String clientId;

    private String base64Secret;

    private String name;

    private Integer expiresSecond;
}
