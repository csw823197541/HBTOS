package com.shbtos.biz.smart.cwp.pojo;

import java.util.Date;

/**
 * Created by liuminhang on 2017/1/18.
 * 可以安排桥吊的作业时间
 */
public class SmartCraneWorkPlanInfo {

    private String craneNo; //桥吊号
    private Long berthId; //作业船舶，靠泊Id
    private Date workStartTime; //作业开始时间
    private Date workEndTime; //作业结束时间

    public String getCraneNo() {
        return craneNo;
    }

    public void setCraneNo(String craneNo) {
        this.craneNo = craneNo;
    }

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
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
}
