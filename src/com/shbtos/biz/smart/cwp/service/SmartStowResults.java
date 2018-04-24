package com.shbtos.biz.smart.cwp.service;


import com.shbtos.biz.smart.cwp.pojo.Results.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/2.
 */
public class SmartStowResults {

    private List<SmartReAutoStowInfo> smartReAutoStowInfos;

    private List<SmartReWeightGroupInfo> smartReWeightGroupInfoList;
    private List<SmartRePreStowVesselCntWeightInfo> smartRePreStowVesselCntWeightInfoList;

    private List<SmartReAutoStowEvaluationInfo> smartReAutoStowEvaluationInfoList;

    private SmartReMessageInfo smartReMessageInfo;

    public SmartStowResults() {
        smartReAutoStowInfos = new ArrayList<>();
        smartReMessageInfo = new SmartReMessageInfo();
        smartReWeightGroupInfoList = new ArrayList<>();
        smartRePreStowVesselCntWeightInfoList = new ArrayList<>();
        smartReAutoStowEvaluationInfoList = new ArrayList<>();
    }

    public List<SmartReWeightGroupInfo> getSmartReWeightGroupInfoList() {
        return smartReWeightGroupInfoList;
    }

    public void setSmartReWeightGroupInfoList(List<SmartReWeightGroupInfo> smartReWeightGroupInfoList) {
        this.smartReWeightGroupInfoList = smartReWeightGroupInfoList;
    }

    public List<SmartRePreStowVesselCntWeightInfo> getSmartRePreStowVesselCntWeightInfoList() {
        return smartRePreStowVesselCntWeightInfoList;
    }

    public void setSmartRePreStowVesselCntWeightInfoList(List<SmartRePreStowVesselCntWeightInfo> smartRePreStowVesselCntWeightInfoList) {
        this.smartRePreStowVesselCntWeightInfoList = smartRePreStowVesselCntWeightInfoList;
    }

    public List<SmartReAutoStowInfo> getSmartReAutoStowInfos() {
        return smartReAutoStowInfos;
    }

    public void setSmartReAutoStowInfos(List<SmartReAutoStowInfo> smartReAutoStowInfos) {
        this.smartReAutoStowInfos = smartReAutoStowInfos;
    }

    public SmartReMessageInfo getSmartReMessageInfo() {
        return smartReMessageInfo;
    }

    public void setSmartReMessageInfo(SmartReMessageInfo smartReMessageInfo) {
        this.smartReMessageInfo = smartReMessageInfo;
    }

    public List<SmartReAutoStowEvaluationInfo> getSmartReAutoStowEvaluationInfoList() {
        return smartReAutoStowEvaluationInfoList;
    }

    public void setSmartReAutoStowEvaluationInfoList(List<SmartReAutoStowEvaluationInfo> smartReAutoStowEvaluationInfoList) {
        this.smartReAutoStowEvaluationInfoList = smartReAutoStowEvaluationInfoList;
    }
}
