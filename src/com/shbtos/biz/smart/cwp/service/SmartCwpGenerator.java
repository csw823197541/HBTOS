package com.shbtos.biz.smart.cwp.service;

/**
 * Created by csw on 2017/4/19.
 * HBTOS调用接口方法
 */
public class SmartCwpGenerator {

    private SmartCwpResults smartCwpResults;
    private SmartStowResults smartStowResults;
    private SmartWiResults smartWiResults;

    public SmartCwpResults doWorkFlowAndOrder(SmartCwpImportData smartCwpImportData) {

        try {
            smartCwpResults = new SmartCwpResults();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return smartCwpResults;
    }

    public SmartCwpResults doPlanCwp(SmartCwpImportData smartCwpImportData, String cwpType) {

        try {
            smartCwpResults = new SmartCwpResults();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return smartCwpResults;
    }

    public SmartCwpResults allocateCraneResource(SmartCwpImportData smartCwpImportData, String cwpType) {

        try {
            smartCwpResults = new SmartCwpResults();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return smartCwpResults;
    }

    public SmartCwpResults doWorkCwp(SmartCwpImportData smartCwpImportData, String cwpType) {

        try {
            smartCwpResults = new SmartCwpResults();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return smartCwpResults;
    }

    public SmartStowResults doWeightLevelDivision(SmartStowImportData smartStowImportData) {

        try {
            smartStowResults = new SmartStowResults();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return smartStowResults;
    }

    public SmartStowResults doStow(SmartStowImportData smartStowImportData, String cwpType) {

        try {
            smartStowResults = new SmartStowResults();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return smartStowResults;
    }

    public SmartStowResults doRealTimeStow(SmartStowImportData smartStowImportData, String cwpType) {

        try {
            smartStowResults = new SmartStowResults();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return smartStowResults;
    }

    public SmartWiResults doWi(SmartWiImportData smartWiImportData, String cwpType) {

        try {
            smartWiResults = new SmartWiResults();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return smartWiResults;
    }

}
