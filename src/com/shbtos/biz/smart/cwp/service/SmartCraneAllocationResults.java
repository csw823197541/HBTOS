package com.shbtos.biz.smart.cwp.service;


import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCraneWorkPlanDetailInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCraneWorkPlanInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReMessageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by csw on 2020/2/24.
 * Description: 桥机资源策划结果
 */
public class SmartCraneAllocationResults {

    private SmartReMessageInfo smartReMessageInfo;
    private List<SmartReCraneWorkPlanInfo> smartReCraneWorkPlanInfoList;
    private List<SmartReCraneWorkPlanDetailInfo> smartReCraneWorkPlanDetailInfoList;

    public SmartCraneAllocationResults() {
        this.smartReMessageInfo = new SmartReMessageInfo();
        smartReCraneWorkPlanInfoList = new ArrayList<>();
        smartReCraneWorkPlanDetailInfoList = new ArrayList<>();
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

    public List<SmartReCraneWorkPlanDetailInfo> getSmartReCraneWorkPlanDetailInfoList() {
        return smartReCraneWorkPlanDetailInfoList;
    }

    public void setSmartReCraneWorkPlanDetailInfoList(List<SmartReCraneWorkPlanDetailInfo> smartReCraneWorkPlanDetailInfoList) {
        this.smartReCraneWorkPlanDetailInfoList = smartReCraneWorkPlanDetailInfoList;
    }
}
