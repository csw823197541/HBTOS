package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SmartCntrWorkTimeInfo {

    private String containerNo;                    //箱子
    private String ylocation;                    //场箱位
    private Integer ascWorkCntrTime;            //Asc作业一个箱子的时间，（不考虑翻箱时间，考虑了ASC的移动时间么？）

    public Integer getAscWorkCntrTime() {
        return ascWorkCntrTime;
    }

    public void setAscWorkCntrTime(Integer ascWorkCntrTime) {
        this.ascWorkCntrTime = ascWorkCntrTime;
    }

    public String getYlocation() {
        return ylocation;
    }

    public void setYlocation(String ylocation) {
        this.ylocation = ylocation;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }
}
