package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by csw on 2018/9/16.
 * Description: 船箱位信息,只有小贝
 */
public class SmartVpsVslLocationsInfo {
    private String location;//船箱位,目前固定6位
    private String vesselCode;//船舶代码
    private Long bayId;// 倍位ID
    private String size;//位置类型（可以放20，或者40）
    private String bstructionLeft;// 左边障碍物，用于限制双吊具，奇数排为右侧
    private String bstructionRight;// 右边障碍物
    private String rffg;//冷藏箱位
    private String rfPoint;//冷藏箱插座
    private String highfg ;// 高箱位；平箱位；高、平箱混配
    private String twistlockType20;//
    private String twistlockType40;//

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVesselCode() {
        return vesselCode;
    }

    public void setVesselCode(String vesselCode) {
        this.vesselCode = vesselCode;
    }

    public Long getBayId() {
        return bayId;
    }

    public void setBayId(Long bayId) {
        this.bayId = bayId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBstructionLeft() {
        return bstructionLeft;
    }

    public void setBstructionLeft(String bstructionLeft) {
        this.bstructionLeft = bstructionLeft;
    }

    public String getBstructionRight() {
        return bstructionRight;
    }

    public void setBstructionRight(String bstructionRight) {
        this.bstructionRight = bstructionRight;
    }

    public String getRffg() {
        return rffg;
    }

    public void setRffg(String rffg) {
        this.rffg = rffg;
    }

    public String getRfPoint() {
        return rfPoint;
    }

    public void setRfPoint(String rfPoint) {
        this.rfPoint = rfPoint;
    }

    public String getHighfg() {
        return highfg;
    }

    public void setHighfg(String highfg) {
        this.highfg = highfg;
    }

    public String getTwistlockType20() {
        return twistlockType20;
    }

    public void setTwistlockType20(String twistlockType20) {
        this.twistlockType20 = twistlockType20;
    }

    public String getTwistlockType40() {
        return twistlockType40;
    }

    public void setTwistlockType40(String twistlockType40) {
        this.twistlockType40 = twistlockType40;
    }
}
