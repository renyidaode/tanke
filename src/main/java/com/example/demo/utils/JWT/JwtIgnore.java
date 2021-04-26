package com.example.demo.utils.JWT;

import java.lang.annotation.*;

/*****
 *@className: JwtIgore
 *@date: 2021/3/30  16:19
 *@User: create By haha
 *
 */


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JwtIgnore {
}
