package com.example.demo.domain.responseDto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/*****
 *@className: eventResponseDto
 *@date: 2021/4/25  15:52
 *@User: create By haha
 *
 */

@Data
public class eventResponseDto {

    private Long id;

    @ApiModelProperty(value = "标题名称")
    private String title;

    @ApiModelProperty(value = "活动类型(0 ->邀请试驾)")
    private Integer eventType;

    @ApiModelProperty(value = "活动状态((0 -> 未开始,  1 ->进行中, 2 -> 已结束)")
    private Integer eventStatus;

    @ApiModelProperty(value = "试驾车型")
    private String carResponseDtos;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "活动开始时间")
    private Date startDatetime;

    @ApiModelProperty(value = "活动结束时间")
    private Date endDatetime;

}
