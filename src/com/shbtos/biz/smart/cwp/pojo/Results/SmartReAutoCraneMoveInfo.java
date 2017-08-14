package com.shbtos.biz.smart.cwp.pojo.Results;

/**
 * Created by Administrator on 2017/3/2.
 */
public class SmartReAutoCraneMoveInfo {

    private String craneNo;//作业的桥吊
    private Long berthId;         //靠泊ID
    private String bayNo;
    private Double currentCranePosition;//当前位置
    private Double toCranePosition;//当前位置

    public Double getToCranePosition() {
        return toCranePosition;
    }

    public void setToCranePosition(Double toCranePosition) {
        this.toCranePosition = toCranePosition;
    }

    public String getCraneNo() {
        return craneNo;
    }

    public void setCraneNo(String craneNo) {
        this.craneNo = craneNo;
    }

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public String getBayNo() {
        return bayNo;
    }

    public void setBayNo(String bayNo) {
        this.bayNo = bayNo;
    }

    public Double getCurrentCranePosition() {
        return currentCranePosition;
    }

    public void setCurrentCranePosition(Double currentCranePosition) {
        this.currentCranePosition = currentCranePosition;
    }


}
