package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SmartStowageConfigurationInfo {

    private Long berthId; //靠泊Id
    private String twinWeightDifference;                    // 双箱吊两个箱子的重量差
    private String twinHeightDifference;                    //双箱吊两个箱子的高度差
    private Boolean reverseLoad;//舱内倒配参数
    private Integer weightLevelPoint; //重量等级罚分基数：同一个重量等级的箱子在不同的位置罚分不同，默认值60，建议参考值范围50-80
    private Double proportion; //箱区装卸能力比：箱区的装卸比例，给卸船空出工作能力，默认值0.9，建议参考值范围0.8-0.9
    private Integer secondBoxPoint; //双箱的第二个箱子调整值：双箱的第二个箱子尽量同一箱区出箱，所以和第一个箱子同箱区的候选箱会减少罚分，默认值2000，建议参考值范围500-2000
    private Integer containerNumPoint; //双箱的第一个箱子调整值：双箱吊的第一个箱子，如果该箱区中该属性组重量等级的箱子多，则该箱区减少罚分，默认值100，建议参考值范围100-200
    private Integer underWeightDifference; //舱内允许重量差

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

    public Integer getWeightLevelPoint() {
        return weightLevelPoint;
    }

    public void setWeightLevelPoint(Integer weightLevelPoint) {
        this.weightLevelPoint = weightLevelPoint;
    }

    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    public Integer getSecondBoxPoint() {
        return secondBoxPoint;
    }

    public void setSecondBoxPoint(Integer secondBoxPoint) {
        this.secondBoxPoint = secondBoxPoint;
    }

    public Integer getContainerNumPoint() {
        return containerNumPoint;
    }

    public void setContainerNumPoint(Integer containerNumPoint) {
        this.containerNumPoint = containerNumPoint;
    }

    public Integer getUnderWeightDifference() {
        return underWeightDifference;
    }

    public void setUnderWeightDifference(Integer underWeightDifference) {
        this.underWeightDifference = underWeightDifference;
    }
}
