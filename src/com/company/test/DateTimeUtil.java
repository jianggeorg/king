package com.company.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";


    /**
     * 计算两个Long型时间相差的分钟数
     * @param endDate
     * @param beginDate
     * @return
     */
    public static Long getDifferMinute(Long endDate, Long beginDate) {

        long nd = 1000 * 24 * 60 * 60L;
        long nh = 1000 * 60 * 60L;

        //一分钟的毫秒数
        long nm = 1000 * 60L;
        // long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate - beginDate;
        // 计算差多少分钟
        long min = diff/nm;//计算差多少分钟
        return min ;
    }

    /**
     * 获取某一时间戳之前多少分钟的时间戳
     */

    public static Long getTimeMillisBefore(Long mill,Long min){

        return mill-1000*60*min;
    }


    /**
     * 时间戳拍砖时间
     * @param timestamp
     * @param formats
     * @return
     */
    public static String TimeStampToDate(Long timestamp, String formats) {
        Date date = new Date(timestamp);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sd.format(date);
    }
    public static void main(String[] args){
        //当前时间戳
        //Long currentTime = System.currentTimeMillis();
        //System.out.println("当前时间======="+currentTime);

        //当前时间=======1564986117383
        //当前时间=======2019-08-05 14:21:57

        //当前时间
        Long time1=1564986117383L;
        //开始时间
        Long time2=1564980000000L;

        //年月日
        String currentDate = TimeStampToDate(time1, YYYY_MM_DD_HH_MM_SS);
        System.out.println("当前时间======="+currentDate);

        String beginDate = TimeStampToDate(time2, YYYY_MM_DD_HH_MM_SS);
        System.out.println("开始时间======="+beginDate);

        //时间=======1564985519891   2019-08-05 14:11:59
        long moniute=getDifferMinute(time1,time2);


        System.out.println("相差得分钟数==="+moniute);

        System.out.println("30分钟之前的毫秒数"+getTimeMillisBefore(time1,30L));

        long moniute1=getDifferMinute(time1,1564984317383L);
        System.out.println("相差得分钟数1==="+moniute1);

    }

}
