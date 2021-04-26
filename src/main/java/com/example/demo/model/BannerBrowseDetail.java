package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class BannerBrowseDetail implements Serializable {
    private Long id;

    private Long bannerId;

    private Long userId;

    @ApiModelProperty(value = "浏览时间")
    private Date browseDate;

    @ApiModelProperty(value = "是否首次浏览")
    private Boolean firstStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBannerId() {
        return bannerId;
    }

    public void setBannerId(Long bannerId) {
        this.bannerId = bannerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getBrowseDate() {
        return browseDate;
    }

    public void setBrowseDate(Date browseDate) {
        this.browseDate = browseDate;
    }

    public Boolean getFirstStatus() {
        return firstStatus;
    }

    public void setFirstStatus(Boolean firstStatus) {
        this.firstStatus = firstStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bannerId=").append(bannerId);
        sb.append(", userId=").append(userId);
        sb.append(", browseDate=").append(browseDate);
        sb.append(", firstStatus=").append(firstStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}