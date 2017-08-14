package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by liuminhang on 2017/1/19.
 * 堆场给出的CWP开路建议，用于尽量满足开路数
 */
public class SmartAdviseConfigureInfo {
    private String containerStatus;// 箱状态
    private Integer craneWorkNumber;//建议全码头开路数量

    public String getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
    }

    public Integer getCraneWorkNumber() {
        return craneWorkNumber;
    }

    public void setCraneWorkNumber(Integer craneWorkNumber) {
        this.craneWorkNumber = craneWorkNumber;
    }
}
