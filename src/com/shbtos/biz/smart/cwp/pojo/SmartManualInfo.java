package com.shbtos.biz.smart.cwp.pojo;

import java.util.Date;

/**
 * Created by liuminhang on 2017/1/19.
 * 人工控``     制桥吊和舱位信息，用于某个舱和桥吊的作业进行人工安排
 */
public class SmartManualInfo {


    private Long berthId;//靠泊ID
    private Long hatchId;//舱ID
    private Long bayNo;//倍位号
    private String craneNo;// 桥吊号
    private Date craneExitTime;// 控制退出时间


    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getHatchId() {
        return hatchId;
    }

    public void setHatchId(Long hatchId) {
        this.hatchId = hatchId;
    }

    public Long getBayNo() {
        return bayNo;
    }

    public void setBayNo(Long bayNo) {
        this.bayNo = bayNo;
    }

    public String getCraneNo() {
        return craneNo;
    }

    public void setCraneNo(String craneNo) {
        this.craneNo = craneNo;
    }

    public Date getCraneExitTime() {
        return craneExitTime;
    }

    public void setCraneExitTime(Date craneExitTime) {
        this.craneExitTime = craneExitTime;
    }
}
