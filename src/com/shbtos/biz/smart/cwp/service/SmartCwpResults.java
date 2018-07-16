package com.shbtos.biz.smart.cwp.service;


import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwp3BlockInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpBlockInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpWorkOrderInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReMessageInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liuminhang on 2017/2/9.
 * 用于存储CWP运算结果
 */
public class SmartCwpResults {

    private List<SmartReCwpBlockInfo> smartReCwpBlockInfoList;
    private List<SmartReCwpWorkOrderInfo> smartReCwpWorkOrderInfoList;

    private SmartReMessageInfo smartReMessageInfo;

    private Map<String, List<SmartReCwp3BlockInfo>> smartReCwp3BlockInfoMap;
    private Map<String, List<SmartReCwpWorkOrderInfo>> smartReCwpWorkOrderInfoMap;

    public SmartCwpResults() {
        this.smartReCwpWorkOrderInfoList = new ArrayList<>();
        this.smartReCwpBlockInfoList = new ArrayList<>();
        this.smartReMessageInfo = new SmartReMessageInfo();
        smartReCwp3BlockInfoMap = new HashMap<>();
        smartReCwpWorkOrderInfoMap = new HashMap<>();
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

    public Map<String, List<SmartReCwp3BlockInfo>> getSmartReCwp3BlockInfoMap() {
        return smartReCwp3BlockInfoMap;
    }

    public void setSmartReCwp3BlockInfoMap(Map<String, List<SmartReCwp3BlockInfo>> smartReCwp3BlockInfoMap) {
        this.smartReCwp3BlockInfoMap = smartReCwp3BlockInfoMap;
    }

    public Map<String, List<SmartReCwpWorkOrderInfo>> getSmartReCwpWorkOrderInfoMap() {
        return smartReCwpWorkOrderInfoMap;
    }

    public void setSmartReCwpWorkOrderInfoMap(Map<String, List<SmartReCwpWorkOrderInfo>> smartReCwpWorkOrderInfoMap) {
        this.smartReCwpWorkOrderInfoMap = smartReCwpWorkOrderInfoMap;
    }
}
