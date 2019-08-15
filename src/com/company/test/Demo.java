package com.company.test;

/**
 * Created by JIANGGE on 2019/7/24.
 */
public class Demo {

    public static void main(String[] args) {


        CardAgentTypeEnum cardAgentType = CardAgentTypeEnum.getEnumByValue("HZ");

        SimStatisticsVo simStatisticsVo=new SimStatisticsVo(cardAgentType.getValue(), cardAgentType.getLabel());

        System.out.println("----------------------");
    }
}
