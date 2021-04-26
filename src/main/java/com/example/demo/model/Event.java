package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {
    private Long id;

    @ApiModelProperty(value = "标题名称")
    private String title;

    @ApiModelProperty(value = "活动主图")
    private String mainImageUrl;

    @ApiModelProperty(value = "用户获奖次数")
    private Integer userRewardCount;

    @ApiModelProperty(value = "活动状态((0 -> 未开始,  1 ->进行中, 2 -> 已结束)")
    private Integer eventStatus;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "活动类型(0 ->邀请试驾)")
    private Integer eventType;

    @ApiModelProperty(value = "活动开始时间")
    private Date startDatetime;

    @ApiModelProperty(value = "活动结束时间")
    private Date endDatetime;

    @ApiModelProperty(value = "是否删除")
    private Boolean deletedStatus;

    @ApiModelProperty(value = "活动规则")
    private String mainHtml;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    public Integer getUserRewardCount() {
        return userRewardCount;
    }

    public void setUserRewardCount(Integer userRewardCount) {
        this.userRewardCount = userRewardCount;
    }

    public Integer getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(Integer eventStatus) {
        this.eventStatus = eventStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public Date getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(Date startDatetime) {
        this.startDatetime = startDatetime;
    }

    public Date getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(Date endDatetime) {
        this.endDatetime = endDatetime;
    }

    public Boolean getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(Boolean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public String getMainHtml() {
        return mainHtml;
    }

    public void setMainHtml(String mainHtml) {
        this.mainHtml = mainHtml;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", mainImageUrl=").append(mainImageUrl);
        sb.append(", userRewardCount=").append(userRewardCount);
        sb.append(", eventStatus=").append(eventStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", eventType=").append(eventType);
        sb.append(", startDatetime=").append(startDatetime);
        sb.append(", endDatetime=").append(endDatetime);
        sb.append(", deletedStatus=").append(deletedStatus);
        sb.append(", mainHtml=").append(mainHtml);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}