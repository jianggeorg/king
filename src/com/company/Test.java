/*
 * @(#)Test 2018 10:03
 *
 * Copyright (c) 2018 - Business Intelligence Info. Tech.
 *
 * JiNan
 * All rights reserved.
 */
package com.company;

import java.math.BigDecimal;

/**
 * @author gejiang
 * @Title Test.java
 * @date 2018/3/14 10:03
 * @Description ${TODO}
 */

public class Test {


    public static void main(String[] args){

        BigDecimal bignum1 = new BigDecimal("10");
        BigDecimal bignum2 = new BigDecimal("5");
        BigDecimal bignum3 = null;

        //加法
        bignum3 =  bignum1.add(bignum2);
        System.out.println("和 是：" + bignum3);

        //减法
         bignum3 = bignum1.subtract(bignum2);
         System.out.println("差  是：" + bignum3);

         //乘法
         bignum3 = bignum1.multiply(bignum2);
         System.out.println("积  是：" + bignum3);

         //除法
         bignum3 = bignum1.divide(bignum2);
         System.out.println("商  是：" + bignum3);

         System.out.println("-----------------------------------------------------------------------");

         BigDecimal targetNum=null;

         BigDecimal returnNum=ifNullIsZero(targetNum);
         System.out.println("输入的null返回的数是：------"+returnNum);

    }

    /**
     * @Title: ifNullIsZero
     * @Description: 如果为null返回0
     * @author gejiang
     * @date 2018/3/22 15:15
     * @param [num]
     * @return 返回类型 java.math.BigDecimal
     * @throws
     */
    public static BigDecimal ifNullIsZero(BigDecimal num){

        BigDecimal returnNum=BigDecimal.ZERO;
        if(num!=null){
            return returnNum;
        }
        return returnNum;
    }
}