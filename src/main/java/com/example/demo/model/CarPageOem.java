package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CarPageOem implements Serializable {
    private Long id;

    @ApiModelProperty(value = "车型ID")
    private Long carId;

    @ApiModelProperty(value = "类型(0 -> 视频,  1 ->车型亮点( 图片), 2 -> 车主说(文章), 3-> 轮播图)")
    private Integer oemType;

    @ApiModelProperty(value = "排序")
    private Integer showOrder;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "是否删除")
    private Boolean deletedStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Integer getOemType() {
        return oemType;
    }

    public void setOemType(Integer oemType) {
        this.oemType = oemType;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        sb.append(", carId=").append(carId);
        sb.append(", oemType=").append(oemType);
        sb.append(", showOrder=").append(showOrder);
        sb.append(", title=").append(title);
        sb.append(", deletedStatus=").append(deletedStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}