/*
 * @(#)test 2018 22:25
 *
 * Copyright (c) 2018 - Business Intelligence Info. Tech.
 *
 * JiNan
 * All rights reserved.
 */
package com.king.dongtaidaili;

import java.lang.reflect.Proxy;

/**
 * @author gejiang
 * @Title test.java
 * @date 2018/10/2 22:25
 * @Description 动态代理测试类
 */

public class test {
    public static void main(String[] args){
        UserDao userDao=new userDaoImpl();

        userDao.add();
        //创建一个动态代理对象，需要一个handler对象
        MyInvocationHandler handler=new MyInvocationHandler(userDao);
        UserDao userDao1=(UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),handler);
        userDao1.add();


    }
}