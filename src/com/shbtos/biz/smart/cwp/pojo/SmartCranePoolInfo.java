package com.shbtos.biz.smart.cwp.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2017/2/21.
 */
public class SmartCranePoolInfo {

    private Long poolId;         //桥吊池ID
    private String craneNo;//桥吊ID
    private Date workStartTime;//作业开始时间
    private Date workEndTime;//作业结束时间
    private String bayNo; //桥机选择作业的倍位
    private Long planAmount; //桥机选择作业倍位的作业量

    public Long getPoolId() {
        return poolId;
    }

    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }

    public String getCraneNo() {
        return craneNo;
    }

    public void setCraneNo(String craneNo) {
        this.craneNo = craneNo;
    }

    public Date getWorkStartTime() {
        return workStartTime;
    }

    public void setWorkStartTime(Date workStartTime) {
        this.workStartTime = workStartTime;
    }

    public Date getWorkEndTime() {
        return workEndTime;
    }

    public void setWorkEndTime(Date workEndTime) {
        this.workEndTime = workEndTime;
    }

    public String getBayNo() {
        return bayNo;
    }

    public void setBayNo(String bayNo) {
        this.bayNo = bayNo;
    }

    public Long getPlanAmount() {
        return planAmount;
    }

    public void setPlanAmount(Long planAmount) {
        this.planAmount = planAmount;
    }
}
