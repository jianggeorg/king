/*
 * @(#)Myhandler 2018 22:28
 *
 * Copyright (c) 2018 - Business Intelligence Info. Tech.
 *
 * JiNan
 * All rights reserved.
 */
package com.king.dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author gejiang
 * @Title Myhandler.java
 * @date 2018/10/2 22:28
 * @Description 动态代理
 */

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("----一个方法执行前的事----");
        Object result=method.invoke(target,args);
        System.out.println("----一个方法执行后的事----");

        return result;
    }
}