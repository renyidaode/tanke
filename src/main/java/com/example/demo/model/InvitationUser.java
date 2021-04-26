package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class InvitationUser implements Serializable {
    private Long id;

    @ApiModelProperty(value = "用户获奖ID")
    private Long userRewardId;

    @ApiModelProperty(value = "预约试驾ID")
    private Long testDriveId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserRewardId() {
        return userRewardId;
    }

    public void setUserRewardId(Long userRewardId) {
        this.userRewardId = userRewardId;
    }

    public Long getTestDriveId() {
        return testDriveId;
    }

    public void setTestDriveId(Long testDriveId) {
        this.testDriveId = testDriveId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userRewardId=").append(userRewardId);
        sb.append(", testDriveId=").append(testDriveId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}