package com.shbtos.biz.smart.cwp.pojo;


/**
 * Created by csw on 2017/4/19 20:04.
 * Explain: CWP算法相关的配置参数
 */
public class SmartCwpConfigurationInfo {

    private Long berthId; //靠泊Id

    private Integer twinWeightDiff; //双箱吊工艺的重量差允许范围

    private Long craneMeanEfficiency;//所有桥机平均效率，30关/小时
    private Double craneSpeed; //桥机移动速度，0.75m/s
    private Double craneSafeSpan; //桥机安全距离，28米
    private Long crossBarTime;//桥机跨机械起趴大梁移动时间，45分钟
    private Double machineHeight;//船舶机械高度参数，用于判断桥机跨机械是否起趴大梁，15米
    private Boolean crossBridge;//是否过驾驶台
    private Boolean crossChimney;//是否果烟囱

    private Long amount; //分割量界限参数，15关
    private Long delCraneTimeParam; //桥机退出作业的时间量参数，30分钟
    private Long addCraneTimeParam; //桥机加入作业的时间量参数，30分钟

    private Integer craneAdviceNumber;//建议开路数

    private Long keyBayWorkTime; //重点倍作业时间量增加参数，360分钟
    private Long dividedBayWorkTime; //分割倍作业时间量增加参数，60分钟
    private Long keepSelectedBayWorkTime; //保持在上次作业的倍位作业时间量增加参数，600分钟

    private Long breakDownCntTime;//故障箱处理时间，30分钟
    private String ldStrategy;//装卸策略，即边装边卸：BLD、一般装卸：LD，默认驳船不做边装边卸，大船能做边装边卸就做

    private Long autoDelCraneAmount; //自动减桥机参数，当剩余多少量时可以减掉旁边的桥机

    private Boolean keyBay; //重点路权重方法，默认值是true，表示桥机开路会优先考虑量最多的倍位。false：表示不调用这个方法
    private Boolean divideBay; //分割倍位权重，默认值为true，表示桥机换倍作业时，会优先考虑作业被分割了的倍位
    private Boolean changeSideCraneWork; //控制两边桥机回来作业，默认值是true。
    private Boolean divideByMaxRoad; //按最大作业量那条路将船舶分两边，最大量一部桥机作业，两边桥机平均分配剩余作业量，默认值为false。

    private Integer loadFirstParam; //装船优先开路参数，该参数控制尽量先开装船的倍位，默认参数是2(可以调成更大)：桥机开路会尽量装卸错开开路；当参数调成0是：不进行装船优先考虑

    public Integer getLoadFirstParam() {
        return loadFirstParam;
    }

    public void setLoadFirstParam(Integer loadFirstParam) {
        this.loadFirstParam = loadFirstParam;
    }

    public Boolean getKeyBay() {
        return keyBay;
    }

    public void setKeyBay(Boolean keyBay) {
        this.keyBay = keyBay;
    }

    public Boolean getDivideBay() {
        return divideBay;
    }

    public void setDivideBay(Boolean divideBay) {
        this.divideBay = divideBay;
    }

    public Boolean getChangeSideCraneWork() {
        return changeSideCraneWork;
    }

    public void setChangeSideCraneWork(Boolean changeSideCraneWork) {
        this.changeSideCraneWork = changeSideCraneWork;
    }

    public Boolean getDivideByMaxRoad() {
        return divideByMaxRoad;
    }

    public void setDivideByMaxRoad(Boolean divideByMaxRoad) {
        this.divideByMaxRoad = divideByMaxRoad;
    }

    public Long getAutoDelCraneAmount() {
        return autoDelCraneAmount;
    }

    public void setAutoDelCraneAmount(Long autoDelCraneAmount) {
        this.autoDelCraneAmount = autoDelCraneAmount;
    }

    public Boolean getCrossBridge() {
        return crossBridge;
    }

    public void setCrossBridge(Boolean crossBridge) {
        this.crossBridge = crossBridge;
    }

    public Boolean getCrossChimney() {
        return crossChimney;
    }

    public void setCrossChimney(Boolean crossChimney) {
        this.crossChimney = crossChimney;
    }

    public String getLdStrategy() {
        return ldStrategy;
    }

    public void setLdStrategy(String ldStrategy) {
        this.ldStrategy = ldStrategy;
    }

    public Long getBreakDownCntTime() {
        return breakDownCntTime;
    }

    public void setBreakDownCntTime(Long breakDownCntTime) {
        this.breakDownCntTime = breakDownCntTime;
    }

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Integer getTwinWeightDiff() {
        return twinWeightDiff;
    }

    public void setTwinWeightDiff(Integer twinWeightDiff) {
        this.twinWeightDiff = twinWeightDiff;
    }

    public Long getCraneMeanEfficiency() {
        return craneMeanEfficiency;
    }

    public void setCraneMeanEfficiency(Long craneMeanEfficiency) {
        this.craneMeanEfficiency = craneMeanEfficiency;
    }

    public Double getCraneSpeed() {
        return craneSpeed;
    }

    public void setCraneSpeed(Double craneSpeed) {
        this.craneSpeed = craneSpeed;
    }

    public Double getCraneSafeSpan() {
        return craneSafeSpan;
    }

    public void setCraneSafeSpan(Double craneSafeSpan) {
        this.craneSafeSpan = craneSafeSpan;
    }

    public Long getCrossBarTime() {
        return crossBarTime;
    }

    public void setCrossBarTime(Long crossBarTime) {
        this.crossBarTime = crossBarTime;
    }

    public Double getMachineHeight() {
        return machineHeight;
    }

    public void setMachineHeight(Double machineHeight) {
        this.machineHeight = machineHeight;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getDelCraneTimeParam() {
        return delCraneTimeParam;
    }

    public void setDelCraneTimeParam(Long delCraneTimeParam) {
        this.delCraneTimeParam = delCraneTimeParam;
    }

    public Long getAddCraneTimeParam() {
        return addCraneTimeParam;
    }

    public void setAddCraneTimeParam(Long addCraneTimeParam) {
        this.addCraneTimeParam = addCraneTimeParam;
    }

    public Integer getCraneAdviceNumber() {
        return craneAdviceNumber;
    }

    public void setCraneAdviceNumber(Integer craneAdviceNumber) {
        this.craneAdviceNumber = craneAdviceNumber;
    }

    public Long getKeyBayWorkTime() {
        return keyBayWorkTime;
    }

    public void setKeyBayWorkTime(Long keyBayWorkTime) {
        this.keyBayWorkTime = keyBayWorkTime;
    }

    public Long getDividedBayWorkTime() {
        return dividedBayWorkTime;
    }

    public void setDividedBayWorkTime(Long dividedBayWorkTime) {
        this.dividedBayWorkTime = dividedBayWorkTime;
    }

    public Long getKeepSelectedBayWorkTime() {
        return keepSelectedBayWorkTime;
    }

    public void setKeepSelectedBayWorkTime(Long keepSelectedBayWorkTime) {
        this.keepSelectedBayWorkTime = keepSelectedBayWorkTime;
    }
}
