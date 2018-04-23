package com.shbtos.biz.smart.cwp.pojo.Results;

/**
 * Created by csw on 2018/4/23.
 * Description:
 */
public class SmartReAutoStowEvaluationInfo {

    private Long berthId; //靠泊Id
    private Double overCntRate; //翻箱个数比率
    private Double splitCntRate; //拼箱个数比率
    private Double rowOneHatchRate; //堆场同排配到同一个舱的列数比率
    private Double rowTwoHatchRate; //堆场同排配到同两个舱的列数比率
    private Double rowThreeHatchRate; //堆场同排配到同三个舱的列数比率
    private Double rowFourHatchRate; //堆场同排配到同四个舱的列数比率
    private Double rowFiveHatchRate; //堆场同排配到同五个舱的列数比率
    private Double rowSixHatchRate; //堆场同排配到同六个舱的列数比率

    public Long getBerthId() {
        return berthId;
    }

    public void setBerthId(Long berthId) {
        this.berthId = berthId;
    }

    public Double getOverCntRate() {
        return overCntRate;
    }

    public void setOverCntRate(Double overCntRate) {
        this.overCntRate = overCntRate;
    }

    public Double getSplitCntRate() {
        return splitCntRate;
    }

    public void setSplitCntRate(Double splitCntRate) {
        this.splitCntRate = splitCntRate;
    }

    public Double getRowOneHatchRate() {
        return rowOneHatchRate;
    }

    public void setRowOneHatchRate(Double rowOneHatchRate) {
        this.rowOneHatchRate = rowOneHatchRate;
    }

    public Double getRowTwoHatchRate() {
        return rowTwoHatchRate;
    }

    public void setRowTwoHatchRate(Double rowTwoHatchRate) {
        this.rowTwoHatchRate = rowTwoHatchRate;
    }

    public Double getRowThreeHatchRate() {
        return rowThreeHatchRate;
    }

    public void setRowThreeHatchRate(Double rowThreeHatchRate) {
        this.rowThreeHatchRate = rowThreeHatchRate;
    }

    public Double getRowFourHatchRate() {
        return rowFourHatchRate;
    }

    public void setRowFourHatchRate(Double rowFourHatchRate) {
        this.rowFourHatchRate = rowFourHatchRate;
    }

    public Double getRowFiveHatchRate() {
        return rowFiveHatchRate;
    }

    public void setRowFiveHatchRate(Double rowFiveHatchRate) {
        this.rowFiveHatchRate = rowFiveHatchRate;
    }

    public Double getRowSixHatchRate() {
        return rowSixHatchRate;
    }

    public void setRowSixHatchRate(Double rowSixHatchRate) {
        this.rowSixHatchRate = rowSixHatchRate;
    }
}
