package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by liuminhang on 2017/1/19.
 * 配载预留位置，用于控制配载加载和避免亏舱的情况
 */
public class SmartStowageLockLocationsInfo {
    private Long berthId;         //靠泊ID
    private Long hatchId;         //舱ID
    private String vLocation;		//船箱位
    private String lduldfg;    //装卸船标志

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getHatchId() {
        return hatchId;
    }

    public void setHatchId(Long hatchId) {
        this.hatchId = hatchId;
    }

    public String getvLocation() {
        return vLocation;
    }

    public void setvLocation(String vLocation) {
        this.vLocation = vLocation;
    }

    public String getLduldfg() {
        return lduldfg;
    }

    public void setLduldfg(String lduldfg) {
        this.lduldfg = lduldfg;
    }
}
