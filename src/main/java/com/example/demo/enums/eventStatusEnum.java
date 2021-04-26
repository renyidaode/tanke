package com.example.demo.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/*****
 *@className: eventStatusEnum
 *@date: 2021/4/25  16:41
 *@User: create By haha
 *
 */

@Getter
public enum eventStatusEnum {

    not_release(0, "未开始"),
    on_line(1, "进行中"),
    off_line(2, "已结束"),
    ;

    private Integer code;

    private String message;

    eventStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    /**
     * 建立从code到枚举值的映射
     */
    private static final Map<Integer, eventStatusEnum> code2enumMap =
            new HashMap<Integer, eventStatusEnum>();
    static {
        for(eventStatusEnum st: eventStatusEnum.values()) {
            code2enumMap.put(st.getCode(), st);
        }
    }

    /**
     * 按code从映射中找到枚举
     * @param statusCode
     * @return
     */
    public static eventStatusEnum getByCode(int statusCode) {
        return code2enumMap.get(statusCode);
    }
}
