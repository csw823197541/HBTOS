package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by csw on 2017/5/24 10:10.
 * Explain: 桥机物理移动范围
 */
public class SmartCraneMoveRangeInfo {

    private Long berthId;//桥机在船舶berthId上
    private String craneNo;//桥机号
    private String startBayNo;//船舶起始所在倍位号
    private String endBayNo;//船舶终止所在倍位号

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public String getCraneNo() {
        return craneNo;
    }

    public void setCraneNo(String craneNo) {
        this.craneNo = craneNo;
    }

    public String getStartBayNo() {
        return startBayNo;
    }

    public void setStartBayNo(String startBayNo) {
        this.startBayNo = startBayNo;
    }

    public String getEndBayNo() {
        return endBayNo;
    }

    public void setEndBayNo(String endBayNo) {
        this.endBayNo = endBayNo;
    }
}
