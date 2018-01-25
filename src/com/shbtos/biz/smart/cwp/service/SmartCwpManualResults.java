package com.shbtos.biz.smart.cwp.service;

import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpWorkOrderInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReMessageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by csw on 2018/1/25.
 * Description:
 */
public class SmartCwpManualResults {

    private List<SmartReCwpWorkOrderInfo> smartReCwpWorkOrderInfoList;

    private SmartReMessageInfo smartReMessageInfo;

    public SmartCwpManualResults() {
        smartReCwpWorkOrderInfoList = new ArrayList<>();
        smartReMessageInfo = new SmartReMessageInfo();
    }

    public List<SmartReCwpWorkOrderInfo> getSmartReCwpWorkOrderInfoList() {
        return smartReCwpWorkOrderInfoList;
    }

    public void setSmartReCwpWorkOrderInfoList(List<SmartReCwpWorkOrderInfo> smartReCwpWorkOrderInfoList) {
        this.smartReCwpWorkOrderInfoList = smartReCwpWorkOrderInfoList;
    }

    public SmartReMessageInfo getSmartReMessageInfo() {
        return smartReMessageInfo;
    }

    public void setSmartReMessageInfo(SmartReMessageInfo smartReMessageInfo) {
        this.smartReMessageInfo = smartReMessageInfo;
    }
}
