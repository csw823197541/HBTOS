package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SmartStowageConfigurationInfo {

    private Long berthId; //靠泊Id
    private String twinWeightDifference;                    // 双箱吊两个箱子的重量差
    private String twinHeightDifference;                    //双箱吊两个箱子的高度差
    private Boolean reverseLoad;//舱内倒配参数

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public String getTwinWeightDifference() {
        return twinWeightDifference;
    }

    public void setTwinWeightDifference(String twinWeightDifference) {
        this.twinWeightDifference = twinWeightDifference;
    }

    public String getTwinHeightDifference() {
        return twinHeightDifference;
    }

    public void setTwinHeightDifference(String twinHeightDifference) {
        this.twinHeightDifference = twinHeightDifference;
    }

    public Boolean getReverseLoad() {
        return reverseLoad;
    }

    public void setReverseLoad(Boolean reverseLoad) {
        this.reverseLoad = reverseLoad;
    }
}
