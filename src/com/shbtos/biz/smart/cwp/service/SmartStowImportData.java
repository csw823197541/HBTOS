package com.shbtos.biz.smart.cwp.service;

import com.shbtos.biz.smart.cwp.pojo.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dingyh on 2017/2/28.
 */
public class SmartStowImportData {


    /**
     * 航次信息
     */
    private List<SmartScheduleIdInfo> smartScheduleIdInfoList;

    //region 船舶结构信息
    /**
     * 舱盖板
     */
    private List<SmartVpsVslHatchcoversInfo> smartVpsVslHatchcoversInfoList;
    /**
     * 舱信息
     */
    private List<SmartVpsVslHatchsInfo> smartVpsVslHatchsInfoList;
    /**
     * 倍位信息
     */
    private List<SmartVpsVslBaysInfo> smartVpsVslBaysInfoList;
    /**
     * 船相位信息
     */
    private List<SmartVpsVslLocationsInfo> smartVpsVslLocationsInfoList;
    /**
     * 排信息
     */
    private List<SmartVpsVslRowsInfo> smartVpsVslRowsInfoList;

    //endregion


    /**
     * 船舶重量要求信息
     */
    private List<SmartVesselTierWeightInfo> smartVesselTierWeightInfoList;


    /**
     * 属性组信息
     */
    private List<SmartContainerGroupInfo> smartContainerGroupInfoList;

    /**
     * 重量等级信息
     */
    private List<SmartWeightGroupInfo> smartWeightGroupInfoList;

    /**
     * 港口分组信息
     */
    private List<SmartPortGroupInfo> smartPortGroupInfoList;


    /**
     * 在场箱信息
     */
    private List<SmartYardContainerInfo> smartYardContainerInfoList;

    /**
     * 31、	箱区信息
     */
    private List<SmartContainerAreaInfoInfo> smartContainerAreaInfoInfoList;


    /**
     * 32、	箱区到船舶的距离
     */
    private List<SmartAreaDistanceInfoInfo> smartAreaDistanceInfoInfoList;

    /**
     * 33、	装船预配（或者实配）与卸船船图数据
     */
    private List<SmartVesselContainerInfo> smartVesselContainerInfoList;


    /**
     * 34、	配载预留位置
     */
    private List<SmartStowageLockLocationsInfo> smartStowageLockLocationsInfoList;

    /**
     * 35、	堆场轨道吊机械信息
     */
    private List<SmartAscStatusPlanInfo> smartAscStatusPlanInfoList;


    /**
     * 堆场轨道吊维修计划
     */
    private List<SmartAscMaintainPlanInfo> smartAscMaintainPlanInfoList;
    /**
     * 37、	配载配置信息
     */
    private List<SmartStowageConfigurationInfo> smartStowageConfigurationInfoList;

    /**
     * 38、	堆场作业时间配置信息
     */

    private List<SmartYardWorkTimeInfo> smartYardWorkTimeInfoList;


    public List<SmartScheduleIdInfo> getSmartScheduleIdInfoList() {
        if (smartScheduleIdInfoList == null)
            smartScheduleIdInfoList = new ArrayList<>();
        return smartScheduleIdInfoList;
    }

    public void setSmartScheduleIdInfoList(List<SmartScheduleIdInfo> smartScheduleIdInfoList) {
        this.smartScheduleIdInfoList = smartScheduleIdInfoList;
    }

    public List<SmartVpsVslHatchcoversInfo> getSmartVpsVslHatchcoversInfoList() {
        if (smartVpsVslHatchcoversInfoList == null)
            smartVpsVslHatchcoversInfoList = new ArrayList<>();
        return smartVpsVslHatchcoversInfoList;
    }

    public void setSmartVpsVslHatchcoversInfoList(List<SmartVpsVslHatchcoversInfo> smartVpsVslHatchcoversInfoList) {
        this.smartVpsVslHatchcoversInfoList = smartVpsVslHatchcoversInfoList;
    }

    public List<SmartVpsVslHatchsInfo> getSmartVpsVslHatchsInfoList() {
        if (smartVpsVslHatchsInfoList == null)
            smartVpsVslHatchsInfoList = new ArrayList<>();
        return smartVpsVslHatchsInfoList;
    }

    public void setSmartVpsVslHatchsInfoList(List<SmartVpsVslHatchsInfo> smartVpsVslHatchsInfoList) {
        this.smartVpsVslHatchsInfoList = smartVpsVslHatchsInfoList;
    }

    public List<SmartVpsVslBaysInfo> getSmartVpsVslBaysInfoList() {
        if (smartVpsVslBaysInfoList == null)
            smartVpsVslBaysInfoList = new ArrayList<>();
        return smartVpsVslBaysInfoList;
    }

    public void setSmartVpsVslBaysInfoList(List<SmartVpsVslBaysInfo> smartVpsVslBaysInfoList) {
        this.smartVpsVslBaysInfoList = smartVpsVslBaysInfoList;
    }

    public List<SmartVpsVslLocationsInfo> getSmartVpsVslLocationsInfoList() {
        if (smartVpsVslLocationsInfoList == null)
            smartVpsVslLocationsInfoList = new ArrayList<>();
        return smartVpsVslLocationsInfoList;
    }

    public void setSmartVpsVslLocationsInfoList(List<SmartVpsVslLocationsInfo> smartVpsVslLocationsInfoList) {
        this.smartVpsVslLocationsInfoList = smartVpsVslLocationsInfoList;
    }

    public List<SmartVpsVslRowsInfo> getSmartVpsVslRowsInfoList() {
        if (smartVpsVslRowsInfoList == null)
            smartVpsVslRowsInfoList = new ArrayList<>();
        return smartVpsVslRowsInfoList;
    }

    public void setSmartVpsVslRowsInfoList(List<SmartVpsVslRowsInfo> smartVpsVslRowsInfoList) {
        this.smartVpsVslRowsInfoList = smartVpsVslRowsInfoList;
    }

    public List<SmartVesselTierWeightInfo> getSmartVesselTierWeightInfoList() {
        if (smartVesselTierWeightInfoList == null)
            smartVesselTierWeightInfoList = new ArrayList<>();
        return smartVesselTierWeightInfoList;
    }

    public void setSmartVesselTierWeightInfoList(List<SmartVesselTierWeightInfo> smartVesselTierWeightInfoList) {
        this.smartVesselTierWeightInfoList = smartVesselTierWeightInfoList;
    }

    public List<SmartContainerGroupInfo> getSmartContainerGroupInfoList() {
        if (smartContainerGroupInfoList == null)
            smartContainerGroupInfoList = new ArrayList<>();
        return smartContainerGroupInfoList;
    }

    public void setSmartContainerGroupInfoList(List<SmartContainerGroupInfo> smartContainerGroupInfoList) {
        this.smartContainerGroupInfoList = smartContainerGroupInfoList;
    }

    public List<SmartWeightGroupInfo> getSmartWeightGroupInfoList() {
        if (smartWeightGroupInfoList == null)
            smartWeightGroupInfoList = new ArrayList<>();
        return smartWeightGroupInfoList;
    }

    public void setSmartWeightGroupInfoList(List<SmartWeightGroupInfo> smartWeightGroupInfoList) {
        this.smartWeightGroupInfoList = smartWeightGroupInfoList;
    }

    public List<SmartPortGroupInfo> getSmartPortGroupInfoList() {
        if (smartPortGroupInfoList == null)
            smartPortGroupInfoList = new ArrayList<>();
        return smartPortGroupInfoList;
    }

    public void setSmartPortGroupInfoList(List<SmartPortGroupInfo> smartPortGroupInfoList) {
        this.smartPortGroupInfoList = smartPortGroupInfoList;
    }

    public List<SmartYardContainerInfo> getSmartYardContainerInfoList() {
        if (smartYardContainerInfoList == null)
            smartYardContainerInfoList = new ArrayList<>();
        return smartYardContainerInfoList;
    }

    public void setSmartYardContainerInfoList(List<SmartYardContainerInfo> smartYardContainerInfoList) {
        this.smartYardContainerInfoList = smartYardContainerInfoList;
    }

    public List<SmartContainerAreaInfoInfo> getSmartContainerAreaInfoInfoList() {
        if (smartContainerAreaInfoInfoList == null)
            smartContainerAreaInfoInfoList = new ArrayList<>();
        return smartContainerAreaInfoInfoList;
    }

    public void setSmartContainerAreaInfoInfoList(List<SmartContainerAreaInfoInfo> smartContainerAreaInfoInfoList) {
        this.smartContainerAreaInfoInfoList = smartContainerAreaInfoInfoList;
    }

    public List<SmartAreaDistanceInfoInfo> getSmartAreaDistanceInfoInfoList() {
        if (smartAreaDistanceInfoInfoList == null)
            smartAreaDistanceInfoInfoList = new ArrayList<>();
        return smartAreaDistanceInfoInfoList;
    }

    public void setSmartAreaDistanceInfoInfoList(List<SmartAreaDistanceInfoInfo> smartAreaDistanceInfoInfoList) {

        this.smartAreaDistanceInfoInfoList = smartAreaDistanceInfoInfoList;
    }

    public List<SmartVesselContainerInfo> getSmartVesselContainerInfoList() {
        if (smartVesselContainerInfoList == null)
            smartVesselContainerInfoList = new ArrayList<>();
        return smartVesselContainerInfoList;
    }

    public void setSmartVesselContainerInfoList(List<SmartVesselContainerInfo> smartVesselContainerInfoList) {
        this.smartVesselContainerInfoList = smartVesselContainerInfoList;
    }

    public List<SmartStowageLockLocationsInfo> getSmartStowageLockLocationsInfoList() {
        if (smartStowageLockLocationsInfoList == null)
            smartStowageLockLocationsInfoList = new ArrayList<>();
        return smartStowageLockLocationsInfoList;
    }

    public void setSmartStowageLockLocationsInfoList(List<SmartStowageLockLocationsInfo> smartStowageLockLocationsInfoList) {
        this.smartStowageLockLocationsInfoList = smartStowageLockLocationsInfoList;
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

    public List<SmartStowageConfigurationInfo> getSmartStowageConfigurationInfoList() {
        if (smartStowageConfigurationInfoList == null)
            smartStowageConfigurationInfoList = new ArrayList<>();
        return smartStowageConfigurationInfoList;
    }

    public void setSmartStowageConfigurationInfoList(List<SmartStowageConfigurationInfo> smartStowageConfigurationInfoList) {
        this.smartStowageConfigurationInfoList = smartStowageConfigurationInfoList;
    }

    public List<SmartYardWorkTimeInfo> getSmartYardWorkTimeInfoList() {
        if (smartYardWorkTimeInfoList == null)
            smartYardWorkTimeInfoList = new ArrayList<>();
        return smartYardWorkTimeInfoList;
    }

    public void setSmartYardWorkTimeInfoList(List<SmartYardWorkTimeInfo> smartYardWorkTimeInfoList) {
        this.smartYardWorkTimeInfoList = smartYardWorkTimeInfoList;
    }


}
