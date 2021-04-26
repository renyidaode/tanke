package com.example.demo.domain.requestDto;

import com.example.demo.enums.bannerStatusEnum;
import com.example.demo.enums.bannerTypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static com.example.demo.enums.bannerStatusEnum.not_release;

/*****
 *@className: bannerRequest
 *@date: 2021/4/1  10:32
 *@User: create By haha
 *
 */

@Getter
@Setter
public class bannerRequest {

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
