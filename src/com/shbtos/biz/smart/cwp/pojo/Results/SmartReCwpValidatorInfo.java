package com.shbtos.biz.smart.cwp.pojo.Results;

/**
 * Created by csw on 2017/11/15.
 * Description:
 */
public class SmartReCwpValidatorInfo {

    private Long berthId; //靠泊Id
    private Boolean needReDoCwp; //是否需要重排CWP，true表示需要重排

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Boolean getNeedReDoCwp() {
        return needReDoCwp;
    }

    public void setNeedReDoCwp(Boolean needReDoCwp) {
        this.needReDoCwp = needReDoCwp;
    }
}
