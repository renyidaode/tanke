package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CarOemTalk implements Serializable {
    private Long id;

    @ApiModelProperty(value = "文章链接")
    private String talkUrl;

    @ApiModelProperty(value = "通过(文章链接)获取标题")
    private String talkTitle;

    @ApiModelProperty(value = "通过(文章链接)获取封面")
    private String talkImageUrl;

    @ApiModelProperty(value = "自定义车型模块ID")
    private Long carPageOemId;

    @ApiModelProperty(value = "排序")
    private Integer showOrder;

    @ApiModelProperty(value = "ID")
    private String talkId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTalkUrl() {
        return talkUrl;
    }

    public void setTalkUrl(String talkUrl) {
        this.talkUrl = talkUrl;
    }

    public String getTalkTitle() {
        return talkTitle;
    }

    public void setTalkTitle(String talkTitle) {
        this.talkTitle = talkTitle;
    }

    public String getTalkImageUrl() {
        return talkImageUrl;
    }

    public void setTalkImageUrl(String talkImageUrl) {
        this.talkImageUrl = talkImageUrl;
    }

    public Long getCarPageOemId() {
        return carPageOemId;
    }

    public void setCarPageOemId(Long carPageOemId) {
        this.carPageOemId = carPageOemId;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    public String getTalkId() {
        return talkId;
    }

    public void setTalkId(String talkId) {
        this.talkId = talkId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", talkUrl=").append(talkUrl);
        sb.append(", talkTitle=").append(talkTitle);
        sb.append(", talkImageUrl=").append(talkImageUrl);
        sb.append(", carPageOemId=").append(carPageOemId);
        sb.append(", showOrder=").append(showOrder);
        sb.append(", talkId=").append(talkId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}