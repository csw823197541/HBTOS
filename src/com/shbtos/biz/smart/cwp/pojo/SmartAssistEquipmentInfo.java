package com.shbtos.biz.smart.cwp.pojo;

import java.util.Date;

/**
 * Created by liuminhang on 2017/1/19.
 * 过高架、平板、集卡、集卡头等辅助作业信息，用于CWP错开辅助设备的调度
 */
public class SmartAssistEquipmentInfo {

    private String equipmentId; //设备编号
    private String equipmentType; //设备类型：高架、平板、集卡等
    private Date workStartTime; //作业开始时间
    private Date workEndTime; //作业结束时间
    private String isAvailable; //是否可用
    private Date availableTime; //如果不可用，下次可以使用的时间

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Date getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(Date availableTime) {
        this.availableTime = availableTime;
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
