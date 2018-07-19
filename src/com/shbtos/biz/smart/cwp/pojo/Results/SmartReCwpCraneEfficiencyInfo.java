package com.shbtos.biz.smart.cwp.pojo.Results;

import java.util.Date;

/**
 * Created by csw on 2018/7/16.
 * Description:
 */
public class SmartReCwpCraneEfficiencyInfo {

    private Long berthId; //靠泊Id
    private String craneNo; //桥机号
    private String dlType; //装、卸类型
    private Date startTime; //开始时间
    private Date endTime; //结束时间
    private Integer discCntNumber; //卸船箱量
    private Integer loadCntNumber; //装船箱量
    private Double planWorkTime; //桥机计划作业时间，小时
    private Double planWorkEfficiency; //计划作业效率，关/小时
    private Integer dangerCntNumber; //桥机作业危险品的箱量
    private Integer overLimitCntNumber; //桥机作业超限箱箱量，超限箱定义箱型为OT,FR，超限代码为OW,OH,OL,O

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public String getCraneNo() {
        return craneNo;
    }

    public void setCraneNo(String craneNo) {
        this.craneNo = craneNo;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getDiscCntNumber() {
        return discCntNumber;
    }

    public void setDiscCntNumber(Integer discCntNumber) {
        this.discCntNumber = discCntNumber;
    }

    public Integer getLoadCntNumber() {
        return loadCntNumber;
    }

    public void setLoadCntNumber(Integer loadCntNumber) {
        this.loadCntNumber = loadCntNumber;
    }

    public Double getPlanWorkTime() {
        return planWorkTime;
    }

    public void setPlanWorkTime(Double planWorkTime) {
        this.planWorkTime = planWorkTime;
    }

    public Double getPlanWorkEfficiency() {
        return planWorkEfficiency;
    }

    public void setPlanWorkEfficiency(Double planWorkEfficiency) {
        this.planWorkEfficiency = planWorkEfficiency;
    }

    public Integer getDangerCntNumber() {
        return dangerCntNumber;
    }

    public void setDangerCntNumber(Integer dangerCntNumber) {
        this.dangerCntNumber = dangerCntNumber;
    }

    public Integer getOverLimitCntNumber() {
        return overLimitCntNumber;
    }

    public void setOverLimitCntNumber(Integer overLimitCntNumber) {
        this.overLimitCntNumber = overLimitCntNumber;
    }

    public String getDlType() {
        return dlType;
    }

    public void setDlType(String dlType) {
        this.dlType = dlType;
    }
}
