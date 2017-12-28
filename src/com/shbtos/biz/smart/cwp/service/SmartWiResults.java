package com.shbtos.biz.smart.cwp.service;

import com.shbtos.biz.smart.cwp.pojo.Results.SmartReAutoWiInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpBlockInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReMessageInfo;
import com.shbtos.biz.smart.cwp.pojo.SmartCwpWorkBlockInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/2.
 */
public class SmartWiResults {

    private List<SmartReAutoWiInfo> smartReAutoWiInfos;
    private SmartReMessageInfo smartReMessageInfo;

    private List<SmartReCwpBlockInfo> smartReCwpBlockInfoList;

    public SmartWiResults() {
        smartReAutoWiInfos = new ArrayList<>();
        smartReMessageInfo = new SmartReMessageInfo();
        smartReCwpBlockInfoList = new ArrayList<>();
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

    public List<SmartReCwpBlockInfo> getSmartReCwpBlockInfoList() {
        return smartReCwpBlockInfoList;
    }

    public void setSmartReCwpBlockInfoList(List<SmartReCwpBlockInfo> smartReCwpBlockInfoList) {
        this.smartReCwpBlockInfoList = smartReCwpBlockInfoList;
    }
}
