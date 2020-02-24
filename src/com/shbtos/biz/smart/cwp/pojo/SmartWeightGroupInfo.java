package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by csw on 2018/9/16.
 * Description: 重量等级分组
 */
public class SmartWeightGroupInfo {

    private Long berthId;//靠泊ID
    private Long weightId; //重量等级ID
    private Double minWeight;//最小重量
    private Double maxWeight;//最大重量

    public Double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Double minWeight) {
        this.minWeight = minWeight;
    }

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

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

}
