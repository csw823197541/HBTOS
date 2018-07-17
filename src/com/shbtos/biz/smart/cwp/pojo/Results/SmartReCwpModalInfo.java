package com.shbtos.biz.smart.cwp.pojo.Results;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by csw on 2018/7/17.
 * Description:
 */
public class SmartReCwpModalInfo {

    private Long berthId; //靠泊Id
    private String modalName; //模板名称

    private List<SmartReCwpBlockInfo> smartReCwpBlockInfoList;
    private List<SmartReCwpWorkOrderInfo> smartReCwpWorkOrderInfoList;
    private List<SmartReCwpCraneEfficiencyInfo> smartReCwpCraneEfficiencyInfoList;
    private List<SmartReCwpAreaTaskInfo> smartReCwpAreaTaskInfoList;

    public SmartReCwpModalInfo() {
        smartReCwpBlockInfoList = new ArrayList<>();
        smartReCwpWorkOrderInfoList = new ArrayList<>();
        smartReCwpCraneEfficiencyInfoList = new ArrayList<>();
        smartReCwpAreaTaskInfoList = new ArrayList<>();
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

    public List<SmartReCwpCraneEfficiencyInfo> getSmartReCwpCraneEfficiencyInfoList() {
        return smartReCwpCraneEfficiencyInfoList;
    }

    public void setSmartReCwpCraneEfficiencyInfoList(List<SmartReCwpCraneEfficiencyInfo> smartReCwpCraneEfficiencyInfoList) {
        this.smartReCwpCraneEfficiencyInfoList = smartReCwpCraneEfficiencyInfoList;
    }

    public List<SmartReCwpAreaTaskInfo> getSmartReCwpAreaTaskInfoList() {
        return smartReCwpAreaTaskInfoList;
    }

    public void setSmartReCwpAreaTaskInfoList(List<SmartReCwpAreaTaskInfo> smartReCwpAreaTaskInfoList) {
        this.smartReCwpAreaTaskInfoList = smartReCwpAreaTaskInfoList;
    }

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public String getModalName() {
        return modalName;
    }

    public void setModalName(String modalName) {
        this.modalName = modalName;
    }
}
