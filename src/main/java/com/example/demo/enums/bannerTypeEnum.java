package com.example.demo.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/*****
 *@className: bannerTypeEnum
 *@date: 2021/4/1  10:36
 *@User: create By haha
 *
 */

@Getter
public enum bannerTypeEnum {

    Http(0, "跳转链接内容"),
    graphic(1, "跳转图文内容"),
    event(2,"跳转活动"),
    ;


    private Integer code;

    private String message;

    bannerTypeEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    /**
     * 建立从code到枚举值的映射
     */
    private static final Map<Integer, bannerTypeEnum> code2enumMap =
            new HashMap<Integer, bannerTypeEnum>();
    static {
        for(bannerTypeEnum st: bannerTypeEnum.values()) {
            code2enumMap.put(st.getCode(), st);
        }
    }

    /**
     * 按code从映射中找到枚举
     * @param statusCode
     * @return
     */
    public static bannerTypeEnum getByCode(int statusCode) {
        return code2enumMap.get(statusCode);
    }
}
