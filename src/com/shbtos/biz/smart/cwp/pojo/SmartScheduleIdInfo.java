package com.shbtos.biz.smart.cwp.pojo;

import java.util.Date;

/**
 * Created by liuminhang on 2017/1/19.
 * 航次信息，计划开工和完工时间是用进口和出口时间的最大范围时间，用于估算船舶船期和作业时间。
 */
public class SmartScheduleIdInfo {
    private Long berthId;//靠泊ID
    private String vesselCode;//船舶CD
    private String vesselType;//船舶类型，FCS大船，BAR驳船
    private Date planBeginWorkTime;//计划开工时间
    private Date planEndWorkTime;//计划完工时间
    private Long planStartPst;//船头停泊位置
    private Long planEndPst;//船尾停泊位置
    private String planBerthDirect;//靠泊方向,R:反向，L:正向
    private String maintainCwp;//保留当前CWP不做更改，用于刚开工的时候部分桥吊作业和部分桥吊辅助作业，用于全船 ***
    private Boolean sendWorkInstruction;//是否发送该船指令标记

    public Boolean getSendWorkInstruction() {
        return sendWorkInstruction;
    }

    public void setSendWorkInstruction(Boolean sendWorkInstruction) {
        this.sendWorkInstruction = sendWorkInstruction;
    }

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public String getVesselCode() {
        return vesselCode;
    }

    public void setVesselCode(String vesselCode) {
        this.vesselCode = vesselCode;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }

    public Date getPlanBeginWorkTime() {
        return planBeginWorkTime;
    }

    public void setPlanBeginWorkTime(Date planBeginWorkTime) {
        this.planBeginWorkTime = planBeginWorkTime;
    }

    public Date getPlanEndWorkTime() {
        return planEndWorkTime;
    }

    public void setPlanEndWorkTime(Date planEndWorkTime) {
        this.planEndWorkTime = planEndWorkTime;
    }

    public Long getPlanStartPst() {
        return planStartPst;
    }

    public void setPlanStartPst(Long planStartPst) {
        this.planStartPst = planStartPst;
    }

    public Long getPlanEndPst() {
        return planEndPst;
    }

    public void setPlanEndPst(Long planEndPst) {
        this.planEndPst = planEndPst;
    }

    public String getPlanBerthDirect() {
        return planBerthDirect;
    }

    public void setPlanBerthDirect(String planBerthDirect) {
        this.planBerthDirect = planBerthDirect;
    }

    public String getMaintainCwp() {
        return maintainCwp;
    }

    public void setMaintainCwp(String maintainCwp) {
        this.maintainCwp = maintainCwp;
    }
}
