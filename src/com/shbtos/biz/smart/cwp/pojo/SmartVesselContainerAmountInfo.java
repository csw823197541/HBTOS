package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by csw on 2018/9/16.
 * Description: 船舶干路图信息
 */
public class SmartVesselContainerAmountInfo {

    private Long berthId; // 靠泊ID
    private String dlType; // 装卸类型
    private String size; // 箱子尺寸
    private Integer containerAmount; // 箱量

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public String getDlType() {
        return dlType;
    }

    public void setDlType(String dlType) {
        this.dlType = dlType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getContainerAmount() {
        return containerAmount;
    }

    public void setContainerAmount(Integer containerAmount) {
        this.containerAmount = containerAmount;
    }
}
