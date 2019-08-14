package com.shbtos.biz.smart.cwp.pojo.Results;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by csw on 2017/3/6.
 */


public class SmartReMessageInfo {

    private String executeLog; //执行日志
    private String errorLog; //错误日志
    private String warnLog; //错误日志

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

    public String getWarnLog() {
        return warnLog;
    }

    public void setWarnLog(String warnLog) {
        if (warnLog != null) {
            this.warnLog = warnLog;
        }
    }

    public String getExecuteLogByBerthId(Long berthId) {
        return getLogByBerthId(berthId, executeLog, executeLogMap);
    }

    public String getErrorLogByBerthId(Long berthId) {
        return getLogByBerthId(berthId, errorLog, errorLogMap);
    }

    public String getWarnLogByBerthId(Long berthId) {
        return getLogByBerthId(berthId, warnLog, warnLogMap);
    }

    private String getLogByBerthId(Long berthId, String log, Map<Long, StringBuffer> logMap) {
        if (logMap.isEmpty()) {
            return log;
        } else {
            if (log != null) {
                logMap.get(berthId).append(log);
            }
            return logMap.get(berthId).toString();
        }
    }

    public void putExecuteLog(Long berthId, String info) {
        putLogByBerthId(berthId, info, executeLogMap);
    }

    public void putErrorLog(Long berthId, String info) {
        putLogByBerthId(berthId, info, errorLogMap);
    }

    public void putWarnLog(Long berthId, String info) {
        putLogByBerthId(berthId, info, warnLogMap);
    }

    private void putLogByBerthId(Long berthId, String info, Map<Long, StringBuffer> logMap) {
        if (info != null && !"".equals(info.trim())) {
            if (logMap.get(berthId) == null) {
                logMap.put(berthId, new StringBuffer());
            }
            logMap.get(berthId).append(info);
        }
    }

}
