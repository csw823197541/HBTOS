package com.shbtos.biz.smart.cwp.service;

import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpBlockInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReCwpValidatorInfo;
import com.shbtos.biz.smart.cwp.pojo.Results.SmartReMessageInfo;
import com.shbtos.biz.smart.cwp.pojo.SmartCwpWorkBlockInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by csw on 2017/11/15.
 * Description:
 */
public class SmartCwpValidatorResults {

    private SmartReMessageInfo smartReMessageInfo;

    private List<SmartReCwpValidatorInfo> smartReCwpValidatorInfoList;
    private List<SmartReCwpBlockInfo> smartReCwpBlockInfoList;

    public SmartCwpValidatorResults() {
        smartReMessageInfo = new SmartReMessageInfo();
        smartReCwpValidatorInfoList = new ArrayList<>();
        smartReCwpBlockInfoList = new ArrayList<>();
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

    public List<SmartReCwpBlockInfo> getSmartReCwpBlockInfoList() {
        return smartReCwpBlockInfoList;
    }

    public void setSmartReCwpBlockInfoList(List<SmartReCwpBlockInfo> smartReCwpBlockInfoList) {
        this.smartReCwpBlockInfoList = smartReCwpBlockInfoList;
    }
}
