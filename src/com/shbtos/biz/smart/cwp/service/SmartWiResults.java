package com.shbtos.biz.smart.cwp.service;

import com.shbtos.biz.smart.cwp.pojo.Results.SmartReAutoWiInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReMessageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/2.
 */
public class SmartWiResults {

    private List<SmartReAutoWiInfo> smartReAutoWiInfos;
    private SmartReMessageInfo smartReMessageInfo;

    public SmartWiResults() {
        smartReAutoWiInfos = new ArrayList<>();
        smartReMessageInfo = new SmartReMessageInfo();
    }

    public SmartReMessageInfo getSmartReMessageInfo() {
        return smartReMessageInfo;
    }

    public void setSmartReMessageInfo(SmartReMessageInfo smartReMessageInfo) {
        this.smartReMessageInfo = smartReMessageInfo;
    }

    public List<SmartReAutoWiInfo> getSmartReAutoWiInfos() {
        return smartReAutoWiInfos;
    }

    public void setSmartReAutoWiInfos(List<SmartReAutoWiInfo> smartReAutoWiInfos) {
        this.smartReAutoWiInfos = smartReAutoWiInfos;
    }
}
