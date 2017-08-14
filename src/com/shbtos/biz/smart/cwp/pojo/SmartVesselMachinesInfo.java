package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by liuminhang on 2017/1/18.
 * 船舶机械信息，包括驾驶台和烟囱等信息，用于计算舱和舱的距离和隔驾驶台同时作业等情况
 */
public class SmartVesselMachinesInfo {
    private String vesselCode; //船舶代码
    private String machineNo; //机械编号
    private String machineType;//机械类型
    private Double machineWidth;//宽度
    private Double  machineHeight;//高度
    private Double machinePosition;//相对于船头的位置

    public String getVesselCode() {
        return vesselCode;
    }

    public void setVesselCode(String vesselCode) {
        this.vesselCode = vesselCode;
    }

    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public Double getMachineWidth() {
        return machineWidth;
    }

    public void setMachineWidth(Double machineWidth) {
        this.machineWidth = machineWidth;
    }

    public Double getMachineHeight() {
        return machineHeight;
    }

    public void setMachineHeight(Double machineHeight) {
        this.machineHeight = machineHeight;
    }

    public Double getMachinePosition() {
        return machinePosition;
    }

    public void setMachinePosition(Double machinePosition) {
        this.machinePosition = machinePosition;
    }
}
