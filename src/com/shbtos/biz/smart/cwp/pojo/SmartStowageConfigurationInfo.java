package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SmartStowageConfigurationInfo {

    private Long berthId; //靠泊Id
    private String twinWeightDifference;                    // 双箱吊两个箱子的重量差
    private String twinHeightDifference;                    //双箱吊两个箱子的高度差
    private Boolean reverseLoad; //舱内倒配参数
    private Double loadDiscProportion; //箱区装卸能力比：箱区的装卸比例，给卸船空出工作能力，默认值0.9，建议参考值范围0.8-0.9
    private Integer underWeightDifference; //舱内允许重量差，单位kg

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

    public Double getLoadDiscProportion() {
        return loadDiscProportion;
    }

    public void setLoadDiscProportion(Double loadDiscProportion) {
        this.loadDiscProportion = loadDiscProportion;
    }

    public Integer getUnderWeightDifference() {
        return underWeightDifference;
    }

    public void setUnderWeightDifference(Integer underWeightDifference) {
        this.underWeightDifference = underWeightDifference;
    }
}
