package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CarOemVideo implements Serializable {
    private Long id;

    @ApiModelProperty(value = "自定义车型模块ID")
    private Long carPageOemId;

    @ApiModelProperty(value = "视频封面URL")
    private String videoImageUrl;

    @ApiModelProperty(value = "视频URL")
    private String videoUrl;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarPageOemId() {
        return carPageOemId;
    }

    public void setCarPageOemId(Long carPageOemId) {
        this.carPageOemId = carPageOemId;
    }

    public String getVideoImageUrl() {
        return videoImageUrl;
    }

    public void setVideoImageUrl(String videoImageUrl) {
        this.videoImageUrl = videoImageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", carPageOemId=").append(carPageOemId);
        sb.append(", videoImageUrl=").append(videoImageUrl);
        sb.append(", videoUrl=").append(videoUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}