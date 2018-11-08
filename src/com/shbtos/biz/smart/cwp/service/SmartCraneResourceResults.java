package com.shbtos.biz.smart.cwp.service;


import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCraneWorkPlanInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReMessageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuminhang on 2017/2/9.
 * 用于存储CWP运算结果
 */
public class SmartCraneResourceResults {

    private SmartReMessageInfo smartReMessageInfo;
    private List<SmartReCraneWorkPlanInfo> smartReCraneWorkPlanInfoList;

    public SmartCraneResourceResults() {
        this.smartReMessageInfo = new SmartReMessageInfo();
        smartReCraneWorkPlanInfoList = new ArrayList<>();
    }

    public List<SmartReCraneWorkPlanInfo> getSmartReCraneWorkPlanInfoList() {
        return smartReCraneWorkPlanInfoList;
    }

    public void setSmartReCraneWorkPlanInfoList(List<SmartReCraneWorkPlanInfo> smartReCraneWorkPlanInfoList) {
        this.smartReCraneWorkPlanInfoList = smartReCraneWorkPlanInfoList;
    }

    public SmartReMessageInfo getSmartReMessageInfo() {
        return smartReMessageInfo;
    }

    public void setSmartReMessageInfo(SmartReMessageInfo smartReMessageInfo) {
        this.smartReMessageInfo = smartReMessageInfo;
    }

}
