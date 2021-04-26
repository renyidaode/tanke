package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TestDrive implements Serializable {
    private Long id;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "预约时间")
    private Date bookingDate;

    @ApiModelProperty(value = "经销商ID")
    private Long dealerId;

    @ApiModelProperty(value = "车型ID")
    private Long carId;

    @ApiModelProperty(value = "线索ID")
    private String crmId;

    @ApiModelProperty(value = "线索状态")
    private Integer crmStatus;

    @ApiModelProperty(value = "线索时间")
    private Date crmDriveDate;

    @ApiModelProperty(value = "邀请人用户ID")
    private Long inviteUserId;

    @ApiModelProperty(value = "邀请状态(0 -> 邀请成功  1 -> 已预约  2 -> 邀请失败)")
    private Integer inviteStatus;

    @ApiModelProperty(value = "邀请失败原因")
    private String inviteFailReason;

    @ApiModelProperty(value = "后台手动编辑试驾状态")
    private Boolean manuelEditDriveStatus;

    @ApiModelProperty(value = "活动ID")
    private Long eventId;

    @ApiModelProperty(value = "是否在邀请人兑换奖品中出现")
    private Boolean rewardCollectStatus;

    @ApiModelProperty(value = "是否算入邀请")
    private Boolean countInviteStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCrmId() {
        return crmId;
    }

    public void setCrmId(String crmId) {
        this.crmId = crmId;
    }

    public Integer getCrmStatus() {
        return crmStatus;
    }

    public void setCrmStatus(Integer crmStatus) {
        this.crmStatus = crmStatus;
    }

    public Date getCrmDriveDate() {
        return crmDriveDate;
    }

    public void setCrmDriveDate(Date crmDriveDate) {
        this.crmDriveDate = crmDriveDate;
    }

    public Long getInviteUserId() {
        return inviteUserId;
    }

    public void setInviteUserId(Long inviteUserId) {
        this.inviteUserId = inviteUserId;
    }

    public Integer getInviteStatus() {
        return inviteStatus;
    }

    public void setInviteStatus(Integer inviteStatus) {
        this.inviteStatus = inviteStatus;
    }

    public String getInviteFailReason() {
        return inviteFailReason;
    }

    public void setInviteFailReason(String inviteFailReason) {
        this.inviteFailReason = inviteFailReason;
    }

    public Boolean getManuelEditDriveStatus() {
        return manuelEditDriveStatus;
    }

    public void setManuelEditDriveStatus(Boolean manuelEditDriveStatus) {
        this.manuelEditDriveStatus = manuelEditDriveStatus;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Boolean getRewardCollectStatus() {
        return rewardCollectStatus;
    }

    public void setRewardCollectStatus(Boolean rewardCollectStatus) {
        this.rewardCollectStatus = rewardCollectStatus;
    }

    public Boolean getCountInviteStatus() {
        return countInviteStatus;
    }

    public void setCountInviteStatus(Boolean countInviteStatus) {
        this.countInviteStatus = countInviteStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", mobile=").append(mobile);
        sb.append(", bookingDate=").append(bookingDate);
        sb.append(", dealerId=").append(dealerId);
        sb.append(", carId=").append(carId);
        sb.append(", crmId=").append(crmId);
        sb.append(", crmStatus=").append(crmStatus);
        sb.append(", crmDriveDate=").append(crmDriveDate);
        sb.append(", inviteUserId=").append(inviteUserId);
        sb.append(", inviteStatus=").append(inviteStatus);
        sb.append(", inviteFailReason=").append(inviteFailReason);
        sb.append(", manuelEditDriveStatus=").append(manuelEditDriveStatus);
        sb.append(", eventId=").append(eventId);
        sb.append(", rewardCollectStatus=").append(rewardCollectStatus);
        sb.append(", countInviteStatus=").append(countInviteStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}