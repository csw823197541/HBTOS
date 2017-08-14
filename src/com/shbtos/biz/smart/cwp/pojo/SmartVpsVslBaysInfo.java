package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by liuminhang on 2017/1/18.
 * 倍位信息（暂不考虑一个舱内多于两个贝位的情况）
 */
public class SmartVpsVslBaysInfo {

    private String vesselCode; //船舶代码
    private Long bayId;//倍位ID
    private String bayNo;//倍位号
    private Long hatchId;//舱ID
    private String deckOrHatch;//D：甲板、H：舱内
    //贝位中心位置由CWP计算

    public Long getBayId() {
        return bayId;
    }

    public void setBayId(Long bayId) {
        this.bayId = bayId;
    }

    public String getBayNo() {
        return bayNo;
    }

    public void setBayNo(String bayNo) {
        this.bayNo = bayNo;
    }

    public Long getHatchId() {
        return hatchId;
    }

    public void setHatchId(Long hatchId) {
        this.hatchId = hatchId;
    }

    public String getVesselCode() {
        return vesselCode;
    }

    public void setVesselCode(String vesselCode) {
        this.vesselCode = vesselCode;
    }

    public String getDeckOrHatch() {
        return deckOrHatch;
    }

    public void setDeckOrHatch(String deckOrHatch) {
        this.deckOrHatch = deckOrHatch;
    }

}
