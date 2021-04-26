package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class RemindedInfo implements Serializable {
    private Long id;

    private Long userId;

    @ApiModelProperty(value = "提醒类型(0 ->邀请成功提醒 1-> 领取奖品提醒 2-> 奖品发货提醒)")
    private Integer remindedType;

    @ApiModelProperty(value = "是否提醒")
    private Boolean remindedStatus;

    @ApiModelProperty(value = "提醒时间")
    private Date remindedDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRemindedType() {
        return remindedType;
    }

    public void setRemindedType(Integer remindedType) {
        this.remindedType = remindedType;
    }

    public Boolean getRemindedStatus() {
        return remindedStatus;
    }

    public void setRemindedStatus(Boolean remindedStatus) {
        this.remindedStatus = remindedStatus;
    }

    public Date getRemindedDate() {
        return remindedDate;
    }

    public void setRemindedDate(Date remindedDate) {
        this.remindedDate = remindedDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", remindedType=").append(remindedType);
        sb.append(", remindedStatus=").append(remindedStatus);
        sb.append(", remindedDate=").append(remindedDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}