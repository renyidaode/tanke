package com.example.demo.domain.responseDto;

import com.example.demo.enums.bannerStatusEnum;
import com.example.demo.enums.bannerTypeEnum;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static com.example.demo.enums.bannerStatusEnum.not_release;

/*****
 *@className: bannerReponse
 *@date: 2021/4/1  11:40
 *@User: create By haha
 *
 */

@Data
public class bannerResponse {

    private Long id;

    //标题
    private String title;

    //图片地址
    private String imageUrl;

    //跳转类型
    private bannerTypeEnum type;

    private final bannerStatusEnum activeStatus = not_release;

    //跳转Url地址
    private String httpUrl;

    //跳转图文详情
    private String graphic;

    //跳转活动Id
    private Long eventId;

}
