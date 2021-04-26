package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class EventReward implements Serializable {
    private Long id;

    @ApiModelProperty(value = "邀请人数")
    private Integer invitePeopleNumber;

    @ApiModelProperty(value = "奖品名称")
    private String name;

    @ApiModelProperty(value = "奖品数量")
    private Integer stock;

    @ApiModelProperty(value = "奖品图片")
    private String imageUrl;

    @ApiModelProperty(value = "活动ID")
    private Long eventId;

    @ApiModelProperty(value = "是否删除")
    private Boolean deletedStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInvitePeopleNumber() {
        return invitePeopleNumber;
    }

    public void setInvitePeopleNumber(Integer invitePeopleNumber) {
        this.invitePeopleNumber = invitePeopleNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Boolean getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(Boolean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", invitePeopleNumber=").append(invitePeopleNumber);
        sb.append(", name=").append(name);
        sb.append(", stock=").append(stock);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", eventId=").append(eventId);
        sb.append(", deletedStatus=").append(deletedStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}