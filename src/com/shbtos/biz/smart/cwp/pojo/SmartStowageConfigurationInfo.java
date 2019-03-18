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
    private Integer aboveWeightDifference; //甲板上允许重压轻参数
    private Integer realSearchWidth; //实际搜索宽度
    private Integer realSearchDepth; //实际搜索深度
    private Integer aboveTier; //甲板上配重箱的层数，0表示不需要，1-10代表有多少层需要配重箱，默认是1
    private Integer hatchTail; //从这个倍位号开始都配轻箱，大倍位号2、6，默认不需要考虑此参数时，设置超过船舶最大倍位号：1000
    private Boolean underDeckPriority; //尾舱划分轻的情况下，对应这几个舱的甲板下是否划重箱，默认为false
    private Integer restowCntrTime; //翻一个箱子的倒箱时间
    private Integer ascWorkCntrTime; //Asc作业一个箱子的时间
    private String twinWeightIdDifference;//双箱吊两个箱子的重量等级差值，默认是0：表示同一等级；1表示相差1个等级；2表示相差2个等级
    private Integer hatchHead; // 这个倍位之前的倍位配轻箱，默认值0
    private Boolean aboveDeckPriority; // 头舱划分轻的情况下，对应的这几个舱的甲板下是否优先划重箱，默认值false

    public Integer getRestowCntrTime() {
        return restowCntrTime;
    }

    public void setRestowCntrTime(Integer restowCntrTime) {
        this.restowCntrTime = restowCntrTime;
    }

    public Integer getAscWorkCntrTime() {
        return ascWorkCntrTime;
    }

    public void setAscWorkCntrTime(Integer ascWorkCntrTime) {
        this.ascWorkCntrTime = ascWorkCntrTime;
    }

    public Integer getAboveTier() {
        return aboveTier;
    }

    public void setAboveTier(Integer aboveTier) {
        this.aboveTier = aboveTier;
    }

    public Integer getHatchTail() {
        return hatchTail;
    }

    public void setHatchTail(Integer hatchTail) {
        this.hatchTail = hatchTail;
    }

    public Boolean getUnderDeckPriority() {
        return underDeckPriority;
    }

    public void setUnderDeckPriority(Boolean underDeckPriority) {
        this.underDeckPriority = underDeckPriority;
    }

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

    public Integer getAboveWeightDifference() {
        return aboveWeightDifference;
    }

    public void setAboveWeightDifference(Integer aboveWeightDifference) {
        this.aboveWeightDifference = aboveWeightDifference;
    }

    public Integer getRealSearchWidth() {
        return realSearchWidth;
    }

    public void setRealSearchWidth(Integer realSearchWidth) {
        this.realSearchWidth = realSearchWidth;
    }

    public Integer getRealSearchDepth() {
        return realSearchDepth;
    }

    public void setRealSearchDepth(Integer realSearchDepth) {
        this.realSearchDepth = realSearchDepth;
    }

    public String getTwinWeightIdDifference() {
        return twinWeightIdDifference;
    }

    public void setTwinWeightIdDifference(String twinWeightIdDifference) {
        this.twinWeightIdDifference = twinWeightIdDifference;
    }

    public Integer getHatchHead() {
        return hatchHead;
    }

    public void setHatchHead(Integer hatchHead) {
        this.hatchHead = hatchHead;
    }

    public Boolean getAboveDeckPriority() {
        return aboveDeckPriority;
    }

    public void setAboveDeckPriority(Boolean aboveDeckPriority) {
        this.aboveDeckPriority = aboveDeckPriority;
    }
}
