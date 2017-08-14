package com.shbtos.biz.smart.cwp.pojo;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by csw on 2017/4/10 21:18.
 * Explain: 堆场大计划
 */
public class SmartYardPlanInfo {

    private Long berthId; //靠泊Id
    private Long voyageId; //航次ID要
    private String areaNo; //箱区ID
    private String filter; //区间对放规则
    private Date planStartTime; //区间开始时间
    private Data planEndTime; //区间结束时间

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getVoyageId() {
        return voyageId;
    }

    public void setVoyageId(Long voyageId) {
        this.voyageId = voyageId;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Date getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    public Data getPlanEndTime() {
        return planEndTime;
    }

    public void setPlanEndTime(Data planEndTime) {
        this.planEndTime = planEndTime;
    }
}
