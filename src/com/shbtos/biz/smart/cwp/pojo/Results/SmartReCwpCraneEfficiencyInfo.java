package com.shbtos.biz.smart.cwp.pojo.Results;

import java.util.Date;

/**
 * Created by csw on 2018/7/16.
 * Description:
 */
public class SmartReCwpCraneEfficiencyInfo {

    private Long berthId; //靠泊Id
    private String craneNo; //桥机号
    private Date startTime; //开始时间
    private Date endTime; //结束时间
    private Integer discCntNumber; //卸船箱量
    private Integer loadCntNumber; //装船箱量

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
}
