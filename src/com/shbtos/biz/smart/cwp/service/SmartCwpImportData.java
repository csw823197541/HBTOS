package com.shbtos.biz.smart.cwp.service;


import com.shbtos.biz.smart.cwp.pojo.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuminhang on 2017/2/9.
 * 用于传入CWP所需参数
 */
public class SmartCwpImportData {

    private List<SmartAreaContainerInfo> smartAreaContainerInfoList;
    private List<SmartAssistEquipmentInfo> smartAssistEquipmentInfoList;
    private List<SmartContainerGroupInfo> smartContainerGroupInfoList;
    private List<SmartCraneBaseInfo> smartCraneBaseInfoList;
    private List<SmartCraneHatchCoverInfo> smartCraneHatchCoverInfoList;
    private List<SmartCraneWorkFlowInfo> smartCraneWorkFlowInfoList;
    private List<SmartScheduleIdInfo> smartScheduleIdInfoList;
    private List<SmartStowageLockLocationsInfo> smartStowageLockLocationsInfoList;
    private List<SmartVesselContainerInfo> smartVesselContainerInfoList;
    private List<SmartVesselMachinesInfo> smartVesselMachinesInfoList;
    private List<SmartVpsVslBaysInfo> smartVpsVslBaysInfoList;
    private List<SmartVpsVslHatchcoversInfo> smartVpsVslHatchcoversInfoList;
    private List<SmartVpsVslHatchsInfo> smartVpsVslHatchsInfoList;
    private List<SmartVpsVslLocationsInfo> smartVpsVslLocationsInfoList;
    private List<SmartVpsVslRowsInfo> smartVpsVslRowsInfoList;
    private List<SmartCranePoolInfo> smartCranePoolInfoList;
    private List<SmartVesselCranePoolInfo> smartVesselCranePoolInfoList;
    private List<SmartCraneMaintainPlanInfo> smartCraneMaintainPlanInfoList;
    private List<SmartCraneMoveRangeInfo> smartCraneMoveRangeInfoList;

    private List<SmartCwpConfigurationInfo> smartCwpConfigurationInfoList;
    private List<SmartCraneAddOrDelInfo> smartCraneAddOrDelInfoList;
    private List<SmartCwpWorkBlockInfo> smartCwpWorkBlockInfoList;
    private List<SmartCwpParameterInfo> smartCwpParameterInfoList;
    private List<SmartCraneFirstWorkInfo> smartCraneFirstWorkInfoList;

    private List<SmartCraneManualInfo> smartCraneManualInfoList;
    private List<SmartCraneWorkPlanInfo> smartCraneWorkPlanInfoList;
    private List<SmartVesselContainerAmountInfo> smartVesselContainerAmountInfoList;
    private List<SmartBarWorkPlanInfo> smartBarWorkPlanInfoList;

    public SmartCwpImportData(){
        this.smartAreaContainerInfoList = new ArrayList<>();
        this.smartAssistEquipmentInfoList = new ArrayList<>();
        this.smartContainerGroupInfoList = new ArrayList<>();
        this.smartCraneBaseInfoList = new ArrayList<>();
        this.smartCraneHatchCoverInfoList = new ArrayList<>();
        this.smartCraneWorkFlowInfoList = new ArrayList<>();
        this.smartCraneWorkPlanInfoList = new ArrayList<>();
        this.smartScheduleIdInfoList = new ArrayList<>();
        this.smartStowageLockLocationsInfoList = new ArrayList<>();
        this.smartVesselContainerInfoList = new ArrayList<>();
        this.smartVesselMachinesInfoList = new ArrayList<>();
        this.smartVpsVslBaysInfoList = new ArrayList<>();
        this.smartVpsVslHatchcoversInfoList = new ArrayList<>();
        this.smartVpsVslHatchsInfoList = new ArrayList<>();
        this.smartVpsVslLocationsInfoList = new ArrayList<>();
        this.smartVpsVslRowsInfoList = new ArrayList<>();
        this.smartCranePoolInfoList=new ArrayList<>();
        this.smartVesselCranePoolInfoList=new ArrayList<>();
        this.smartCraneMaintainPlanInfoList = new ArrayList<>();
        this.smartCraneMoveRangeInfoList = new ArrayList<>();
        this.smartCwpConfigurationInfoList = new ArrayList<>();
        this.smartCraneAddOrDelInfoList = new ArrayList<>();
        this.smartCwpWorkBlockInfoList = new ArrayList<>();
        this.smartCwpParameterInfoList = new ArrayList<>();
        this.smartCraneFirstWorkInfoList = new ArrayList<>();
        this.smartCraneManualInfoList = new ArrayList<>();
        smartVesselContainerAmountInfoList = new ArrayList<>();
        smartBarWorkPlanInfoList = new ArrayList<>();
    }

    public List<SmartBarWorkPlanInfo> getSmartBarWorkPlanInfoList() {
        return smartBarWorkPlanInfoList;
    }

    public void setSmartBarWorkPlanInfoList(List<SmartBarWorkPlanInfo> smartBarWorkPlanInfoList) {
        this.smartBarWorkPlanInfoList = smartBarWorkPlanInfoList;
    }

    public List<SmartVesselContainerAmountInfo> getSmartVesselContainerAmountInfoList() {
        return smartVesselContainerAmountInfoList;
    }

    public void setSmartVesselContainerAmountInfoList(List<SmartVesselContainerAmountInfo> smartVesselContainerAmountInfoList) {
        this.smartVesselContainerAmountInfoList = smartVesselContainerAmountInfoList;
    }

    public List<SmartCraneManualInfo> getSmartCraneManualInfoList() {
        return smartCraneManualInfoList;
    }

    public void setSmartCraneManualInfoList(List<SmartCraneManualInfo> smartCraneManualInfoList) {
        this.smartCraneManualInfoList = smartCraneManualInfoList;
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

    public List<SmartCraneWorkPlanInfo> getSmartCraneWorkPlanInfoList() {
        return smartCraneWorkPlanInfoList;
    }

    public void setSmartCraneWorkPlanInfoList(List<SmartCraneWorkPlanInfo> smartCraneWorkPlanInfoList) {
        this.smartCraneWorkPlanInfoList = smartCraneWorkPlanInfoList;
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
