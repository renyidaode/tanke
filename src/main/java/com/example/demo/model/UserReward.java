package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserReward implements Serializable {
    private Long id;

    @ApiModelProperty(value = "奖品名称")
    private String rewardName;

    @ApiModelProperty(value = "奖品图片")
    private String rewardImageUrl;

    @ApiModelProperty(value = "活动奖品ID")
    private Long eventRewardId;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "领奖时间")
    private Date collectDate;

    private Integer collectCount;

    @ApiModelProperty(value = "身份证号")
    private String idNumber;

    @ApiModelProperty(value = "获奖编号")
    private String rewardSn;

    @ApiModelProperty(value = "收货状态(0-> 待发货 1 -> 已发货)")
    private Integer takeStatus;

    @ApiModelProperty(value = "收货人姓名")
    private String takeName;

    @ApiModelProperty(value = "收货人手机号")
    private String takePhone;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "区")
    private String area;

    @ApiModelProperty(value = "详细地址")
    private String detailedAddress;

    @ApiModelProperty(value = "物流单号")
    private String logisticsNo;

    @ApiModelProperty(value = "物流公司")
    private String logisticsCompany;

    @ApiModelProperty(value = "是否删除")
    private Boolean deletedStatus;

    @ApiModelProperty(value = "发货时间")
    private Date deliveryDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }

    public String getRewardImageUrl() {
        return rewardImageUrl;
    }

    public void setRewardImageUrl(String rewardImageUrl) {
        this.rewardImageUrl = rewardImageUrl;
    }

    public Long getEventRewardId() {
        return eventRewardId;
    }

    public void setEventRewardId(Long eventRewardId) {
        this.eventRewardId = eventRewardId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getRewardSn() {
        return rewardSn;
    }

    public void setRewardSn(String rewardSn) {
        this.rewardSn = rewardSn;
    }

    public Integer getTakeStatus() {
        return takeStatus;
    }

    public void setTakeStatus(Integer takeStatus) {
        this.takeStatus = takeStatus;
    }

    public String getTakeName() {
        return takeName;
    }

    public void setTakeName(String takeName) {
        this.takeName = takeName;
    }

    public String getTakePhone() {
        return takePhone;
    }

    public void setTakePhone(String takePhone) {
        this.takePhone = takePhone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public Boolean getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(Boolean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rewardName=").append(rewardName);
        sb.append(", rewardImageUrl=").append(rewardImageUrl);
        sb.append(", eventRewardId=").append(eventRewardId);
        sb.append(", userId=").append(userId);
        sb.append(", collectDate=").append(collectDate);
        sb.append(", collectCount=").append(collectCount);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", rewardSn=").append(rewardSn);
        sb.append(", takeStatus=").append(takeStatus);
        sb.append(", takeName=").append(takeName);
        sb.append(", takePhone=").append(takePhone);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", detailedAddress=").append(detailedAddress);
        sb.append(", logisticsNo=").append(logisticsNo);
        sb.append(", logisticsCompany=").append(logisticsCompany);
        sb.append(", deletedStatus=").append(deletedStatus);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}