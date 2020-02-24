package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by csw on 2017/4/10 21:18.
 * Explain: 堆场作业信息
 */
public class SmartYardWorkTimeInfo {

    private Integer restowCntrTime; // 翻一个箱子的倒箱时间
    private Integer ascWorkCntrTime; // Asc作业一个箱子的时间

    public Integer getAscWorkCntrTime() {
        return ascWorkCntrTime;
    }

    public void setAscWorkCntrTime(Integer ascWorkCntrTime) {
        this.ascWorkCntrTime = ascWorkCntrTime;
    }

    public Integer getRestowCntrTime() {
        return restowCntrTime;
    }

    public void setRestowCntrTime(Integer restowCntrTime) {
        this.restowCntrTime = restowCntrTime;
    }



}

