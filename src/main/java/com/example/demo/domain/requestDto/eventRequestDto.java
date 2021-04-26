package com.example.demo.domain.requestDto;

import com.example.demo.enums.EventTypeEnum;
import com.example.demo.enums.eventStatusEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/*****
 *@className: eventRequestDto
 *@date: 2021/4/25  16:26
 *@User: create By haha
 *
 */

@Data
public class eventRequestDto {
    private Long id;

    @ApiModelProperty(value = "标题名称")
    private String title;

    @ApiModelProperty(value = "活动状态((0 -> 未开始,  1 ->进行中, 2 -> 已结束)")
    private eventStatusEnum eventStatus;

    @ApiModelProperty(value = "活动类型(0 ->邀请试驾)")
    private EventTypeEnum eventType;

    @ApiModelProperty(value = "活动开始时间")
    private Date startDatetime;

    @ApiModelProperty(value = "活动结束时间")
    private Date endDatetime;

}
