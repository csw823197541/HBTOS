package com.shbtos.biz.smart.cwp.service;

import com.shbtos.biz.smart.cwp.pojo.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/2.
 */
public class SmartWiImportData {


    private List<SmartScheduleIdInfo> smartScheduleIdInfoList;

    /**
     * 2、	所有的指令
     */
    private List<SmartVesselContainerInfo> smartVesselContainerInfoList;
    /**
     * 3、	箱区到船舶的距离
     */
    private List<SmartAreaDistanceInfoInfo> smartAreaDistanceInfoInfoList;
    /**
     * 5、	桥机开工作业的时间
     */
    private List<SmartCraneWorkStartTmInfo> smartCraneWorkStartTmInfoList;
    /**
     * 桥吊的作业时间
     */
    private List<SmartCraneWorkTimeInfo> smartCraneWorkTimeInfoList;
    /**
     * 桥吊基础信息
     */
    private List<SmartCraneBaseInfo> smartCraneBaseInfoList;
    /**
     * 6、	当前一个小时时间段内，箱区作业的作业指令
     */
    private List<SmartAreaTaskInfo> smartAreaTaskInfoList;

    /**
     * 7、	堆场轨道吊机械信息
     */
    private List<SmartAscStatusPlanInfo> smartAscStatusPlanInfoList;

    /**
     * 8、	堆场轨道吊维修计划
     */
    private List<SmartAscMaintainPlanInfo> smartAscMaintainPlanInfoList;

    /**
     * 指令相关的配置参数
     */
    private List<SmartWiConfiguration> smartWiConfigurationList;

    //桥机作业块信息
    private List<SmartCwpWorkBlockInfo> smartCwpWorkBlockInfoList;

    //船舶结构相关数据
    private List<SmartVpsVslBaysInfo> smartVpsVslBaysInfoList;
    private List<SmartVpsVslHatchcoversInfo> smartVpsVslHatchcoversInfoList;
    private List<SmartVpsVslHatchsInfo> smartVpsVslHatchsInfoList;
    private List<SmartVpsVslLocationsInfo> smartVpsVslLocationsInfoList;
    private List<SmartVpsVslRowsInfo> smartVpsVslRowsInfoList;

    public SmartWiImportData() {
        smartVpsVslBaysInfoList = new ArrayList<>();
        smartVpsVslHatchcoversInfoList = new ArrayList<>();
        smartVpsVslHatchsInfoList = new ArrayList<>();
        smartVpsVslLocationsInfoList = new ArrayList<>();
        smartVpsVslRowsInfoList = new ArrayList<>();
        smartWiConfigurationList = new ArrayList<>();
    }

    public List<SmartCwpWorkBlockInfo> getSmartCwpWorkBlockInfoList() {
        if (smartCwpWorkBlockInfoList == null) {
            smartCwpWorkBlockInfoList = new ArrayList<>();
        }
        return smartCwpWorkBlockInfoList;
    }

    public void setSmartCwpWorkBlockInfoList(List<SmartCwpWorkBlockInfo> smartCwpWorkBlockInfoList) {
        this.smartCwpWorkBlockInfoList = smartCwpWorkBlockInfoList;
    }

    public List<SmartWiConfiguration> getSmartWiConfigurationList() {
        return smartWiConfigurationList;
    }

    public void setSmartWiConfigurationList(List<SmartWiConfiguration> smartWiConfigurationList) {
        this.smartWiConfigurationList = smartWiConfigurationList;
    }

    public List<SmartScheduleIdInfo> getSmartScheduleIdInfoList() {
        if (smartScheduleIdInfoList == null)
            smartScheduleIdInfoList = new ArrayList<>();
        return smartScheduleIdInfoList;
    }

    public void setSmartScheduleIdInfoList(List<SmartScheduleIdInfo> smartScheduleIdInfoList) {
        this.smartScheduleIdInfoList = smartScheduleIdInfoList;
    }


    public List<SmartVesselContainerInfo> getSmartVesselContainerInfoList() {
        if (smartVesselContainerInfoList == null)
            smartVesselContainerInfoList = new ArrayList<>();
        return smartVesselContainerInfoList;
    }

    public void setSmartVesselContainerInfoList(List<SmartVesselContainerInfo> smartVesselContainerInfoList) {
        this.smartVesselContainerInfoList = smartVesselContainerInfoList;
    }

    public List<SmartAreaDistanceInfoInfo> getSmartAreaDistanceInfoInfoList() {
        if (smartAreaDistanceInfoInfoList == null)
            smartAreaDistanceInfoInfoList = new ArrayList<>();
        return smartAreaDistanceInfoInfoList;
    }

    public void setSmartAreaDistanceInfoInfoList(List<SmartAreaDistanceInfoInfo> smartAreaDistanceInfoInfoList) {
        this.smartAreaDistanceInfoInfoList = smartAreaDistanceInfoInfoList;
    }

    public List<SmartCraneWorkStartTmInfo> getSmartCraneWorkStartTmInfoList() {
        if (smartCraneWorkStartTmInfoList == null)
            smartCraneWorkStartTmInfoList = new ArrayList<>();
        return smartCraneWorkStartTmInfoList;
    }

    public void setSmartCraneWorkStartTmInfoList(List<SmartCraneWorkStartTmInfo> smartCraneWorkStartTmInfoList) {
        this.smartCraneWorkStartTmInfoList = smartCraneWorkStartTmInfoList;
    }

    public List<SmartCraneWorkTimeInfo> getSmartCraneWorkTimeInfoList() {
        if (smartCraneWorkTimeInfoList == null)
            smartCraneWorkTimeInfoList = new ArrayList<>();
        return smartCraneWorkTimeInfoList;
    }

    public void setSmartCraneWorkTimeInfoList(List<SmartCraneWorkTimeInfo> smartCraneWorkTimeInfoList) {
        this.smartCraneWorkTimeInfoList = smartCraneWorkTimeInfoList;
    }

    public List<SmartCraneBaseInfo> getSmartCraneBaseInfoList() {

        if (smartCraneBaseInfoList == null)
            smartCraneBaseInfoList = new ArrayList<>();
        return smartCraneBaseInfoList;
    }

    public void setSmartCraneBaseInfoList(List<SmartCraneBaseInfo> smartCraneBaseInfoList) {
        this.smartCraneBaseInfoList = smartCraneBaseInfoList;
    }

    public List<SmartAreaTaskInfo> getSmartAreaTaskInfoList() {
        if (smartAreaTaskInfoList == null)
            smartAreaTaskInfoList = new ArrayList<>();
        return smartAreaTaskInfoList;
    }

    public void setSmartAreaTaskInfoList(List<SmartAreaTaskInfo> smartAreaTaskInfoList) {
        this.smartAreaTaskInfoList = smartAreaTaskInfoList;
    }

    public List<SmartAscStatusPlanInfo> getSmartAscStatusPlanInfoList() {
        if (smartAscStatusPlanInfoList == null)
            smartAscStatusPlanInfoList = new ArrayList<>();
        return smartAscStatusPlanInfoList;
    }

    public void setSmartAscStatusPlanInfoList(List<SmartAscStatusPlanInfo> smartAscStatusPlanInfoList) {
        this.smartAscStatusPlanInfoList = smartAscStatusPlanInfoList;
    }

    public List<SmartAscMaintainPlanInfo> getSmartAscMaintainPlanInfoList() {
        if (smartAscMaintainPlanInfoList == null)
            smartAscMaintainPlanInfoList = new ArrayList<>();
        return smartAscMaintainPlanInfoList;
    }

    public void setSmartAscMaintainPlanInfoList(List<SmartAscMaintainPlanInfo> smartAscMaintainPlanInfoList) {
        this.smartAscMaintainPlanInfoList = smartAscMaintainPlanInfoList;
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
}
