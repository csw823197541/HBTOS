package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by csw on 2017/4/18 15:14.
 * Explain: 指令相关配置参数
 */
public class SmartWiConfiguration {

    private Long intervalTime;//获取某时间段的指令
    private Long deckWeightDifference; //甲板上箱子交换重量差参数
    private Long hatchWeightDifference; //舱下箱子交换重量差参数
    private Long hatchSideWeightDifference; //甲板上里外档两跟槽重量差参数

    public Long getDeckWeightDifference() {
        return deckWeightDifference;
    }

    public void setDeckWeightDifference(Long deckWeightDifference) {
        this.deckWeightDifference = deckWeightDifference;
    }

    public Long getHatchWeightDifference() {
        return hatchWeightDifference;
    }

    public void setHatchWeightDifference(Long hatchWeightDifference) {
        this.hatchWeightDifference = hatchWeightDifference;
    }

    public Long getHatchSideWeightDifference() {
        return hatchSideWeightDifference;
    }

    public void setHatchSideWeightDifference(Long hatchSideWeightDifference) {
        this.hatchSideWeightDifference = hatchSideWeightDifference;
    }

    public Long getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
    }
}
