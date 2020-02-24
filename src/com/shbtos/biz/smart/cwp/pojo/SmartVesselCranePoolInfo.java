package com.shbtos.biz.smart.cwp.pojo;

import java.util.Date;

/**
 * Created by csw on 2018/9/16.
 * Description: 船舶桥机关联桥机池信息
 */
public class SmartVesselCranePoolInfo {
    private Long berthId;         //靠泊ID
    private Long poolId;         //桥吊池ID
    private Long addCraneNumber;//增加桥吊数量
    private Date addCraneDate;         //增加桥吊时间
    private Long delCraneNumber;//增加桥吊数量
    private Date delCraneDate;         //增加桥吊时间
    private String autoCwp;         //是否自动调度
    private String firstCraneNos; //定义开始作业的桥机有哪些，用逗号","隔开

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getPoolId() {
        return poolId;
    }

    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }

    public Long getAddCraneNumber() {
        return addCraneNumber;
    }

    public void setAddCraneNumber(Long addCraneNumber) {
        this.addCraneNumber = addCraneNumber;
    }

    public Date getAddCraneDate() {
        return addCraneDate;
    }

    public void setAddCraneDate(Date addCraneDate) {
        this.addCraneDate = addCraneDate;
    }

    public Long getDelCraneNumber() {
        return delCraneNumber;
    }

    public void setDelCraneNumber(Long delCraneNumber) {
        this.delCraneNumber = delCraneNumber;
    }

    public Date getDelCraneDate() {
        return delCraneDate;
    }

    public void setDelCraneDate(Date delCraneDate) {
        this.delCraneDate = delCraneDate;
    }

    public String getAutoCwp() {
        return autoCwp;
    }

    public void setAutoCwp(String autoCwp) {
        this.autoCwp = autoCwp;
    }

    public String getFirstCraneNos() {
        return firstCraneNos;
    }

    public void setFirstCraneNos(String firstCraneNos) {
        this.firstCraneNos = firstCraneNos;
    }
}
