package com.shbtos.biz.smart.cwp.pojo.Results;

/**
 * Created by csw on 2018/1/25.
 * Description:
 */
public class SmartReExchangedWiInfo {

    private Long berthId; //靠泊Id
    private Long vpcCntId; //船图箱Id
    private String vLocation; //船箱位信息
    private Long yardContainerId; //交换后新的在场箱Id

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getVpcCntId() {
        return vpcCntId;
    }

    public void setVpcCntId(Long vpcCntId) {
        this.vpcCntId = vpcCntId;
    }

    public String getvLocation() {
        return vLocation;
    }

    public void setvLocation(String vLocation) {
        this.vLocation = vLocation;
    }

    public Long getYardContainerId() {
        return yardContainerId;
    }

    public void setYardContainerId(Long yardContainerId) {
        this.yardContainerId = yardContainerId;
    }
}
