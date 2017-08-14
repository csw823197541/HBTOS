package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SmartContainerAreaInfoInfo {

    private String areaNo;//箱区ID
    private Integer bayNumber;//箱区倍位数
    private Integer rowNumber;//排的数量
    private Integer tierNumber;//层的数量
    private String areaType;//箱区吊机的类型
    private Integer dispatchedWork;//该箱区已指派的任务数量，可为空 自动配载这个数据无法提供
    private Integer preDispatchedWork;//该箱区预估的任务, 可为空


    public Integer getPreDispatchedWork() {
        return preDispatchedWork;
    }

    public void setPreDispatchedWork(Integer preDispatchedWork) {
        this.preDispatchedWork = preDispatchedWork;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public Integer getBayNumber() {
        return bayNumber;
    }

    public void setBayNumber(Integer bayNumber) {
        this.bayNumber = bayNumber;
    }

    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public Integer getTierNumber() {
        return tierNumber;
    }

    public void setTierNumber(Integer tierNumber) {
        this.tierNumber = tierNumber;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public Integer getDispatchedWork() {
        return dispatchedWork;
    }

    public void setDispatchedWork(Integer dispatchedWork) {
        this.dispatchedWork = dispatchedWork;
    }



}
