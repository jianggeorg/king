/*
 * @(#)GetTime 2018 23:10
 *
 * Copyright (c) 2018 - Business Intelligence Info. Tech.
 *
 * JiNan
 * All rights reserved.
 */
package com.king.howtime;

/**
 * @author gejiang
 * @Title GetTime.java
 * @date 2018/10/2 23:10
 * @Description 子类继承父类，会
 */

public class GetTime extends HowTime {

    @Override
    public  void code() {
        System.out.println("我是子类code重写父类的方法");
    }

    @Override
    public void code2() {
        System.out.println("我是子类code2,实现父类的抽象方法");
    }


}