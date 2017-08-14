package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by liuminhang on 2017/1/19.
 * CWP舱量参数，用于决定那个舱先做
 * 人工干预点
 */
public class SmartHatchQuantityConfigureInfo {


    private Long berthId;//靠泊ID
    private Long batchId; //批次号
    private Long hatchId;//舱ID
    private Long workQuantity;// 作业量参数
    private int interveneLoad;// 作业量参数影响的作业量


    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Long getHatchId() {
        return hatchId;
    }

    public void setHatchId(Long hatchId) {
        this.hatchId = hatchId;
    }

    public Long getWorkQuantity() {
        return workQuantity;
    }

    public void setWorkQuantity(Long workQuantity) {
        this.workQuantity = workQuantity;
    }

    public int getInterveneLoad() {
        return interveneLoad;
    }

    public void setInterveneLoad(int interveneLoad) {
        this.interveneLoad = interveneLoad;
    }
}
