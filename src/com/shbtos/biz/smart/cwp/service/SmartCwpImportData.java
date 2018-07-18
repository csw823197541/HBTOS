package com.shbtos.biz.smart.cwp.service;


import com.shbtos.biz.smart.cwp.pojo.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuminhang on 2017/2/9.
 * 用于传入CWP所需参数
 */
public class SmartCwpImportData {

    private List<SmartAdviseConfigureInfo> smartAdviseConfigureInfoList;
    private List<SmartAreaContainerInfo> smartAreaContainerInfoList;
    private List<SmartAssistEquipmentInfo> smartAssistEquipmentInfoList;
    private List<SmartContainerGroupInfo> smartContainerGroupInfoList;
    private List<SmartCraneBaseInfo> smartCraneBaseInfoList;
    private List<SmartCraneHatchCoverInfo> smartCraneHatchCoverInfoList;
    private List<SmartCraneWorkFlowInfo> smartCraneWorkFlowInfoList;
    private List<SmartCraneWorkTimeInfo> smartCraneWorkTimeInfoList;
    private List<SmartHatchQuantityConfigureInfo> smartHatchQuantityConfigureInfoList;
    private List<SmartManualInfo> smartManualInfoList;
    private List<SmartScheduleIdInfo> smartScheduleIdInfoList;
    private List<SmartStowageLockLocationsInfo> smartStowageLockLocationsInfoList;
    private List<SmartVesselContainerInfo> smartVesselContainerInfoList;
    private List<SmartVesselMachinesInfo> smartVesselMachinesInfoList;
    private List<SmartVesselWholeWeightInfo> smartVesselWholeWeightInfoList;
    private List<SmartVesselWorkTimeInfo> smartVesselWorkTimeInfoList;
    private List<SmartVpsVslBaysInfo> smartVpsVslBaysInfoList;
    private List<SmartVpsVslHatchcoversInfo> smartVpsVslHatchcoversInfoList;
    private List<SmartVpsVslHatchsInfo> smartVpsVslHatchsInfoList;
    private List<SmartVpsVslLocationsInfo> smartVpsVslLocationsInfoList;
    private List<SmartVpsVslRowsInfo> smartVpsVslRowsInfoList;
    private List<SmartCranePoolInfo> smartCranePoolInfoList;
    private List<SmartVesselCranePoolInfo> smartVesselCranePoolInfoList;
    private List<SmartCranePlanInfo> smartCranePlanInfoList;
    private List<SmartCraneMaintainPlanInfo> smartCraneMaintainPlanInfoList;
    private List<SmartCraneMoveRangeInfo> smartCraneMoveRangeInfoList;

    private List<SmartCwpConfigurationInfo> smartCwpConfigurationInfoList;
    private List<SmartCraneAddOrDelInfo> smartCraneAddOrDelInfoList;
    private List<SmartCwpWorkBlockInfo> smartCwpWorkBlockInfoList;
    private List<SmartCwpParameterInfo> smartCwpParameterInfoList;
    private List<SmartCraneFirstWorkInfo> smartCraneFirstWorkInfoList;

    public SmartCwpImportData(){
        this.smartAdviseConfigureInfoList = new ArrayList<>();
        this.smartAreaContainerInfoList = new ArrayList<>();
        this.smartAssistEquipmentInfoList = new ArrayList<>();
        this.smartContainerGroupInfoList = new ArrayList<>();
        this.smartCraneBaseInfoList = new ArrayList<>();
        this.smartCraneHatchCoverInfoList = new ArrayList<>();
        this.smartCraneWorkFlowInfoList = new ArrayList<>();
        this.smartCraneWorkTimeInfoList = new ArrayList<>();
        this.smartHatchQuantityConfigureInfoList = new ArrayList<>();
        this.smartManualInfoList = new ArrayList<>();
        this.smartScheduleIdInfoList = new ArrayList<>();
        this.smartStowageLockLocationsInfoList = new ArrayList<>();
        this.smartVesselContainerInfoList = new ArrayList<>();
        this.smartVesselMachinesInfoList = new ArrayList<>();
        this.smartVesselWholeWeightInfoList = new ArrayList<>();
        this.smartVesselWorkTimeInfoList = new ArrayList<>();
        this.smartVpsVslBaysInfoList = new ArrayList<>();
        this.smartVpsVslHatchcoversInfoList = new ArrayList<>();
        this.smartVpsVslHatchsInfoList = new ArrayList<>();
        this.smartVpsVslLocationsInfoList = new ArrayList<>();
        this.smartVpsVslRowsInfoList = new ArrayList<>();
        this.smartCranePoolInfoList=new ArrayList<>();
        this.smartVesselCranePoolInfoList=new ArrayList<>();
        this.smartCranePlanInfoList=new ArrayList<>();
        this.smartCraneMaintainPlanInfoList = new ArrayList<>();
        this.smartCraneMoveRangeInfoList = new ArrayList<>();
        this.smartCwpConfigurationInfoList = new ArrayList<>();
        this.smartCraneAddOrDelInfoList = new ArrayList<>();
        this.smartCwpWorkBlockInfoList = new ArrayList<>();
        this.smartCwpParameterInfoList = new ArrayList<>();
        this.smartCraneFirstWorkInfoList = new ArrayList<>();
    }

    public List<SmartCwpParameterInfo> getSmartCwpParameterInfoList() {
        return smartCwpParameterInfoList;
    }

    public void setSmartCwpParameterInfoList(List<SmartCwpParameterInfo> smartCwpParameterInfoList) {
        this.smartCwpParameterInfoList = smartCwpParameterInfoList;
    }

    public List<SmartCraneAddOrDelInfo> getSmartCraneAddOrDelInfoList() {
        return smartCraneAddOrDelInfoList;
    }

    public void setSmartCraneAddOrDelInfoList(List<SmartCraneAddOrDelInfo> smartCraneAddOrDelInfoList) {
        this.smartCraneAddOrDelInfoList = smartCraneAddOrDelInfoList;
    }

    public List<SmartCwpConfigurationInfo> getSmartCwpConfigurationInfoList() {
        return smartCwpConfigurationInfoList;
    }

    public void setSmartCwpConfigurationInfoList(List<SmartCwpConfigurationInfo> smartCwpConfigurationInfoList) {
        this.smartCwpConfigurationInfoList = smartCwpConfigurationInfoList;
    }

    public List<SmartCraneMaintainPlanInfo> getSmartCraneMaintainPlanInfoList() {
        return smartCraneMaintainPlanInfoList;
    }

    public void setSmartCraneMaintainPlanInfoList(List<SmartCraneMaintainPlanInfo> smartCraneMaintainPlanInfoList) {
        this.smartCraneMaintainPlanInfoList = smartCraneMaintainPlanInfoList;
    }

    public List<SmartAdviseConfigureInfo> getSmartAdviseConfigureInfoList() {
        return smartAdviseConfigureInfoList;
    }

    public void setSmartAdviseConfigureInfoList(List<SmartAdviseConfigureInfo> smartAdviseConfigureInfoList) {
        this.smartAdviseConfigureInfoList = smartAdviseConfigureInfoList;
    }

    public List<SmartAreaContainerInfo> getSmartAreaContainerInfoList() {
        return smartAreaContainerInfoList;
    }

    public void setSmartAreaContainerInfoList(List<SmartAreaContainerInfo> smartAreaContainerInfoList) {
        this.smartAreaContainerInfoList = smartAreaContainerInfoList;
    }

    public List<SmartAssistEquipmentInfo> getSmartAssistEquipmentInfoList() {
        return smartAssistEquipmentInfoList;
    }

    public void setSmartAssistEquipmentInfoList(List<SmartAssistEquipmentInfo> smartAssistEquipmentInfoList) {
        this.smartAssistEquipmentInfoList = smartAssistEquipmentInfoList;
    }

    public List<SmartContainerGroupInfo> getSmartContainerGroupInfoList() {
        return smartContainerGroupInfoList;
    }

    public void setSmartContainerGroupInfoList(List<SmartContainerGroupInfo> smartContainerGroupInfoList) {
        this.smartContainerGroupInfoList = smartContainerGroupInfoList;
    }

    public List<SmartCraneBaseInfo> getSmartCraneBaseInfoList() {
        return smartCraneBaseInfoList;
    }

    public void setSmartCraneBaseInfoList(List<SmartCraneBaseInfo> smartCraneBaseInfoList) {
        this.smartCraneBaseInfoList = smartCraneBaseInfoList;
    }

    public List<SmartCraneHatchCoverInfo> getSmartCraneHatchCoverInfoList() {
        return smartCraneHatchCoverInfoList;
    }

    public void setSmartCraneHatchCoverInfoList(List<SmartCraneHatchCoverInfo> smartCraneHatchCoverInfoList) {
        this.smartCraneHatchCoverInfoList = smartCraneHatchCoverInfoList;
    }

    public List<SmartCraneWorkFlowInfo> getSmartCraneWorkFlowInfoList() {
        return smartCraneWorkFlowInfoList;
    }

    public void setSmartCraneWorkFlowInfoList(List<SmartCraneWorkFlowInfo> smartCraneWorkFlowInfoList) {
        this.smartCraneWorkFlowInfoList = smartCraneWorkFlowInfoList;
    }

    public List<SmartCraneWorkTimeInfo> getSmartCraneWorkTimeInfoList() {
        return smartCraneWorkTimeInfoList;
    }

    public void setSmartCraneWorkTimeInfoList(List<SmartCraneWorkTimeInfo> smartCraneWorkTimeInfoList) {
        this.smartCraneWorkTimeInfoList = smartCraneWorkTimeInfoList;
    }

    public List<SmartHatchQuantityConfigureInfo> getSmartHatchQuantityConfigureInfoList() {
        return smartHatchQuantityConfigureInfoList;
    }

    public void setSmartHatchQuantityConfigureInfoList(List<SmartHatchQuantityConfigureInfo> smartHatchQuantityConfigureInfoList) {
        this.smartHatchQuantityConfigureInfoList = smartHatchQuantityConfigureInfoList;
    }

    public List<SmartManualInfo> getSmartManualInfoList() {
        return smartManualInfoList;
    }

    public void setSmartManualInfoList(List<SmartManualInfo> smartManualInfoList) {
        this.smartManualInfoList = smartManualInfoList;
    }

    public List<SmartScheduleIdInfo> getSmartScheduleIdInfoList() {
        return smartScheduleIdInfoList;
    }

    public void setSmartScheduleIdInfoList(List<SmartScheduleIdInfo> smartScheduleIdInfoList) {
        this.smartScheduleIdInfoList = smartScheduleIdInfoList;
    }

    public List<SmartStowageLockLocationsInfo> getSmartStowageLockLocationsInfoList() {
        return smartStowageLockLocationsInfoList;
    }

    public void setSmartStowageLockLocationsInfoList(List<SmartStowageLockLocationsInfo> smartStowageLockLocationsInfoList) {
        this.smartStowageLockLocationsInfoList = smartStowageLockLocationsInfoList;
    }

    public List<SmartVesselContainerInfo> getSmartVesselContainerInfoList() {
        return smartVesselContainerInfoList;
    }

    public void setSmartVesselContainerInfoList(List<SmartVesselContainerInfo> smartVesselContainerInfoList) {
        this.smartVesselContainerInfoList = smartVesselContainerInfoList;
    }

    public List<SmartVesselMachinesInfo> getSmartVesselMachinesInfoList() {
        return smartVesselMachinesInfoList;
    }

    public void setSmartVesselMachinesInfoList(List<SmartVesselMachinesInfo> smartVesselMachinesInfoList) {
        this.smartVesselMachinesInfoList = smartVesselMachinesInfoList;
    }

    public List<SmartVesselWholeWeightInfo> getSmartVesselWholeWeightInfoList() {
        return smartVesselWholeWeightInfoList;
    }

    public void setSmartVesselWholeWeightInfoList(List<SmartVesselWholeWeightInfo> smartVesselWholeWeightInfoList) {
        this.smartVesselWholeWeightInfoList = smartVesselWholeWeightInfoList;
    }

    public List<SmartVesselWorkTimeInfo> getSmartVesselWorkTimeInfoList() {
        return smartVesselWorkTimeInfoList;
    }

    public void setSmartVesselWorkTimeInfoList(List<SmartVesselWorkTimeInfo> smartVesselWorkTimeInfoList) {
        this.smartVesselWorkTimeInfoList = smartVesselWorkTimeInfoList;
    }

    public List<SmartVpsVslBaysInfo> getSmartVpsVslBaysInfoList() {
        return smartVpsVslBaysInfoList;
    }

    public void setSmartVpsVslBaysInfoList(List<SmartVpsVslBaysInfo> smartVpsVslBaysInfoList) {
        this.smartVpsVslBaysInfoList = smartVpsVslBaysInfoList;
    }

    public List<SmartVpsVslHatchcoversInfo> getSmartVpsVslHatchcoversInfoList() {
        return smartVpsVslHatchcoversInfoList;
    }

    public void setSmartVpsVslHatchcoversInfoList(List<SmartVpsVslHatchcoversInfo> smartVpsVslHatchcoversInfoList) {
        this.smartVpsVslHatchcoversInfoList = smartVpsVslHatchcoversInfoList;
    }

    public List<SmartVpsVslHatchsInfo> getSmartVpsVslHatchsInfoList() {
        return smartVpsVslHatchsInfoList;
    }

    public void setSmartVpsVslHatchsInfoList(List<SmartVpsVslHatchsInfo> smartVpsVslHatchsInfoList) {
        this.smartVpsVslHatchsInfoList = smartVpsVslHatchsInfoList;
    }

    public List<SmartVpsVslLocationsInfo> getSmartVpsVslLocationsInfoList() {
        return smartVpsVslLocationsInfoList;
    }

    public void setSmartVpsVslLocationsInfoList(List<SmartVpsVslLocationsInfo> smartVpsVslLocationsInfoList) {
        this.smartVpsVslLocationsInfoList = smartVpsVslLocationsInfoList;
    }

    public List<SmartVpsVslRowsInfo> getSmartVpsVslRowsInfoList() {
        return smartVpsVslRowsInfoList;
    }

    public void setSmartVpsVslRowsInfoList(List<SmartVpsVslRowsInfo> smartVpsVslRowsInfoList) {
        this.smartVpsVslRowsInfoList = smartVpsVslRowsInfoList;
    }

    public List<SmartCranePoolInfo> getSmartCranePoolInfoList() {
        return smartCranePoolInfoList;
    }

    public void setSmartCranePoolInfoList(List<SmartCranePoolInfo> smartCranePoolInfoList) {
        this.smartCranePoolInfoList = smartCranePoolInfoList;
    }

    public List<SmartVesselCranePoolInfo> getSmartVesselCranePoolInfoList() {
        return smartVesselCranePoolInfoList;
    }

    public void setSmartVesselCranePoolInfoList(List<SmartVesselCranePoolInfo> smartVesselCranePoolInfoList) {
        this.smartVesselCranePoolInfoList = smartVesselCranePoolInfoList;
    }

    public List<SmartCranePlanInfo> getSmartCranePlanInfoList() {
        return smartCranePlanInfoList;
    }

    public void setSmartCranePlanInfoList(List<SmartCranePlanInfo> smartCranePlanInfoList) {
        this.smartCranePlanInfoList = smartCranePlanInfoList;
    }

    public List<SmartCraneMoveRangeInfo> getSmartCraneMoveRangeInfoList() {
        return smartCraneMoveRangeInfoList;
    }

    public void setSmartCraneMoveRangeInfoList(List<SmartCraneMoveRangeInfo> smartCraneMoveRangeInfoList) {
        this.smartCraneMoveRangeInfoList = smartCraneMoveRangeInfoList;
    }

    public List<SmartCwpWorkBlockInfo> getSmartCwpWorkBlockInfoList() {
        return smartCwpWorkBlockInfoList;
    }

    public void setSmartCwpWorkBlockInfoList(List<SmartCwpWorkBlockInfo> smartCwpWorkBlockInfoList) {
        this.smartCwpWorkBlockInfoList = smartCwpWorkBlockInfoList;
    }

    public List<SmartCraneFirstWorkInfo> getSmartCraneFirstWorkInfoList() {
        return smartCraneFirstWorkInfoList;
    }

    public void setSmartCraneFirstWorkInfoList(List<SmartCraneFirstWorkInfo> smartCraneFirstWorkInfoList) {
        this.smartCraneFirstWorkInfoList = smartCraneFirstWorkInfoList;
    }
}
