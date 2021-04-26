package com.example.demo.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/*****
 *@className: OnlineOffStatusEnum
 *@date: 2021/4/19  11:21
 *@User: create By haha
 *
 */

@Getter
public enum OnlineOffStatusEnum {

    on_line(0, "立即上线"),
    TimeOnline(1, "定时上线"),
    off_line(2, "立即下线"),
    TimeOffline(3, "定时下线"),
    ;

    private Integer code;

    private String message;

    OnlineOffStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }



    /**
     * 建立从code到枚举值的映射
     */

    private static final Map<Integer, OnlineOffStatusEnum> code2enumMap =
            new HashMap<Integer, OnlineOffStatusEnum>();
    static {
        for(OnlineOffStatusEnum st: OnlineOffStatusEnum.values()) {
            code2enumMap.put(st.getCode(), st);
        }
    }


    /**
     * 按code从映射中找到枚举
     * @param statusCode
     * @return
     */
    public static OnlineOffStatusEnum getByCode(int statusCode) {
        return code2enumMap.get(statusCode);
    }
}
