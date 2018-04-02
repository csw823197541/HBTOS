package com.shbtos.biz.smart.cwp.pojo.Results;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/2.
 */
public class SmartReAutoWiInfo {

    private Long berthId; //靠泊Id
    private Long vpcCntrId; //指令唯一编号
    private String vLocation;   //船上位置
    private String yLocation; //场箱位
    private String craneNo;//作业的桥吊
    private Long cwpwkmovenum;
    private String workFlow;
    private Date workingStartTime;
    private Date workingEndTime;
    private Long yardContainerId; //在场箱Id
    private Integer overCntNum;
    private Long carryOrder; //装上AGV的顺序，同一序号的指令要同时给出
    private String cancelWork;

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getVpcCntrId() {
        return vpcCntrId;
    }

    public void setVpcCntrId(Long vpcCntrId) {
        this.vpcCntrId = vpcCntrId;
    }

    public String getvLocation() {
        return vLocation;
    }

    public void setvLocation(String vLocation) {
        this.vLocation = vLocation;
    }

    public String getyLocation() {
        return yLocation;
    }

    public void setyLocation(String yLocation) {
        this.yLocation = yLocation;
    }

    public String getCraneNo() {
        return craneNo;
    }

    public void setCraneNo(String craneNo) {
        this.craneNo = craneNo;
    }

    public Long getCwpwkmovenum() {
        return cwpwkmovenum;
    }

    public void setCwpwkmovenum(Long cwpwkmovenum) {
        this.cwpwkmovenum = cwpwkmovenum;
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

    public String getWorkFlow() {
        return workFlow;
    }

    public void setWorkFlow(String workFlow) {
        this.workFlow = workFlow;
    }

    public Long getCarryOrder() {
        return carryOrder;
    }

    public void setCarryOrder(Long carryOrder) {
        this.carryOrder = carryOrder;
    }

    public Long getYardContainerId() {
        return yardContainerId;
    }

    public void setYardContainerId(Long yardContainerId) {
        this.yardContainerId = yardContainerId;
    }

    public Integer getOverCntNum() {
        return overCntNum;
    }

    public void setOverCntNum(Integer overCntNum) {
        this.overCntNum = overCntNum;
    }

    public String getCancelWork() {
        return cancelWork;
    }

    public void setCancelWork(String cancelWork) {
        this.cancelWork = cancelWork;
    }
}
