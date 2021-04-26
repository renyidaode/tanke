package com.example.demo.domain.requestDto;

import com.example.demo.enums.OnlineOffStatusEnum;
import lombok.Data;

import java.util.Date;

/*****
 *@className: bannerOnlineOffRequest
 *@date: 2021/4/19  11:19
 *@User: create By haha
 *
 */

@Data
public class bannerOnlineOffRequest {

    //bannerID
    private Long bannerId;

    //banner状态（0：立即上线，1：定时上线，2：立即下线，3:定时下线）
    private OnlineOffStatusEnum OnlineOffStatus;

    //预约上、下时间
    private Date prim;
}
