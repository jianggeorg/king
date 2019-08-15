package com.company;

import java.util.*;

/**
 * Created by JIANGGE on 2019/7/31.
 */
public class TestCurrentTimeMillis {

    public static Long getDifferMinute(Long endDate, Long beginDate) {

        long nd = 1000 * 24 * 60 * 60L;
        long nh = 1000 * 60 * 60L;
        long nm = 1000 * 60L;
        // long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate - beginDate;
        // 计算差多少天
        //long day = diff / nd;
        // 计算差多少小时
        //long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒
        // long sec = diff % nd % nh % nm / ns;
        return min ;
    }

    public static Long getDifferMinute2(Long endDate, Long beginDate) {

        long nd = 1000 * 24 * 60 * 60L;
        long nh = 1000 * 60 * 60L;
        long nm = 1000 * 60L;
        // long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate - beginDate;
        // 计算差多少天
        //long day = diff / nd;
        // 计算差多少小时
        //long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒
        // long sec = diff % nd % nh % nm / ns;
        return min ;
    }

    public static void main(String[] args){
        Long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);

        long moniute=getDifferMinute(currentTime,1564538939888L);

        System.out.println(moniute);
        //1564538939888

        //1564539263285

        long moniute2=getDifferMinute(600000L,0L);

        System.out.println(moniute2);




    }


    public static List<Double> add(String key, String value, double score) {
        List<Double> timeList=new ArrayList<>();


        timeList.add(score);

        return timeList;

    }
}
