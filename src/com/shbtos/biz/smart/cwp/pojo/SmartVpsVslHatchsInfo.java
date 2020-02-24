package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by csw on 2018/9/16.
 * Description: 舱位信息
 */
public class SmartVpsVslHatchsInfo {

    private Long hatchId;// 舱位ID
    private String vesselCode;//船舶代码
    private String hatchNo;//舱序号
    private Integer hatchSeq;//舱次序
    private Double hatchLength;//长度
    private Double hatchWidth;//宽度
    private Double hatchPosition ;//舱位置，相对于船头
    //中心位置由CWP计算

    public Long getHatchId() {
        return hatchId;
    }

    public void setHatchId(Long hatchId) {
        this.hatchId = hatchId;
    }

    public String getVesselCode() {
        return vesselCode;
    }

    public void setVesselCode(String vesselCode) {
        this.vesselCode = vesselCode;
    }

    public String getHatchNo() {
        return hatchNo;
    }

    public void setHatchNo(String hatchNo) {
        this.hatchNo = hatchNo;
    }

    public Integer getHatchSeq() {
        return hatchSeq;
    }

    public void setHatchSeq(Integer hatchSeq) {
        this.hatchSeq = hatchSeq;
    }

    public Double getHatchLength() {
        return hatchLength;
    }

    public void setHatchLength(Double hatchLength) {
        this.hatchLength = hatchLength;
    }

    public Double getHatchWidth() {
        return hatchWidth;
    }

    public void setHatchWidth(Double hatchWidth) {
        this.hatchWidth = hatchWidth;
    }

    public Double getHatchPosition() {
        return hatchPosition;
    }

    public void setHatchPosition(Double hatchPosition) {
        this.hatchPosition = hatchPosition;
    }
}
