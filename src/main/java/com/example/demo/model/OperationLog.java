package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class OperationLog implements Serializable {
    private Long id;

    @ApiModelProperty(value = "数据库表名")
    private String operationTag;

    @ApiModelProperty(value = "数据库表记录id对应的操作日志")
    private Long operationTagId;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "操作人ID")
    private Long operatorId;

    @ApiModelProperty(value = "操作时间")
    private Date operateTime;

    @ApiModelProperty(value = "操作类型(0 -> 新增  1 -> 更新 2 -> 删除)")
    private Integer operateType;

    @ApiModelProperty(value = "操作事项")
    private String operationMatter;

    @ApiModelProperty(value = "操作内容")
    private String operationContent;

    @ApiModelProperty(value = "操作前数据")
    private String beforeOperationData;

    @ApiModelProperty(value = "操作后数据")
    private String afterOperationData;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationTag() {
        return operationTag;
    }

    public void setOperationTag(String operationTag) {
        this.operationTag = operationTag;
    }

    public Long getOperationTagId() {
        return operationTagId;
    }

    public void setOperationTagId(Long operationTagId) {
        this.operationTagId = operationTagId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public String getOperationMatter() {
        return operationMatter;
    }

    public void setOperationMatter(String operationMatter) {
        this.operationMatter = operationMatter;
    }

    public String getOperationContent() {
        return operationContent;
    }

    public void setOperationContent(String operationContent) {
        this.operationContent = operationContent;
    }

    public String getBeforeOperationData() {
        return beforeOperationData;
    }

    public void setBeforeOperationData(String beforeOperationData) {
        this.beforeOperationData = beforeOperationData;
    }

    public String getAfterOperationData() {
        return afterOperationData;
    }

    public void setAfterOperationData(String afterOperationData) {
        this.afterOperationData = afterOperationData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operationTag=").append(operationTag);
        sb.append(", operationTagId=").append(operationTagId);
        sb.append(", operator=").append(operator);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", operateType=").append(operateType);
        sb.append(", operationMatter=").append(operationMatter);
        sb.append(", operationContent=").append(operationContent);
        sb.append(", beforeOperationData=").append(beforeOperationData);
        sb.append(", afterOperationData=").append(afterOperationData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}