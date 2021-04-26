package com.example.demo.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/*****
 *@className: EventTypeEnum
 *@date: 2021/4/22  19:52
 *@User: create By haha
 *
 */

@Getter
public enum EventTypeEnum {

    InviteTestDrive(0, "邀请试驾"),
    ;

    private Integer code;

    private String message;

    EventTypeEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    /**
     * 建立从code到枚举值的映射
     */
    private static final Map<Integer, EventTypeEnum> code2enumMap =
            new HashMap<Integer, EventTypeEnum>();
    static {
        for(EventTypeEnum st: EventTypeEnum.values()) {
            code2enumMap.put(st.getCode(), st);
        }
    }

    /**
     * 按code从映射中找到枚举
     * @param statusCode
     * @return
     */
    public static EventTypeEnum getByCode(int statusCode) {
        return code2enumMap.get(statusCode);
    }
}
