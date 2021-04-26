package com.example.demo.domain.requestDto;

import com.example.demo.enums.bannerStatusEnum;
import lombok.Data;

import java.util.Date;

/*****
 *@className: bannerInfoRequest
 *@date: 2021/4/13  15:58
 *@User: create By haha
 *
 */

@Data
public class bannerInfoRequest {

    private String title;

    private bannerStatusEnum bannerStatus;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date activeTime;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date deactiveTime;

    private Integer page = 1;//页码

    private Integer size = 10;//条数

}
