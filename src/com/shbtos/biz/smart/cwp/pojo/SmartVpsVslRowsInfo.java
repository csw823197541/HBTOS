package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by liuminhang on 2017/1/18.
 * 排信息
 */
public class SmartVpsVslRowsInfo {
    private Long bayId;// 倍位ID,小贝
    private String vesselCode;// 船舶代码
    private Short rowSeq;//顺序号
    private String rowNo;//排号
    private Double maxWeight20;//小倍重量负荷
    private Double maxHighCubes;//最多的高箱数
    private Double maxWeight40;// 大倍重量负荷

    public Long getBayId() {
        return bayId;
    }

    public void setBayId(Long bayId) {
        this.bayId = bayId;
    }

    public String getVesselCode() {
        return vesselCode;
    }

    public void setVesselCode(String vesselCode) {
        this.vesselCode = vesselCode;
    }

    public Short getRowSeq() {
        return rowSeq;
    }

    public void setRowSeq(Short rowSeq) {
        this.rowSeq = rowSeq;
    }

    public String getRowNo() {
        return rowNo;
    }

    public void setRowNo(String rowNo) {
        this.rowNo = rowNo;
    }

    public Double getMaxWeight20() {
        return maxWeight20;
    }

    public void setMaxWeight20(Double maxWeight20) {
        this.maxWeight20 = maxWeight20;
    }

    public Double getMaxHighCubes() {
        return maxHighCubes;
    }

    public void setMaxHighCubes(Double maxHighCubes) {
        this.maxHighCubes = maxHighCubes;
    }

    public Double getMaxWeight40() {
        return maxWeight40;
    }

    public void setMaxWeight40(Double maxWeight40) {
        this.maxWeight40 = maxWeight40;
    }
}
