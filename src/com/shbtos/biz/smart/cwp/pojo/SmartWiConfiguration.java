package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by csw on 2017/4/18 15:14.
 * Explain: 指令相关配置参数
 */
public class SmartWiConfiguration {

    private Long intervalTime;//获取某时间段的指令

    public Long getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
    }
}
