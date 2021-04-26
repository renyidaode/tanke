package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Banner implements Serializable {
    private Long id;

    @ApiModelProperty(value = "banner图")
    private String imageUrl;

    @ApiModelProperty(value = "跳转链接内容")
    private String httpUrl;

    @ApiModelProperty(value = "活动ID")
    private Long eventId;

    @ApiModelProperty(value = "banner内容类型(0 -> 跳转链接内容 1 -> 跳转图文内容 2 -> 活动)")
    private Integer type;

    @ApiModelProperty(value = "排序")
    private Integer showOrder;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "是否上线")
    private Boolean activeStatus;

    @ApiModelProperty(value = "上线时间")
    private Date activeTime;

    @ApiModelProperty(value = "下线时间")
    private Date deactiveTime;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "定时上线时间")
    private Date timedActiveTime;

    @ApiModelProperty(value = "定时下线时间")
    private Date timedDeactiveTime;

    @ApiModelProperty(value = "是否删除")
    private Boolean deletedStatus;

    @ApiModelProperty(value = "跳转图文内容")
    private String graphic;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Date getDeactiveTime() {
        return deactiveTime;
    }

    public void setDeactiveTime(Date deactiveTime) {
        this.deactiveTime = deactiveTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTimedActiveTime() {
        return timedActiveTime;
    }

    public void setTimedActiveTime(Date timedActiveTime) {
        this.timedActiveTime = timedActiveTime;
    }

    public Date getTimedDeactiveTime() {
        return timedDeactiveTime;
    }

    public void setTimedDeactiveTime(Date timedDeactiveTime) {
        this.timedDeactiveTime = timedDeactiveTime;
    }

    public Boolean getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(Boolean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", httpUrl=").append(httpUrl);
        sb.append(", eventId=").append(eventId);
        sb.append(", type=").append(type);
        sb.append(", showOrder=").append(showOrder);
        sb.append(", createTime=").append(createTime);
        sb.append(", activeStatus=").append(activeStatus);
        sb.append(", activeTime=").append(activeTime);
        sb.append(", deactiveTime=").append(deactiveTime);
        sb.append(", title=").append(title);
        sb.append(", timedActiveTime=").append(timedActiveTime);
        sb.append(", timedDeactiveTime=").append(timedDeactiveTime);
        sb.append(", deletedStatus=").append(deletedStatus);
        sb.append(", graphic=").append(graphic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}