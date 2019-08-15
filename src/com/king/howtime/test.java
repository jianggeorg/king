/*
 * @(#)test 2018 23:16
 *
 * Copyright (c) 2018 - Business Intelligence Info. Tech.
 *
 * JiNan
 * All rights reserved.
 */
package com.king.howtime;

/**
 * @author gejiang
 * @Title test.java
 * @date 2018/10/2 23:16
 * @Description 测试：计算一段代码执行的时间，变化的写成扩展，不变封存。--模板设计模式
 */

public class test {
    public static void main(String[] args){
        HowTime getTime=new GetTime();
     System.out.println(getTime.getHowTime()+"毫秒");
    }
}