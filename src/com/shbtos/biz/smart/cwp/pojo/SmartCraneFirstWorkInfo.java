package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by csw on 2018/7/18.
 * Description: 桥机上手开路的倍位设置信息
 */
public class SmartCraneFirstWorkInfo {

    private Long berthId; //靠泊Id
    private String craneNo; //桥机号
    private String firstWorkBayNo; //桥机一开始选择作业的倍位
    private Long firstWorkAmount; //桥机一开始选择作业倍位的作业量，关数

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public String getCraneNo() {
        return craneNo;
    }

    public void setCraneNo(String craneNo) {
        this.craneNo = craneNo;
    }

    public String getFirstWorkBayNo() {
        return firstWorkBayNo;
    }

    public void setFirstWorkBayNo(String firstWorkBayNo) {
        this.firstWorkBayNo = firstWorkBayNo;
    }

    public Long getFirstWorkAmount() {
        return firstWorkAmount;
    }

    public void setFirstWorkAmount(Long firstWorkAmount) {
        this.firstWorkAmount = firstWorkAmount;
    }
}
