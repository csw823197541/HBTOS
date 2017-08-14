package com.shbtos.biz.smart.cwp.pojo.Results;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/6.
 */


public class SmartReMessageInfo {

    private String executeLog; //执行日志
    private String errorLog; //错误日志

    private Map<Long, StringBuffer> executeLogMap;
    private Map<Long, StringBuffer> errorLogMap;
    private Map<Long, StringBuffer> warnLogMap;

    private String cwpVersion; //cwp算法版本号
    private String wiVersion; //发箱服务版本号
    private String stowVersion; //配载算法版本号

    public SmartReMessageInfo() {
        executeLogMap = new HashMap<>();
        errorLogMap = new HashMap<>();
        warnLogMap = new HashMap<>();
    }

    public String getVersion() {
        return cwpVersion;
    }

    public String getCwpVersion() {
        return cwpVersion;
    }

    public void setCwpVersion(String cwpVersion) {
        this.cwpVersion = cwpVersion;
    }

    public String getWiVersion() {
        return wiVersion;
    }

    public void setWiVersion(String wiVersion) {
        this.wiVersion = wiVersion;
    }

    public String getStowVersion() {
        return stowVersion;
    }

    public void setStowVersion(String stowVersion) {
        this.stowVersion = stowVersion;
    }

    public String getExecuteLog() {
        return executeLog;
    }

    public void setExecuteLog(String executeLog) {
        if (executeLog != null) {
            this.executeLog = executeLog;
        }
    }

    public String getErrorLog() {
        return errorLog;
    }

    public void setErrorLog(String errorLog) {
        if (errorLog != null) {
            this.errorLog = errorLog;
        }
    }

    public String getExecuteLogByBerthId(Long berthId) {
        if (executeLogMap.isEmpty()) {
            return executeLog;
        } else {
            executeLogMap.get(berthId).append(executeLog);
            return executeLogMap.get(berthId).toString();
        }
    }

    public String getErrorLogByBerthId(Long berthId) {
        if (errorLogMap.isEmpty()) {
            return errorLog;
        } else {
            errorLogMap.get(berthId).append(errorLog);
            return errorLogMap.get(berthId).toString();
        }
    }

    public String getWarnLogByBerthId(Long berthId) {
        return warnLogMap.get(berthId).toString();
    }

    public void putExecuteLog(Long berthId, String info) {
        if (info != null) {
            if (executeLogMap.get(berthId) == null) {
                executeLogMap.put(berthId, new StringBuffer());
            }
            executeLogMap.get(berthId).append(info);
        }
    }

    public void putErrorLog(Long berthId, String info) {
        if (info != null) {
            if (errorLogMap.get(berthId) == null) {
                errorLogMap.put(berthId, new StringBuffer());
            }
            errorLogMap.get(berthId).append(info);
        }
    }

    public void putWarnLog(Long berthId, String info) {
        if (info != null) {
            if (warnLogMap.get(berthId) == null) {
                warnLogMap.put(berthId, new StringBuffer());
            }
            warnLogMap.get(berthId).append(info);
        }
    }

}
