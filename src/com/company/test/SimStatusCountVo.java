package com.company.test;

import java.io.Serializable;

public class SimStatusCountVo implements Serializable {

    private static final long serialVersionUID = -1707169549902181870L;

    /**
     * 卡所属代理商
     */
    private Integer status;

    /**
     * 卡所属代理商名称
     */
    private String statusName;

    /**
     * SIM卡状态列表
     */
    private Long count;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}