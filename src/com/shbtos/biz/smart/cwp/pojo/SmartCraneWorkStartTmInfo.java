package com.shbtos.biz.smart.cwp.pojo;

import java.util.Date;

/**
 * Created by csw on 2020/2/24.
 * Description: 桥机开工时间，以及桥机作业状态，主要自动发箱用于控制桥机是否可以发送指令
 */
public class SmartCraneWorkStartTmInfo {

    private String craneNo; //桥机编号
    private Date workStartTime; //桥机作业开始时间
    private String workStatus; //桥机作业状态  1：计划、4：作业/开工、5：暂停、9：完工

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

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }
}
