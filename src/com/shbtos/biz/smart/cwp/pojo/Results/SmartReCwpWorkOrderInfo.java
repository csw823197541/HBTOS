package com.shbtos.biz.smart.cwp.pojo.Results;

import java.util.Date;

/**
 * Created by csw on 2017/2/10 10:39.
 * Explain: cwp算法返回结果,一个箱子一个对象
 */
public class SmartReCwpWorkOrderInfo {

    private Long berthId; //靠泊ID
    private String craneNo; //桥机ID
    private Long hatchId; //舱ID
    private String bayNo;//倍位No
    private String vesselLocation; //船箱位：倍.排.层
    private String cszcsizecd; //箱尺寸
    private Long cwpwkmovenum;  //作业顺序
    private String workflow; //作业工艺
    private String lduldfg; //装卸船标志
    private Date workingStartTime; //计划开始作业时间
    private Date workingEndTime; //计划结束作业时间
    private Integer moveWorkTime; //每一个move的作业时间(单位是：秒)
    private Double cranePosition;//桥机当前位置
    private Integer qdc; //是否启动舱
    private Long planAmount;//生成大块是用到，一关一个对象
    private Long vpcCntrId; //箱指令唯一编号(指令模块专用)
    private String recycleWiFlag; //回收重排的指令标记，Y表示回收的指令；N或者null表示非回收的指令

    public String getRecycleWiFlag() {
        return recycleWiFlag;
    }

    public void setRecycleWiFlag(String recycleWiFlag) {
        this.recycleWiFlag = recycleWiFlag;
    }

    public Long getVpcCntrId() {
        return vpcCntrId;
    }

    public void setVpcCntrId(Long vpcCntrId) {
        this.vpcCntrId = vpcCntrId;
    }

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

    public Long getHatchId() {
        return hatchId;
    }

    public void setHatchId(Long hatchId) {
        this.hatchId = hatchId;
    }

    public String getBayNo() {
        return bayNo;
    }

    public void setBayNo(String bayNo) {
        this.bayNo = bayNo;
    }

    public String getVesselLocation() {
        return vesselLocation;
    }

    public void setVesselLocation(String vesselLocation) {
        this.vesselLocation = vesselLocation;
    }

    public String getCszcsizecd() {
        return cszcsizecd;
    }

    public void setCszcsizecd(String cszcsizecd) {
        this.cszcsizecd = cszcsizecd;
    }

    public Long getCwpwkmovenum() {
        return cwpwkmovenum;
    }

    public void setCwpwkmovenum(Long cwpwkmovenum) {
        this.cwpwkmovenum = cwpwkmovenum;
    }

    public String getWorkflow() {
        return workflow;
    }

    public void setWorkflow(String workflow) {
        this.workflow = workflow;
    }

    public String getLduldfg() {
        return lduldfg;
    }

    public void setLduldfg(String lduldfg) {
        this.lduldfg = lduldfg;
    }

    public Date getWorkingStartTime() {
        return workingStartTime;
    }

    public void setWorkingStartTime(Date workingStartTime) {
        this.workingStartTime = workingStartTime;
    }

    public Date getWorkingEndTime() {
        return workingEndTime;
    }

    public void setWorkingEndTime(Date workingEndTime) {
        this.workingEndTime = workingEndTime;
    }

    public Integer getMoveWorkTime() {
        return moveWorkTime;
    }

    public void setMoveWorkTime(Integer moveWorkTime) {
        this.moveWorkTime = moveWorkTime;
    }

    public Double getCranePosition() {
        return cranePosition;
    }

    public void setCranePosition(Double cranePosition) {
        this.cranePosition = cranePosition;
    }

    public Integer getQdc() {
        return qdc;
    }

    public void setQdc(Integer qdc) {
        this.qdc = qdc;
    }

    public Long getPlanAmount() {
        return planAmount;
    }

    public void setPlanAmount(Long planAmount) {
        this.planAmount = planAmount;
    }
}
