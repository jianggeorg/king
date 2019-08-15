/*
 * @(#)HomeTime 2018 22:46
 *
 * Copyright (c) 2018 - Business Intelligence Info. Tech.
 *
 * JiNan
 * All rights reserved.
 */
package com.king.howtime;

/**
 * @author gejiang
 * @Title HomeTime.java
 * @date 2018/10/2 22:46
 * @Description 计算一段代码执行了多长时间
 */

public abstract class HowTime {

    //返回代码执行一共花了多长时间
    public long getHowTime(){
        long start = System.currentTimeMillis();
        //中间写要执行的代码
        code();
        long end = System.currentTimeMillis();
        long time=end-start;
       return time;
    }

    //定义一个抽象方法，根据多态的原理，会先执行子类的方法。
    public void code(){
        System.out.println("我是父类的code");
    };

    public abstract void code2();
}