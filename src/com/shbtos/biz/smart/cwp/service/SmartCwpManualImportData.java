package com.shbtos.biz.smart.cwp.service;

import com.shbtos.biz.smart.cwp.pojo.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by csw on 2018/1/25.
 * Description:
 */
public class SmartCwpManualImportData {

    private List<SmartScheduleIdInfo> smartScheduleIdInfoList;

    private List<SmartWiConfiguration> smartWiConfigurationList;

    private List<SmartCraneWorkStartTmInfo> smartCraneWorkStartTmInfoList;
    private List<SmartCraneBaseInfo> smartCraneBaseInfoList;
    private List<SmartCraneMaintainPlanInfo> smartCraneMaintainPlanInfoList;

    private List<SmartVpsVslHatchsInfo> smartVpsVslHatchsInfoList;
    private List<SmartVpsVslBaysInfo> smartVpsVslBaysInfoList;
    private List<SmartVesselMachinesInfo> smartVesselMachinesInfoList;

    private List<SmartVesselContainerInfo> smartVesselContainerInfoList;
    private List<SmartCwpWorkBlockInfo> smartCwpWorkBlockInfoList;

    public SmartCwpManualImportData() {
        smartScheduleIdInfoList = new ArrayList<>();
        smartWiConfigurationList = new ArrayList<>();
        smartCraneWorkStartTmInfoList = new ArrayList<>();
        smartCraneBaseInfoList = new ArrayList<>();
        smartCraneMaintainPlanInfoList = new ArrayList<>();
        smartVpsVslHatchsInfoList = new ArrayList<>();
        smartVpsVslBaysInfoList = new ArrayList<>();
        smartVesselMachinesInfoList = new ArrayList<>();
        smartVesselContainerInfoList = new ArrayList<>();
        smartCwpWorkBlockInfoList = new ArrayList<>();
    }

    public List<SmartScheduleIdInfo> getSmartScheduleIdInfoList() {
        return smartScheduleIdInfoList;
    }

    public void setSmartScheduleIdInfoList(List<SmartScheduleIdInfo> smartScheduleIdInfoList) {
        this.smartScheduleIdInfoList = smartScheduleIdInfoList;
    }

    public List<SmartWiConfiguration> getSmartWiConfigurationList() {
        return smartWiConfigurationList;
    }

    public void setSmartWiConfigurationList(List<SmartWiConfiguration> smartWiConfigurationList) {
        this.smartWiConfigurationList = smartWiConfigurationList;
    }

    public List<SmartCraneWorkStartTmInfo> getSmartCraneWorkStartTmInfoList() {
        return smartCraneWorkStartTmInfoList;
    }

    public void setSmartCraneWorkStartTmInfoList(List<SmartCraneWorkStartTmInfo> smartCraneWorkStartTmInfoList) {
        this.smartCraneWorkStartTmInfoList = smartCraneWorkStartTmInfoList;
    }

    public List<SmartCraneBaseInfo> getSmartCraneBaseInfoList() {
        return smartCraneBaseInfoList;
    }

    public void setSmartCraneBaseInfoList(List<SmartCraneBaseInfo> smartCraneBaseInfoList) {
        this.smartCraneBaseInfoList = smartCraneBaseInfoList;
    }

    public List<SmartCraneMaintainPlanInfo> getSmartCraneMaintainPlanInfoList() {
        return smartCraneMaintainPlanInfoList;
    }

    public void setSmartCraneMaintainPlanInfoList(List<SmartCraneMaintainPlanInfo> smartCraneMaintainPlanInfoList) {
        this.smartCraneMaintainPlanInfoList = smartCraneMaintainPlanInfoList;
    }

    public List<SmartVpsVslHatchsInfo> getSmartVpsVslHatchsInfoList() {
        return smartVpsVslHatchsInfoList;
    }

    public void setSmartVpsVslHatchsInfoList(List<SmartVpsVslHatchsInfo> smartVpsVslHatchsInfoList) {
        this.smartVpsVslHatchsInfoList = smartVpsVslHatchsInfoList;
    }

    public List<SmartVpsVslBaysInfo> getSmartVpsVslBaysInfoList() {
        return smartVpsVslBaysInfoList;
    }

    public void setSmartVpsVslBaysInfoList(List<SmartVpsVslBaysInfo> smartVpsVslBaysInfoList) {
        this.smartVpsVslBaysInfoList = smartVpsVslBaysInfoList;
    }

    public List<SmartVesselMachinesInfo> getSmartVesselMachinesInfoList() {
        return smartVesselMachinesInfoList;
    }

    public void setSmartVesselMachinesInfoList(List<SmartVesselMachinesInfo> smartVesselMachinesInfoList) {
        this.smartVesselMachinesInfoList = smartVesselMachinesInfoList;
    }

    public List<SmartVesselContainerInfo> getSmartVesselContainerInfoList() {
        return smartVesselContainerInfoList;
    }

    public void setSmartVesselContainerInfoList(List<SmartVesselContainerInfo> smartVesselContainerInfoList) {
        this.smartVesselContainerInfoList = smartVesselContainerInfoList;
    }

    public List<SmartCwpWorkBlockInfo> getSmartCwpWorkBlockInfoList() {
        return smartCwpWorkBlockInfoList;
    }

    public void setSmartCwpWorkBlockInfoList(List<SmartCwpWorkBlockInfo> smartCwpWorkBlockInfoList) {
        this.smartCwpWorkBlockInfoList = smartCwpWorkBlockInfoList;
    }
}
