package com.example.demo.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/*****
 *@className: bannerStatusEnum
 *@date: 2021/4/1  10:42
 *@User: create By haha
 *
 */

@Getter
public enum bannerStatusEnum {

    not_release(0, "未发布"),
    on_line(1, "已发布"),
    off_line(2, "已下线"),
    ;

    private Integer code;

    private String message;

    bannerStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    /**
     * 建立从code到枚举值的映射
     */
    private static final Map<Integer, bannerStatusEnum> code2enumMap =
            new HashMap<Integer, bannerStatusEnum>();
    static {
        for(bannerStatusEnum st: bannerStatusEnum.values()) {
            code2enumMap.put(st.getCode(), st);
        }
    }

    /**
     * 按code从映射中找到枚举
     * @param statusCode
     * @return
     */
    public static bannerStatusEnum getByCode(int statusCode) {
        return code2enumMap.get(statusCode);
    }
}
