package com.shbtos.biz.smart.cwp.pojo;

import java.util.Date;

/**
 * Created by csw on 2020/02/24.
 * Description: 轨道吊维修计划信息
 */
public class SmartAscMaintainPlanInfo {

    private Long areaNo; // 箱区
    private Long ascNo; // 机械号
    private Date maintainStartTime; // 维护开始时间
    private Date maintainEndTime; // 维护结束时间


    public Date getMaintainEndTime() {
        return maintainEndTime;
    }

    public void setMaintainEndTime(Date maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
    }

    public Long getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(Long areaNo) {
        this.areaNo = areaNo;
    }

    public Long getAscNo() {
        return ascNo;
    }

    public void setAscNo(Long ascNo) {
        this.ascNo = ascNo;
    }

    public Date getMaintainStartTime() {
        return maintainStartTime;
    }

    public void setMaintainStartTime(Date maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
    }


}
