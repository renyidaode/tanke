package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Car implements Serializable {
    private Long id;

    @ApiModelProperty(value = "api返回的车型对外名称")
    private String carName;

    @ApiModelProperty(value = "api返回的车型id")
    private String carCode;

    @ApiModelProperty(value = "api返回的车型名称")
    private String carBackName;

    @ApiModelProperty(value = "是否显示")
    private Boolean showStatus;

    @ApiModelProperty(value = "主图url")
    private String mainImageUrl;

    @ApiModelProperty(value = "主图类型(0 -> 图片 1 -> 视频)")
    private Integer mainImageType;

    @ApiModelProperty(value = "全景看车图片URL")
    private String viewCarImageUrl;

    @ApiModelProperty(value = "全景看车跳转链接")
    private String viewCarRedirectUrl;

    @ApiModelProperty(value = "全景看车是否显示")
    private Boolean viewCarStatus;

    @ApiModelProperty(value = "参数配置封面图")
    private String carDetailImageUrl;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public String getCarBackName() {
        return carBackName;
    }

    public void setCarBackName(String carBackName) {
        this.carBackName = carBackName;
    }

    public Boolean getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Boolean showStatus) {
        this.showStatus = showStatus;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    public Integer getMainImageType() {
        return mainImageType;
    }

    public void setMainImageType(Integer mainImageType) {
        this.mainImageType = mainImageType;
    }

    public String getViewCarImageUrl() {
        return viewCarImageUrl;
    }

    public void setViewCarImageUrl(String viewCarImageUrl) {
        this.viewCarImageUrl = viewCarImageUrl;
    }

    public String getViewCarRedirectUrl() {
        return viewCarRedirectUrl;
    }

    public void setViewCarRedirectUrl(String viewCarRedirectUrl) {
        this.viewCarRedirectUrl = viewCarRedirectUrl;
    }

    public Boolean getViewCarStatus() {
        return viewCarStatus;
    }

    public void setViewCarStatus(Boolean viewCarStatus) {
        this.viewCarStatus = viewCarStatus;
    }

    public String getCarDetailImageUrl() {
        return carDetailImageUrl;
    }

    public void setCarDetailImageUrl(String carDetailImageUrl) {
        this.carDetailImageUrl = carDetailImageUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", carName=").append(carName);
        sb.append(", carCode=").append(carCode);
        sb.append(", carBackName=").append(carBackName);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", mainImageUrl=").append(mainImageUrl);
        sb.append(", mainImageType=").append(mainImageType);
        sb.append(", viewCarImageUrl=").append(viewCarImageUrl);
        sb.append(", viewCarRedirectUrl=").append(viewCarRedirectUrl);
        sb.append(", viewCarStatus=").append(viewCarStatus);
        sb.append(", carDetailImageUrl=").append(carDetailImageUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}