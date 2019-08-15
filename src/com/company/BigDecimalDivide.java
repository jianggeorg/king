/*
 * @(#)BigDecimalDivide 2018 11:20
 *
 * Copyright (c) 2018 - Business Intelligence Info. Tech.
 *
 * JiNan
 * All rights reserved.
 */
package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author gejiang
 * @Title BigDecimalDivide.java
 * @date 2018/1/18 11:20
 * @Description ${TODO}
 */

public class BigDecimalDivide {


    public static void main(String[] args){

        BigDecimal a=new BigDecimal("10");
        BigDecimal b=new BigDecimal("3");

        BigDecimal c=a.divide(b,2,RoundingMode.HALF_EVEN);

        System.out.println(c);
    }
}