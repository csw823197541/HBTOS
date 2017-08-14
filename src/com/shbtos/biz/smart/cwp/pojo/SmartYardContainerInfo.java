package com.shbtos.biz.smart.cwp.pojo;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SmartYardContainerInfo {


    private Long berthId;//靠泊ID
    private Long voyageId;                     //航次ID
    private Long containerId;        //唯一箱id
    private String containerNo;        //箱号
    private String areaNo;             //箱所在箱区号
    private String ylocation;                 //场箱位
    private String ctypeCd;                   //箱型
    private String cszCsizecd;              //尺寸
    private String dstPort;                    //目的港
    private Double weight;                     //箱重
    private String dtpDnggcd;                      //是否危险品(Y,N)
    private String rfcfg;                      //是否冷藏(Y,N)
    private String UnNo; //危险品联合国编号
    private String stowagfg;                    //是否可配载
    private String isHeight; // 是否高箱
    private String heiCheightcd; //箱高代码
    private String effg;// 空/重标记

    private Date planStartWorkTime; //计划开始作业时间
    private Date planEndWorkTime; //计划结束作业时间
    private Integer workPlanCntNumber; //该箱子上面压着的的箱子数量
    private List<Long> wokPlanCntIdList; //该箱子上面压着的的箱子的箱Id,可以找到在场箱具体信息

    public String getHeiCheightcd() {
        return heiCheightcd;
    }

    public void setHeiCheightcd(String heiCheightcd) {
        this.heiCheightcd = heiCheightcd;
    }

    public String getEffg() {
        return effg;
    }

    public void setEffg(String effg) {
        this.effg = effg;
    }

    public Date getPlanStartWorkTime() {
        return planStartWorkTime;
    }

    public void setPlanStartWorkTime(Date planStartWorkTime) {
        this.planStartWorkTime = planStartWorkTime;
    }

    public Date getPlanEndWorkTime() {
        return planEndWorkTime;
    }

    public void setPlanEndWorkTime(Date planEndWorkTime) {
        this.planEndWorkTime = planEndWorkTime;
    }

    public Integer getWorkPlanCntNumber() {
        return workPlanCntNumber;
    }

    public void setWorkPlanCntNumber(Integer workPlanCntNumber) {
        this.workPlanCntNumber = workPlanCntNumber;
    }

    public List<Long> getWokPlanCntIdList() {
        return wokPlanCntIdList;
    }

    public void setWokPlanCntIdList(List<Long> wokPlanCntIdList) {
        this.wokPlanCntIdList = wokPlanCntIdList;
    }

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }


    public String getStowagfg() {
        return stowagfg;
    }

    public void setStowagfg(String stowagfg) {
        this.stowagfg = stowagfg;
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

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getYlocation() {
        return ylocation;
    }

    public void setYlocation(String ylocation) {
        this.ylocation = ylocation;
    }

    public String getCtypeCd() {
        return ctypeCd;
    }

    public void setCtypeCd(String ctypeCd) {
        this.ctypeCd = ctypeCd;
    }

    public String getCszCsizecd() {
        return cszCsizecd;
    }

    public void setCszCsizecd(String cszCsizecd) {
        this.cszCsizecd = cszCsizecd;
    }

    public String getDstPort() {
        return dstPort;
    }

    public void setDstPort(String dstPort) {
        this.dstPort = dstPort;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDtpDnggcd() {
        return dtpDnggcd;
    }

    public void setDtpDnggcd(String dtpDnggcd) {
        this.dtpDnggcd = dtpDnggcd;
    }

    public String getRfcfg() {
        return rfcfg;
    }

    public void setRfcfg(String rfcfg) {
        this.rfcfg = rfcfg;
    }

    public String getUnNo() {
        return UnNo;
    }

    public void setUnNo(String unNo) {
        UnNo = unNo;
    }

    public String getIsHeight() {
        return isHeight;
    }

    public void setIsHeight(String isHeight) {
        this.isHeight = isHeight;
    }
}

