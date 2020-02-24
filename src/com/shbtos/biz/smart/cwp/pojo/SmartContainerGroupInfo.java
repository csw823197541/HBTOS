package com.shbtos.biz.smart.cwp.pojo;

/**
 * Created by csw on 2020/02/24.
 * Description: 箱属性组信息，用于堆场箱子的分类
 */
public class SmartContainerGroupInfo {

    private Long berthId; // 靠泊ID
    private Long groupId; // 属性组
    private String portCd; // 卸货港
    private String cszCsizecd; // 箱尺寸
    private String effg; // 空/重标记 （Y/N）
    private String rfcfg; // 冷藏箱标记 (Y/N)
    private String heiCheightcd; // 箱高代码(高箱或平箱) (Y/N)
    private String ctypeCd; // 箱型
    private String unNo; // 危险品联合国编号

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getPortCd() {
        return portCd;
    }

    public void setPortCd(String portCd) {
        this.portCd = portCd;
    }

    public String getCszCsizecd() {
        return cszCsizecd;
    }

    public void setCszCsizecd(String cszCsizecd) {
        this.cszCsizecd = cszCsizecd;
    }

    public String getEffg() {
        return effg;
    }

    public void setEffg(String effg) {
        this.effg = effg;
    }

    public String getRfcfg() {
        return rfcfg;
    }

    public void setRfcfg(String rfcfg) {
        this.rfcfg = rfcfg;
    }

    public String getHeiCheightcd() {
        return heiCheightcd;
    }

    public void setHeiCheightcd(String heiCheightcd) {
        this.heiCheightcd = heiCheightcd;
    }

    public String getCtypeCd() {
        return ctypeCd;
    }

    public void setCtypeCd(String ctypeCd) {
        this.ctypeCd = ctypeCd;
    }

    public String getUnNo() {
        return unNo;
    }

    public void setUnNo(String unNo) {
        this.unNo = unNo;
    }
}
