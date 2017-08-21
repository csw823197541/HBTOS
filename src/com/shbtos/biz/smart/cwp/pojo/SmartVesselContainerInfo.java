package com.shbtos.biz.smart.cwp.pojo;

import java.util.Date;

/**
 * Created by liuminhang on 2017/1/19.
 * 装船预配（或者实配）与卸船船图数据信息
 */
public class SmartVesselContainerInfo {

    private Long vpcCntrId; //箱指令唯一编号(指令模块专用)
    private String yardContainerId; //在场箱Id号(配载配的在场箱Id)
    private Long berthId;         //靠泊ID
    private Long voyageId;         //航次ID
    private Long hatchId;         //舱ID
    private String vLocation;		//船箱位
    private String yLocation;		//场箱位
    private String cSzCsizecd;     //箱尺寸
    private String cTypeCd;        //箱型
    private String effg;	//空重
    private String rfcfg;	//冷藏箱标记
    private String dtpDnggcd;	//危险品代码
    private String unNo; //危险品联合国编号
    private String isHeight; // 是否高箱
    private String ovlmtcd;		//超限代码
    private String heiCheightcd; //箱高代码
    private String dstPort;  //目的港
    private Double weight;         //重量
    private Long groupId;       //属性组
    private Long weightId;       //重量组
    private String craneNo;     //桥机号
    private Long cwpwkMoveNum;    //move顺序
    private String lduldfg;    //装卸船标志
    private String workflow;    //作业工艺
    private String throughFlag;  //过境箱标记
    private String containerNo;    //箱号
    private String containerStatus;    //箱状态
    private String workStatus;     //箱子作业状态: 发送A; 完成C,RC; 作业中W; 未发送Y,S,P; 退卸或退装R
    private Date workingStartTime;     //开始作业时间
    private Date workingEndTime;        //结束作业时间
    private Date manualPlanWorkStartTime; //人工设置的作业开始时间点
    private Date manualPlanWorkEndTime; //人工设置的作业结束时间点
    private Long containerWorkInterval; //作业时间
    private String assistWork;//附加作业：过高架，平板，钢丝绳
    private String manualFlag; //人工设置（人工指定该位置Move顺序，该Move之前的所有Move由人工决定，CWP算法排之后的顺序。）
    private String moveStage; //箱子移动状态
    private String machineStatus; //作业中的箱子有这个字段，作业这个箱子的机械状态
    private String interactLanetp; //箱子在AGV上，是否派发车道
    private String cntHeightDesc;//箱子具体高度描述
    private Boolean fixedWeightlevel; //是否指定重量等级
    private String cwoManualWorkflow; //人工指定作业工艺
    private String cwoManualSeqno; //人工指定作业顺序
    private String cwoManualWi; //人工锁定的船箱位，发箱时不能作业的箱子，CWP计划排到最后面
    private String cwoManualLocation; //发箱服务箱子交换规则中，指定不允许交换的船箱位

    public String getCwoManualWorkflow() {
        return cwoManualWorkflow;
    }

    public void setCwoManualWorkflow(String cwoManualWorkflow) {
        this.cwoManualWorkflow = cwoManualWorkflow;
    }

    public String getCwoManualSeqno() {
        return cwoManualSeqno;
    }

    public void setCwoManualSeqno(String cwoManualSeqno) {
        this.cwoManualSeqno = cwoManualSeqno;
    }

    public String getCwoManualWi() {
        return cwoManualWi;
    }

    public void setCwoManualWi(String cwoManualWi) {
        this.cwoManualWi = cwoManualWi;
    }

    public String getCwoManualLocation() {
        return cwoManualLocation;
    }

    public void setCwoManualLocation(String cwoManualLocation) {
        this.cwoManualLocation = cwoManualLocation;
    }

    public Boolean getFixedWeightlevel() {
        return fixedWeightlevel;
    }

    public void setFixedWeightlevel(Boolean fixedWeightlevel) {
        this.fixedWeightlevel = fixedWeightlevel;
    }

    public Long getVpcCntrId() {
        return vpcCntrId;
    }

    public void setVpcCntrId(Long vpcCntrId) {
        this.vpcCntrId = vpcCntrId;
    }

    public String getYardContainerId() {
        return yardContainerId;
    }

    public void setYardContainerId(String yardContainerId) {
        this.yardContainerId = yardContainerId;
    }

    public String getCntHeightDesc() {
        return cntHeightDesc;
    }

    public void setCntHeightDesc(String cntHeightDesc) {
        this.cntHeightDesc = cntHeightDesc;
    }

    public String getInteractLanetp() {
        return interactLanetp;
    }

    public void setInteractLanetp(String interactLanetp) {
        this.interactLanetp = interactLanetp;
    }

    public String getMachineStatus() {
        return machineStatus;
    }

    public void setMachineStatus(String machineStatus) {
        this.machineStatus = machineStatus;
    }

    public String getMoveStage() {
        return moveStage;
    }

    public void setMoveStage(String moveStage) {
        this.moveStage = moveStage;
    }

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getVoyageId() {
        return voyageId;
    }

    public void setVoyageId(Long voyageId) {
        this.voyageId = voyageId;
    }

    public Long getHatchId() {
        return hatchId;
    }

    public void setHatchId(Long hatchId) {
        this.hatchId = hatchId;
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

    public String getcSzCsizecd() {
        return cSzCsizecd;
    }

    public void setcSzCsizecd(String cSzCsizecd) {
        this.cSzCsizecd = cSzCsizecd;
    }

    public String getcTypeCd() {
        return cTypeCd;
    }

    public void setcTypeCd(String cTypeCd) {
        this.cTypeCd = cTypeCd;
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

    public String getDtpDnggcd() {
        return dtpDnggcd;
    }

    public void setDtpDnggcd(String dtpDnggcd) {
        this.dtpDnggcd = dtpDnggcd;
    }

    public String getOvlmtcd() {
        return ovlmtcd;
    }

    public void setOvlmtcd(String ovlmtcd) {
        this.ovlmtcd = ovlmtcd;
    }

    public String getHeiCheightcd() {
        return heiCheightcd;
    }

    public void setHeiCheightcd(String heiCheightcd) {
        this.heiCheightcd = heiCheightcd;
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

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getWeightId() {
        return weightId;
    }

    public void setWeightId(Long weightId) {
        this.weightId = weightId;
    }

    public String getCraneNo() {
        return craneNo;
    }

    public void setCraneNo(String craneNo) {
        this.craneNo = craneNo;
    }

    public Long getCwpwkMoveNum() {
        return cwpwkMoveNum;
    }

    public void setCwpwkMoveNum(Long cwpwkMoveNum) {
        this.cwpwkMoveNum = cwpwkMoveNum;
    }

    public String getLduldfg() {
        return lduldfg;
    }

    public void setLduldfg(String lduldfg) {
        this.lduldfg = lduldfg;
    }

    public String getWorkflow() {
        return workflow;
    }

    public void setWorkflow(String workflow) {
        this.workflow = workflow;
    }

    public String getThroughFlag() {
        return throughFlag;
    }

    public void setThroughFlag(String throughFlag) {
        this.throughFlag = throughFlag;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public String getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
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

    public Date getManualPlanWorkStartTime() {
        return manualPlanWorkStartTime;
    }

    public void setManualPlanWorkStartTime(Date manualPlanWorkStartTime) {
        this.manualPlanWorkStartTime = manualPlanWorkStartTime;
    }

    public Date getManualPlanWorkEndTime() {
        return manualPlanWorkEndTime;
    }

    public void setManualPlanWorkEndTime(Date manualPlanWorkEndTime) {
        this.manualPlanWorkEndTime = manualPlanWorkEndTime;
    }

    public Long getContainerWorkInterval() {
        return containerWorkInterval;
    }

    public void setContainerWorkInterval(Long containerWorkInterval) {
        this.containerWorkInterval = containerWorkInterval;
    }

    public String getAssistWork() {
        return assistWork;
    }

    public void setAssistWork(String assistWork) {
        this.assistWork = assistWork;
    }

    public String getManualFlag() {
        return manualFlag;
    }

    public void setManualFlag(String manualFlag) {
        this.manualFlag = manualFlag;
    }

    public String getUnNo() {
        return unNo;
    }

    public void setUnNo(String unNo) {
        this.unNo = unNo;
    }

    public String getIsHeight() {
        return isHeight;
    }

    public void setIsHeight(String isHeight) {
        this.isHeight = isHeight;
    }
}
