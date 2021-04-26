package com.example.demo.domain.responseDto;

import com.example.demo.enums.bannerStatusEnum;
import com.example.demo.enums.bannerTypeEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/*****
 *@className: bannerVO
 *@date: 2021/4/2  14:38
 *@User: create By haha
 *
 */

@Data
public class bannerInfoResponse {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "序号")
    private Integer showOrder;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "类型")
    private bannerTypeEnum bannerType;

    @ApiModelProperty(value = "状态")
    private bannerStatusEnum bannerStatus;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "上线时间")
    private Date activeTime;

    @ApiModelProperty(value = "下线时间")
    private Date deactiveTime;

    @ApiModelProperty(value = "点击量PV")
    private Integer clicksPv;

    @ApiModelProperty(value = "点击量UV")
    private Integer clicksUv;

    @ApiModelProperty(value = "活动开始时间")
    private Date eventStartTime;

    @ApiModelProperty(value = "活动结束时间")
    private Date eventEndTime;

}
