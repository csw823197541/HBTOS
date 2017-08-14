package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SmartAreaDistanceInfoInfo {
    private String areaNo;//箱区ID
    private Long berthId;         //船舶靠泊ID
    private Long bayId;	//船舶倍位Id
    private String bayNo;	//船舶倍位
    private Long distanceTime;   //AGV箱区到达船舶倍位的行驶时间

    public String getBayNo() {
        return bayNo;
    }

    public void setBayNo(String bayNo) {
        this.bayNo = bayNo;
    }
    public Long getDistanceTime() {
        return distanceTime;
    }

    public void setDistanceTime(Long distanceTime) {
        this.distanceTime = distanceTime;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getBayId() {
        return bayId;
    }

    public void setBayId(Long bayId) {
        this.bayId = bayId;
    }
}
