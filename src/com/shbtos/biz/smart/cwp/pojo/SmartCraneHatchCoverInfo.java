package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by liuminhang on 2017/1/19.
 * 舱盖板作业信息，描述舱盖板当前的状态
 */
public class SmartCraneHatchCoverInfo {
    private Long berthId;//靠泊ID
    private Long hatchCoverId;//舱盖板ID
    private String hatchCoverNo;//舱盖板编号
    private String coverLoctype;//舱盖板所在位置，V：在船上，S在岸边
    private Double coverLocX;//坐标位置
    private Double coverLocY; //坐标位置

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getHatchCoverId() {
        return hatchCoverId;
    }

    public void setHatchCoverId(Long hatchCoverId) {
        this.hatchCoverId = hatchCoverId;
    }

    public String getHatchCoverNo() {
        return hatchCoverNo;
    }

    public void setHatchCoverNo(String hatchCoverNo) {
        this.hatchCoverNo = hatchCoverNo;
    }

    public String getCoverLoctype() {
        return coverLoctype;
    }

    public void setCoverLoctype(String coverLoctype) {
        this.coverLoctype = coverLoctype;
    }

    public Double getCoverLocX() {
        return coverLocX;
    }

    public void setCoverLocX(Double coverLocX) {
        this.coverLocX = coverLocX;
    }

    public Double getCoverLocY() {
        return coverLocY;
    }

    public void setCoverLocY(Double coverLocY) {
        this.coverLocY = coverLocY;
    }
}
