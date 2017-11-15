package com.shbtos.biz.smart.cwp.service;

import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpValidatorInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReMessageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by csw on 2017/11/15.
 * Description:
 */
public class SmartCwpValidatorResults {

    private SmartReMessageInfo smartReMessageInfo;

    private List<SmartReCwpValidatorInfo> smartReCwpValidatorInfoList;

    public SmartCwpValidatorResults() {
        smartReMessageInfo = new SmartReMessageInfo();
        smartReCwpValidatorInfoList = new ArrayList<>();
    }

    public SmartReMessageInfo getSmartReMessageInfo() {
        return smartReMessageInfo;
    }

    public void setSmartReMessageInfo(SmartReMessageInfo smartReMessageInfo) {
        this.smartReMessageInfo = smartReMessageInfo;
    }

    public List<SmartReCwpValidatorInfo> getSmartReCwpValidatorInfoList() {
        return smartReCwpValidatorInfoList;
    }

    public void setSmartReCwpValidatorInfoList(List<SmartReCwpValidatorInfo> smartReCwpValidatorInfoList) {
        this.smartReCwpValidatorInfoList = smartReCwpValidatorInfoList;
    }
}
