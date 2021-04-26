package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class BannerCeshi implements Serializable {
    private Integer bannerId;

    private String bannerTitle;

    private String imageUrl;

    private Integer bannerType;

    private Boolean bannerStatus;

    private Date createTime;

    private Date updateTime;

    private Date activeTime;

    private Date deactiveTime;

    private Date eventstartTime;

    private Date eventendTime;

    private Integer showOrder;

    private String httpUrl;

    private Integer clicksPv;

    private Integer clicksUv;

    private static final long serialVersionUID = 1L;

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerTitle() {
        return bannerTitle;
    }

    public void setBannerTitle(String bannerTitle) {
        this.bannerTitle = bannerTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getBannerType() {
        return bannerType;
    }

    public void setBannerType(Integer bannerType) {
        this.bannerType = bannerType;
    }

    public Boolean getBannerStatus() {
        return bannerStatus;
    }

    public void setBannerStatus(Boolean bannerStatus) {
        this.bannerStatus = bannerStatus;
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

    public Date getEventstartTime() {
        return eventstartTime;
    }

    public void setEventstartTime(Date eventstartTime) {
        this.eventstartTime = eventstartTime;
    }

    public Date getEventendTime() {
        return eventendTime;
    }

    public void setEventendTime(Date eventendTime) {
        this.eventendTime = eventendTime;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    public Integer getClicksPv() {
        return clicksPv;
    }

    public void setClicksPv(Integer clicksPv) {
        this.clicksPv = clicksPv;
    }

    public Integer getClicksUv() {
        return clicksUv;
    }

    public void setClicksUv(Integer clicksUv) {
        this.clicksUv = clicksUv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bannerId=").append(bannerId);
        sb.append(", bannerTitle=").append(bannerTitle);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", bannerType=").append(bannerType);
        sb.append(", bannerStatus=").append(bannerStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", activeTime=").append(activeTime);
        sb.append(", deactiveTime=").append(deactiveTime);
        sb.append(", eventstartTime=").append(eventstartTime);
        sb.append(", eventendTime=").append(eventendTime);
        sb.append(", showOrder=").append(showOrder);
        sb.append(", httpUrl=").append(httpUrl);
        sb.append(", clicksPv=").append(clicksPv);
        sb.append(", clicksUv=").append(clicksUv);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}