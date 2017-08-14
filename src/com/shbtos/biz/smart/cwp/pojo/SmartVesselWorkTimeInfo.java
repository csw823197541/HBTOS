package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by liuminhang on 2017/1/19.
 * CWP作业时间配置信息
 */
public class SmartVesselWorkTimeInfo {
    private Integer craneSpeed;//桥吊移动速度，米/秒
    private Integer crossBarTime;// 架起趴大梁，秒
    private Integer openHatchCoverTime;// 舱盖板开舱作业时间，秒
    private Integer closeHatchCoverTime;// 舱盖板关舱作业时间，秒

    public Integer getCraneSpeed() {
        return craneSpeed;
    }

    public void setCraneSpeed(Integer craneSpeed) {
        this.craneSpeed = craneSpeed;
    }

    public Integer getCrossBarTime() {
        return crossBarTime;
    }

    public void setCrossBarTime(Integer crossBarTime) {
        this.crossBarTime = crossBarTime;
    }

    public Integer getOpenHatchCoverTime() {
        return openHatchCoverTime;
    }

    public void setOpenHatchCoverTime(Integer openHatchCoverTime) {
        this.openHatchCoverTime = openHatchCoverTime;
    }

    public Integer getCloseHatchCoverTime() {
        return closeHatchCoverTime;
    }

    public void setCloseHatchCoverTime(Integer closeHatchCoverTime) {
        this.closeHatchCoverTime = closeHatchCoverTime;
    }
}
