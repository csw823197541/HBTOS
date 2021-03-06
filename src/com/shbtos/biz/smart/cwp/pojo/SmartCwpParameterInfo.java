package com.shbtos.biz.smart.cwp.pojo;


/**
 * Created by csw on 2017/4/19 20:04.
 * Explain: CWP算法相关的配置参数
 */
public class SmartCwpParameterInfo {

    private Long berthId; //靠泊Id

    //全局参数
    private Integer twinWeightDiff; //双箱吊工艺的重量差允许范围
    private Double safeDistance; //桥机安全距离，14米
    private Long crossBarTime;//桥机跨机械起趴大梁移动时间，900s
    private Double craneMoveSpeed; //桥机移动速度，0.75m/s
    private Long unlockTwistTime; //甲板上拆锁时间，甲板五层高及以上集装箱拆锁用时，90s

    private String hatchCoverTime; //桥机作业单块舱盖板时间：240,240（装,卸）；240（装卸一样）
    private String single20FootPadTime; //单20尺垫脚箱作业用时：180,180（装,卸）；180（装卸一样）
    private String single20SeparateTime; //单20尺全隔槽作业用：180,180（装,卸）；180（装卸一样）
    private String single20HalfSeparateTime; //单20尺半隔槽作业用时：180,180（装,卸）；180（装卸一样）
    private String single20Time; //单20尺普通箱作业用时：120,120/130,130（甲板上装,甲板上卸/甲板下装,甲板下卸）；120/130（甲板上装卸一样/甲板下装卸一样）；120（甲板上下装卸一样）
    private String single40Time; //单40尺普通箱作业用时：120,120/130,130（甲板上装,甲板上卸/甲板下装,甲板下卸）；120/130（甲板上装卸一样/甲板下装卸一样）；120（甲板上下装卸一样）
    private String single45Time; //单45尺普通箱作业用时：120,120/130,130（甲板上装,甲板上卸/甲板下装,甲板下卸）；120/130（甲板上装卸一样/甲板下装卸一样）；120（甲板上下装卸一样）
    private String double20Time; //双20尺普通箱作业用时：150,150/150,150（甲板上装,甲板上卸/甲板下装,甲板下卸）；120/130（甲板上装卸一样/甲板下装卸一样）；120（甲板上下装卸一样）
    private String double40Time; //双吊具40尺作业用时：140,140/140,140（甲板上装,甲板上卸/甲板下装,甲板下卸）；140/140（甲板上装卸一样/甲板下装卸一样）；140（甲板上下装卸一样）
    private String double45Time; //双吊具45尺作业用时：140,140/140,140（甲板上装,甲板上卸/甲板下装,甲板下卸）；140/140（甲板上装卸一样/甲板下装卸一样）；140（甲板上下装卸一样）
    private String specialCntTime; //超限箱、分体大件作业用时：360,360/360,360（甲板上装,甲板上卸/甲板下装,甲板下卸）；360/360（甲板上装卸一样/甲板下装卸一样）；360（甲板上下装卸一样）
    private String dangerCntTime; //直装直提危险品作业用时：360,360/360,360（甲板上装,甲板上卸/甲板下装,甲板下卸）；360/360（甲板上装卸一样/甲板下装卸一样）；360（甲板上下装卸一样）

    private Long badCntTime; //故障箱处理用时：360s
    private Long hatchScanTime; //桥机换倍船扫时间：300s
    private Double impactFactor; //特殊因素影响效率的影响因子：1.0

    //单船功能参数
    private Boolean setupBridge;//是否过驾驶台
    private Boolean setupChimney;//是否果烟囱
    private String ldStrategy;//装卸策略，即边装边卸：BLD、一般装卸：LD，默认驳船不做边装边卸，大船能做边装边卸就做
    private Integer craneAdviceNumber;//建议开路数
    private String recycleCntWiFlag; //回收指令标记，控制是否回收队列中的指令，Y表示回收，N表示不回收
    private String craneAdviceWorkBayNos; //桥机第一次开路倍位，四部桥机101、102、103、104，开路倍位设置依次为格式："02,10,00,49"倍位之间用","隔开，"00"代表对应桥机不设置开路倍位

    //单船CWP决策参数
    private String loadPrior; //船舶开路装卸平衡考虑参数。首次开路全装、首次开路全卸、首次开路装卸错开:"L"、"D"、"LD"
    private String craneSameWorkTime; //均衡每部桥吊的作业量，整船桥吊同时完工，Y/N
    private String deckWorkLater; //避免开工作业甲板装船箱，避让时间为开工后一小时，Y/N
    private String mainRoadOneCrane; //重点路单桥吊持续作业，其余箱量由左右桥吊分配， Y/N
    private String dividedHatchFirst; //分割舱优先作业设定，Y/N，默认是N
    private String craneNotSameWorkTime; //桥机作业量不平均（桥机作业范围按驾驶台/烟囱划分，分割舱最少），Y/N
    private String splitRoad; //劈路原则，Y/N，默认是Y

    // 双吊具控制参数
    private Double allContainerWeight; // 双吊具工艺作业的集装箱合计重量限制，默认<=60000kg可以作业
    private Double tandemWeightDiff; // 双吊具工艺一关作业的两箱重量差限制，默认<=20000kg可作业
    private Double tandemHeightDiff; // 双吊具工艺一关作业的两箱高度差限制，默认<=40cm可作业
    private String tandemContainerType; // 双吊具工艺可以作业的箱型，默认值："GP,HC,OT"。（OT箱带超限标记的不包括在内）
    private String tandemDangerCnt; // 双吊具工艺可以作业危险品箱型类别，默认值："3,6,8,9"

    private String multiThreadFlag; // 是否使用多线程，"Y"表示使用多线程，"N"或者null表示不使用多线程

    public String getCraneAdviceWorkBayNos() {
        return craneAdviceWorkBayNos;
    }

    public void setCraneAdviceWorkBayNos(String craneAdviceWorkBayNos) {
        this.craneAdviceWorkBayNos = craneAdviceWorkBayNos;
    }

    public String getRecycleCntWiFlag() {
        return recycleCntWiFlag;
    }

    public void setRecycleCntWiFlag(String recycleCntWiFlag) {
        this.recycleCntWiFlag = recycleCntWiFlag;
    }

    public String getSplitRoad() {
        return splitRoad;
    }

    public void setSplitRoad(String splitRoad) {
        this.splitRoad = splitRoad;
    }

    public String getCraneNotSameWorkTime() {
        return craneNotSameWorkTime;
    }

    public void setCraneNotSameWorkTime(String craneNotSameWorkTime) {
        this.craneNotSameWorkTime = craneNotSameWorkTime;
    }

    public Long getHatchScanTime() {
        return hatchScanTime;
    }

    public void setHatchScanTime(Long hatchScanTime) {
        this.hatchScanTime = hatchScanTime;
    }

    public Integer getTwinWeightDiff() {
        return twinWeightDiff;
    }

    public void setTwinWeightDiff(Integer twinWeightDiff) {
        this.twinWeightDiff = twinWeightDiff;
    }

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Double getSafeDistance() {
        return safeDistance;
    }

    public void setSafeDistance(Double safeDistance) {
        this.safeDistance = safeDistance;
    }

    public Long getCrossBarTime() {
        return crossBarTime;
    }

    public void setCrossBarTime(Long crossBarTime) {
        this.crossBarTime = crossBarTime;
    }

    public Double getCraneMoveSpeed() {
        return craneMoveSpeed;
    }

    public void setCraneMoveSpeed(Double craneMoveSpeed) {
        this.craneMoveSpeed = craneMoveSpeed;
    }

    public Long getUnlockTwistTime() {
        return unlockTwistTime;
    }

    public void setUnlockTwistTime(Long unlockTwistTime) {
        this.unlockTwistTime = unlockTwistTime;
    }

    public String getHatchCoverTime() {
        return hatchCoverTime;
    }

    public void setHatchCoverTime(String hatchCoverTime) {
        this.hatchCoverTime = hatchCoverTime;
    }

    public String getSingle20Time() {
        return single20Time;
    }

    public void setSingle20Time(String single20Time) {
        this.single20Time = single20Time;
    }

    public String getSingle20FootPadTime() {
        return single20FootPadTime;
    }

    public void setSingle20FootPadTime(String single20FootPadTime) {
        this.single20FootPadTime = single20FootPadTime;
    }

    public String getSingle20SeparateTime() {
        return single20SeparateTime;
    }

    public void setSingle20SeparateTime(String single20SeparateTime) {
        this.single20SeparateTime = single20SeparateTime;
    }

    public String getSingle20HalfSeparateTime() {
        return single20HalfSeparateTime;
    }

    public void setSingle20HalfSeparateTime(String single20HalfSeparateTime) {
        this.single20HalfSeparateTime = single20HalfSeparateTime;
    }

    public String getSingle40Time() {
        return single40Time;
    }

    public void setSingle40Time(String single40Time) {
        this.single40Time = single40Time;
    }

    public String getSingle45Time() {
        return single45Time;
    }

    public void setSingle45Time(String single45Time) {
        this.single45Time = single45Time;
    }

    public String getDouble20Time() {
        return double20Time;
    }

    public void setDouble20Time(String double20Time) {
        this.double20Time = double20Time;
    }

    public String getDouble40Time() {
        return double40Time;
    }

    public void setDouble40Time(String double40Time) {
        this.double40Time = double40Time;
    }

    public String getDouble45Time() {
        return double45Time;
    }

    public void setDouble45Time(String double45Time) {
        this.double45Time = double45Time;
    }

    public String getSpecialCntTime() {
        return specialCntTime;
    }

    public void setSpecialCntTime(String specialCntTime) {
        this.specialCntTime = specialCntTime;
    }

    public String getDangerCntTime() {
        return dangerCntTime;
    }

    public void setDangerCntTime(String dangerCntTime) {
        this.dangerCntTime = dangerCntTime;
    }

    public Long getBadCntTime() {
        return badCntTime;
    }

    public void setBadCntTime(Long badCntTime) {
        this.badCntTime = badCntTime;
    }

    public Double getImpactFactor() {
        return impactFactor;
    }

    public void setImpactFactor(Double impactFactor) {
        this.impactFactor = impactFactor;
    }

    public Boolean getSetupBridge() {
        return setupBridge;
    }

    public void setSetupBridge(Boolean setupBridge) {
        this.setupBridge = setupBridge;
    }

    public Boolean getSetupChimney() {
        return setupChimney;
    }

    public void setSetupChimney(Boolean setupChimney) {
        this.setupChimney = setupChimney;
    }

    public String getLdStrategy() {
        return ldStrategy;
    }

    public void setLdStrategy(String ldStrategy) {
        this.ldStrategy = ldStrategy;
    }

    public Integer getCraneAdviceNumber() {
        return craneAdviceNumber;
    }

    public void setCraneAdviceNumber(Integer craneAdviceNumber) {
        this.craneAdviceNumber = craneAdviceNumber;
    }

    public String getLoadPrior() {
        return loadPrior;
    }

    public void setLoadPrior(String loadPrior) {
        this.loadPrior = loadPrior;
    }

    public String getCraneSameWorkTime() {
        return craneSameWorkTime;
    }

    public void setCraneSameWorkTime(String craneSameWorkTime) {
        this.craneSameWorkTime = craneSameWorkTime;
    }

    public String getDeckWorkLater() {
        return deckWorkLater;
    }

    public void setDeckWorkLater(String deckWorkLater) {
        this.deckWorkLater = deckWorkLater;
    }

    public String getMainRoadOneCrane() {
        return mainRoadOneCrane;
    }

    public void setMainRoadOneCrane(String mainRoadOneCrane) {
        this.mainRoadOneCrane = mainRoadOneCrane;
    }

    public String getDividedHatchFirst() {
        return dividedHatchFirst;
    }

    public void setDividedHatchFirst(String dividedHatchFirst) {
        this.dividedHatchFirst = dividedHatchFirst;
    }

    public Double getAllContainerWeight() {
        return allContainerWeight;
    }

    public void setAllContainerWeight(Double allContainerWeight) {
        this.allContainerWeight = allContainerWeight;
    }

    public Double getTandemWeightDiff() {
        return tandemWeightDiff;
    }

    public void setTandemWeightDiff(Double tandemWeightDiff) {
        this.tandemWeightDiff = tandemWeightDiff;
    }

    public Double getTandemHeightDiff() {
        return tandemHeightDiff;
    }

    public void setTandemHeightDiff(Double tandemHeightDiff) {
        this.tandemHeightDiff = tandemHeightDiff;
    }

    public String getTandemContainerType() {
        return tandemContainerType;
    }

    public void setTandemContainerType(String tandemContainerType) {
        this.tandemContainerType = tandemContainerType;
    }

    public String getTandemDangerCnt() {
        return tandemDangerCnt;
    }

    public void setTandemDangerCnt(String tandemDangerCnt) {
        this.tandemDangerCnt = tandemDangerCnt;
    }

    public String getMultiThreadFlag() {
        return multiThreadFlag;
    }

    public void setMultiThreadFlag(String multiThreadFlag) {
        this.multiThreadFlag = multiThreadFlag;
    }
}
