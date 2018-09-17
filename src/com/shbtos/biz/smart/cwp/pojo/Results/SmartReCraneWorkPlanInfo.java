package com.shbtos.biz.smart.cwp.pojo.Results;

import java.util.Date;

/**
 * Created by csw on 2018/9/17.
 * Description:
 */
public class SmartReCraneWorkPlanInfo {

    private Long berthId;//靠泊ID
    private String craneNo;//桥机ID
    private Date workingStartTime;  //开始作业时间
    private Date workingEndTime;   //结束作业时间

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

    public Date getWorkingStartTime() {
        return workingStartTime;
    }

    public void setWorkingStartTime(Date workingStartTime) {
        this.workingStartTime = workingStartTime;
    }

    public Date getWorkingEndTime() {
        return workingEndTime;
    }

    public void setWorkingEndTime(Date workingEndTime) {
        this.workingEndTime = workingEndTime;
    }
}
