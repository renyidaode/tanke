package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Dealer implements Serializable {
    private Long id;

    @ApiModelProperty(value = "经销商名称")
    private String dealerName;

    @ApiModelProperty(value = "经销商地址")
    private String dealerAddress;

    @ApiModelProperty(value = "专营店号")
    private String dealerCode;

    @ApiModelProperty(value = "gps")
    private String dealerCoordinates;

    @ApiModelProperty(value = "区域ID")
    private Long areaId;

    @ApiModelProperty(value = "联系电话")
    private String contactNumber;

    @ApiModelProperty(value = "状态")
    private Integer dealerStatus;

    @ApiModelProperty(value = "是否删除")
    private Boolean deletedStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerAddress() {
        return dealerAddress;
    }

    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getDealerCoordinates() {
        return dealerCoordinates;
    }

    public void setDealerCoordinates(String dealerCoordinates) {
        this.dealerCoordinates = dealerCoordinates;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Integer getDealerStatus() {
        return dealerStatus;
    }

    public void setDealerStatus(Integer dealerStatus) {
        this.dealerStatus = dealerStatus;
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
        sb.append(", dealerName=").append(dealerName);
        sb.append(", dealerAddress=").append(dealerAddress);
        sb.append(", dealerCode=").append(dealerCode);
        sb.append(", dealerCoordinates=").append(dealerCoordinates);
        sb.append(", areaId=").append(areaId);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", dealerStatus=").append(dealerStatus);
        sb.append(", deletedStatus=").append(deletedStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}