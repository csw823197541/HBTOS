package com.shbtos.biz.smart.cwp.pojo.Results;

/**
 * Created by csw on 2017/6/29.
 * Description:
 */
public class SmartRePreStowVesselCntWeightInfo {

    private Long berthId;         //靠泊ID
    private Long voyageId;         //航次ID
    private Long hatchId;         //舱ID
    private String vlocation;		//船箱位
    private Long weightId;       //重量等级ID
    private String lduld;    //装卸船标志
    private Boolean fixedWeightlevel; //是否指定重量等级
    private String modifyState;//重量等级修改状态，即是否为算法新增的字段：autoStowWeight表示新增重量等级信息

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getVoyageId() {
        return voyageId;
    }

    public void setVoyageId(Long voyageId) {
        this.voyageId = voyageId;
    }

    public Long getHatchId() {
        return hatchId;
    }

    public void setHatchId(Long hatchId) {
        this.hatchId = hatchId;
    }

    public String getVlocation() {
        return vlocation;
    }

    public void setVlocation(String vlocation) {
        this.vlocation = vlocation;
    }

    public Long getWeightId() {
        return weightId;
    }

    public void setWeightId(Long weightId) {
        this.weightId = weightId;
    }

    public String getLduld() {
        return lduld;
    }

    public void setLduld(String lduld) {
        this.lduld = lduld;
    }

    public Boolean getFixedWeightlevel() {
        return fixedWeightlevel;
    }

    public void setFixedWeightlevel(Boolean fixedWeightlevel) {
        this.fixedWeightlevel = fixedWeightlevel;
    }

    public String getModifyState() {
        return modifyState;
    }

    public void setModifyState(String modifyState) {
        this.modifyState = modifyState;
    }
}
