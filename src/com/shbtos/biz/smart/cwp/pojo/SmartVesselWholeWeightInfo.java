package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by liuminhang on 2017/1/19.
 *船舶重量分布信息，用于控制开路的优先和调整
 */
public class SmartVesselWholeWeightInfo {


    private String vesselHead;// 船首偏重
    private String vesselLeft;// 船舶左侧偏重
    private String vesselRight;// 船舶右侧偏重
    private String vesselEnd;// 船尾偏重
    private Long berthId;//靠泊ID
    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }
    public String getVesselHead() {
        return vesselHead;
    }

    public void setVesselHead(String vesselHead) {
        this.vesselHead = vesselHead;
    }

    public String getVesselLeft() {
        return vesselLeft;
    }

    public void setVesselLeft(String vesselLeft) {
        this.vesselLeft = vesselLeft;
    }

    public String getVesselRight() {
        return vesselRight;
    }

    public void setVesselRight(String vesselRight) {
        this.vesselRight = vesselRight;
    }

    public String getVesselEnd() {
        return vesselEnd;
    }

    public void setVesselEnd(String vesselEnd) {
        this.vesselEnd = vesselEnd;
    }
}
