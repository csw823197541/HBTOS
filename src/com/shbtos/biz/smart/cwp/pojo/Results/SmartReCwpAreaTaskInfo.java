package com.shbtos.biz.smart.cwp.pojo.Results;

import java.util.Date;

/**
 * Created by csw on 2018/7/16.
 * Description:
 */
public class SmartReCwpAreaTaskInfo {

    private Long berthId; //靠泊Id
    private String craneNo; //桥机号
    private String areaNo; //箱区号
    private Date startTime; //开始时间
    private Date endTime; //结束时间
    private Long groupId; //属性组Id;
    private Integer planCntNumber; //箱区计划出箱量
    private Integer cntOverNumber; //箱区计划翻箱量
    private String portCd; // 卸货港
    private String cszCsizecd; // 箱尺寸
    private String effg; // 空/重标记 （Y/N）
    private String rfcfg; // 冷藏箱标记 (Y/N)
    private String heiCheightcd; // 箱高代码(高箱或平箱) (Y/N)
    private String ctypeCd; // 箱型
    private String unNo; //危险品联合国编号

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

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getPortCd() {
        return portCd;
    }

    public void setPortCd(String portCd) {
        this.portCd = portCd;
    }

    public String getCszCsizecd() {
        return cszCsizecd;
    }

    public void setCszCsizecd(String cszCsizecd) {
        this.cszCsizecd = cszCsizecd;
    }

    public String getEffg() {
        return effg;
    }

    public void setEffg(String effg) {
        this.effg = effg;
    }

    public String getRfcfg() {
        return rfcfg;
    }

    public void setRfcfg(String rfcfg) {
        this.rfcfg = rfcfg;
    }

    public String getHeiCheightcd() {
        return heiCheightcd;
    }

    public void setHeiCheightcd(String heiCheightcd) {
        this.heiCheightcd = heiCheightcd;
    }

    public String getCtypeCd() {
        return ctypeCd;
    }

    public void setCtypeCd(String ctypeCd) {
        this.ctypeCd = ctypeCd;
    }

    public String getUnNo() {
        return unNo;
    }

    public void setUnNo(String unNo) {
        this.unNo = unNo;
    }

    public Integer getPlanCntNumber() {
        return planCntNumber;
    }

    public void setPlanCntNumber(Integer planCntNumber) {
        this.planCntNumber = planCntNumber;
    }

    public Integer getCntOverNumber() {
        return cntOverNumber;
    }

    public void setCntOverNumber(Integer cntOverNumber) {
        this.cntOverNumber = cntOverNumber;
    }
}
