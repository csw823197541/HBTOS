package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by csw on 2017/1/18.
 * Description: 船舶槽重设置
 */
public class SmartVesselTierWeightInfo {

    private Long berthId;//靠泊ID
    private Long hatchId;//舱ID
    private String bayId; //倍位ID
    private String htdkfg;//D：甲板、H：舱内
    private String startTierNo;//开始层
    private String endTierNo;// 结束层
    private Double startWeight;//偏差小重量
    private Double endWeight;// 偏差大重量
    private String heavyPressLight;// 重压轻

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getHatchId() {
        return hatchId;
    }

    public void setHatchId(Long hatchId) {
        this.hatchId = hatchId;
    }

    public String getBayId() {
        return bayId;
    }

    public void setBayId(String bayId) {
        this.bayId = bayId;
    }

    public String getHtdkfg() {
        return htdkfg;
    }

    public void setHtdkfg(String htdkfg) {
        this.htdkfg = htdkfg;
    }

    public String getStartTierNo() {
        return startTierNo;
    }

    public void setStartTierNo(String startTierNo) {
        this.startTierNo = startTierNo;
    }

    public String getEndTierNo() {
        return endTierNo;
    }

    public void setEndTierNo(String endTierNo) {
        this.endTierNo = endTierNo;
    }

    public Double getStartWeight() {
        return startWeight;
    }

    public void setStartWeight(Double startWeight) {
        this.startWeight = startWeight;
    }

    public Double getEndWeight() {
        return endWeight;
    }

    public void setEndWeight(Double endWeight) {
        this.endWeight = endWeight;
    }

    public String getHeavyPressLight() {
        return heavyPressLight;
    }

    public void setHeavyPressLight(String heavyPressLight) {
        this.heavyPressLight = heavyPressLight;
    }

}
