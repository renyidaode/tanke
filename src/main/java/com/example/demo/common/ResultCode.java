package com.example.demo.common;

import org.omg.PortableInterceptor.ACTIVE;

/*****
 *@className: ResultCode
 *@date: 2021/3/26  16:35
 *@User: create By haha
 *
 */


public enum ResultCode {

    /* 成功状态码 */
    SUCCESS(0,"操作成功！"),

    /* 错误状态码 */
    FAIL(-1,"操作失败！"),

    ltvalidateFailed(20001, "用户名或密码错误"),
    PERMISSION_TOKEN_EXPIRED(20003, "token过期"),
    PERMISSION_TOKEN_INVALID(20004, "token解析异常"),
    PERMISSION_SIGNATURE_ERROR(2005, "token签名失败"),
    USER_NOT_LOGGED_IN(2006, "用户未登录，请先登录"),
    REQUEST_INFO_ERROR(30001, "输入信息为空"),
    HAS_BEAN_ONLINE(4001, "活动已上线"),
    BANNER_COUNT_MAX(5001, "banner在线数最大是6个"),
    ONLINE_ON_IN(5003, "当前banner已经上线"),
    ACTIVETIME_GREATER_DEACTIVETime(5004,"上线时间不能大于预约下线时间"),
    BANNER_SIZE_SIX(5005, "已达到banner最大上线个数"),
    ACTIVITY_TYPE_NOT_SAME(5006, "活动类型不能一致"),
    TimeOnline_LINE_TIME(5007, "预约上线时间不能小于当前时间"),
    TimeOnline_AFTER_OFFTIME(5008, "预约上线时间不能大于预约下线时间"),
    Banner_Max_Six(5009,"已到达banner最大上线个数，不能继续上线banner"),
    OFFLINE_ON_IN(5010, "当前banner已经下线"),
    Not_release_ISNOT_Offline(5011, "未上线banner不能下线"),
    TimeOfflineTime_Less_TimeOnlineTime(5012, "定时下线时间不能小于定时上线"),
    TimeOfflineTime_Less_OnlineTime(5012, "定时下线时间不能小于上线时间"),
    ;

    //操作代码
    private int code;
    //提示信息
    private String message;
    ResultCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int code(){
        return code;
    }

    public String message() {
        return message;
    }

    public void setCode(Integer code){
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
