package com.shbtos.biz.smart.cwp.service;


import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpBlockInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpModalInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpWorkOrderInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReMessageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuminhang on 2017/2/9.
 * 用于存储CWP运算结果
 */
public class SmartCwp3Results {

    private SmartReMessageInfo smartReMessageInfo;
    private List<SmartReCwpModalInfo> smartReCwpModalInfoList;

    public SmartCwp3Results() {
        this.smartReMessageInfo = new SmartReMessageInfo();
        smartReCwpModalInfoList = new ArrayList<>();
    }

    public SmartReMessageInfo getSmartReMessageInfo() {
        return smartReMessageInfo;
    }

    public void setSmartReMessageInfo(SmartReMessageInfo smartReMessageInfo) {
        this.smartReMessageInfo = smartReMessageInfo;
    }

    public List<SmartReCwpModalInfo> getSmartReCwpModalInfoList() {
        return smartReCwpModalInfoList;
    }

    public void setSmartReCwpModalInfoList(List<SmartReCwpModalInfo> smartReCwpModalInfoList) {
        this.smartReCwpModalInfoList = smartReCwpModalInfoList;
    }
}
