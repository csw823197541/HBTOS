package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by liuminhang on 2017/1/19.
 * 工艺次序设置，用于控制每个舱的工艺安排
 */
public class SmartCraneWorkFlowInfo {

    private Long berthId;       //靠泊ID
    private Long hatchId;       //舱ID
    private String hatchNo;       //舱号
    private String deckOrHatch;//D：甲板、H：舱内
    private Boolean single;  //单吊具
    private Boolean twin;       //双箱吊
    private Boolean tandem;       //双吊具
    private String ldStrategy;//装卸策略，即边装边卸：BLD、一般装卸：LD，默认驳船不做边装边卸，大船能做边装边卸就做

    public String getLdStrategy() {
        return ldStrategy;
    }

    public void setLdStrategy(String ldStrategy) {
        this.ldStrategy = ldStrategy;
    }

    public String getDeckOrHatch() {
        return deckOrHatch;
    }

    public void setDeckOrHatch(String deckOrHatch) {
        this.deckOrHatch = deckOrHatch;
    }

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

    public String getHatchNo() {
        return hatchNo;
    }

    public void setHatchNo(String hatchNo) {
        this.hatchNo = hatchNo;
    }

    public Boolean getSingle() {
        return single;
    }

    public void setSingle(Boolean single) {
        this.single = single;
    }

    public Boolean getTwin() {
        return twin;
    }

    public void setTwin(Boolean twin) {
        this.twin = twin;
    }

    public Boolean getTandem() {
        return tandem;
    }

    public void setTandem(Boolean tandem) {
        this.tandem = tandem;
    }
}
