package com.company.test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SimStatisticsVo implements Serializable {

    private static final long serialVersionUID = -1707169549902181870L;

    /**
     * 卡所属代理商
     */
    private String agent;

    /**
     * 卡所属代理商名称
     */
    private String agentName;

    /**
     * SIM卡状态列表
     */
    private Map<Integer, SimStatusCountVo> statusMap;

    public SimStatisticsVo(String agent, String agentName) {
        this.agent = agent;
        this.agentName = agentName;
        statusMap = new HashMap<>();
        CardStatusEnum[] statusEnums = CardStatusEnum.values();
        for (CardStatusEnum statusEnum : statusEnums) {
            SimStatusCountVo simStatusCountVo = new SimStatusCountVo();
            simStatusCountVo.setStatus(statusEnum.getCode());
            simStatusCountVo.setStatusName(statusEnum.getDesc());
            simStatusCountVo.setCount(0L);
            statusMap.put(statusEnum.getCode(), simStatusCountVo);
        }
    }

}