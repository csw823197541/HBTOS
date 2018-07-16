package com.shbtos.biz.smart.cwp.pojo.Results;

import java.util.Date;

/**
 * Created by csw on 2018/7/16.
 * Description:
 */
public class SmartReCwpAreaInfo {

    private String areaNo; //箱区号
    private Date startTime; //开始时间
    private Date endTime; //结束时间
    private Long groupId; //属性组Id;
    private Integer planCntNumber; //箱区计划出箱量
    private Integer cntOverNumber; //箱区计划翻箱量

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Integer getPlanCntNumber() {
        return planCntNumber;
    }

    public void setPlanCntNumber(Integer planCntNumber) {
        this.planCntNumber = planCntNumber;
    }

    public Integer getCntOverNumber() {
        return cntOverNumber;
    }

    public void setCntOverNumber(Integer cntOverNumber) {
        this.cntOverNumber = cntOverNumber;
    }
}
