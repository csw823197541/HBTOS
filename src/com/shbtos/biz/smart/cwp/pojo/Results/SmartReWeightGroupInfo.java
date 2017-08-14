package com.shbtos.biz.smart.cwp.pojo.Results;

/**
 * Created by csw on 2017/6/29.
 * Description:
 */
public class SmartReWeightGroupInfo {

    private Long berthId;//靠泊ID
    private Long weightId; //重量等级ID
    private Double minWeight;//最小重量
    private Double maxWeight;//最大重量
    private String modifyState;//重量等级修改状态，即是否为算法新增的字段："autoStowWeight"表示新增重量等级信息

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getWeightId() {
        return weightId;
    }

    public void setWeightId(Long weightId) {
        this.weightId = weightId;
    }

    public Double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Double minWeight) {
        this.minWeight = minWeight;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getModifyState() {
        return modifyState;
    }

    public void setModifyState(String modifyState) {
        this.modifyState = modifyState;
    }
}
