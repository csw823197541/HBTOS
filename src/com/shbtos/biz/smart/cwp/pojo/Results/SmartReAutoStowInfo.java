package com.shbtos.biz.smart.cwp.pojo.Results;

/**
 * Created by Administrator on 2017/3/2.
 */
public class SmartReAutoStowInfo {

    private Long berthId;//靠泊Id
    private Long containerId; //箱Id
    private String containerNo; //箱号
    private String vlocation;   //船上位置
    private String ylocation;     //箱区位置
    private String cszCsizecd;        //尺寸
    private Long voyageId;    //出口航次信息
    private String unStowedReason;  //未配载原因
    private String stowOrder; //配载顺序

    public String getStowOrder() {
        return stowOrder;
    }

    public void setStowOrder(String stowOrder) {
        this.stowOrder = stowOrder;
    }

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public String getUnStowedReason() {
        return unStowedReason;
    }

    public void setUnStowedReason(String unStowedReason) {
        this.unStowedReason = unStowedReason;
    }

    public Long getVoyageId() {
        return voyageId;
    }

    public void setVoyageId(Long voyageId) {
        this.voyageId = voyageId;
    }

    public Long getContainerId() {
        return containerId;
    }

    public void setContainerId(Long containerId) {
        this.containerId = containerId;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public String getVlocation() {
        return vlocation;
    }

    public void setVlocation(String vlocation) {
        this.vlocation = vlocation;
    }

    public String getYlocation() {
        return ylocation;
    }

    public void setYlocation(String ylocation) {
        this.ylocation = ylocation;
    }

    public String getCszCsizecd() {
        return cszCsizecd;
    }

    public void setCszCsizecd(String cszCsizecd) {
        this.cszCsizecd = cszCsizecd;
    }



}
