package com.shbtos.biz.smart.cwp.service;


import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpBlockInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpWorkOrderInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReMessageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuminhang on 2017/2/9.
 * 用于存储CWP运算结果
 */
public class SmartCwpResults {

    private List<SmartReCwpBlockInfo> smartReCwpBlockInfoList;
    private List<SmartReCwpWorkOrderInfo> smartReCwpWorkOrderInfoList;

    private SmartReMessageInfo smartReMessageInfo;

    public SmartCwpResults() {
        this.smartReCwpWorkOrderInfoList = new ArrayList<>();
        this.smartReCwpBlockInfoList = new ArrayList<>();
        this.smartReMessageInfo = new SmartReMessageInfo();
    }

    public List<SmartReCwpBlockInfo> getSmartReCwpBlockInfoList() {
        return smartReCwpBlockInfoList;
    }

    public void setSmartReCwpBlockInfoList(List<SmartReCwpBlockInfo> smartReCwpBlockInfoList) {
        this.smartReCwpBlockInfoList = smartReCwpBlockInfoList;
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

    public void addSmartReCwpWorkOrderInfo(SmartReCwpWorkOrderInfo smartReCwpWorkOrderInfo) {
        this.smartReCwpWorkOrderInfoList.add(smartReCwpWorkOrderInfo);
    }
}
