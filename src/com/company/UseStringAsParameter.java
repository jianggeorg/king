/*
 * @(#)UseStringAsParameter 2018 15:33
 *
 * Copyright (c) 2018 - Business Intelligence Info. Tech.
 *
 * JiNan
 * All rights reserved.
 */
package com.company;

/**
 * @author gejiang
 * @Title UseStringAsParameter.java
 * @date 2018/3/9 15:33
 * @Description ${TODO}
 */

public class UseStringAsParameter {

    public static void main(String[] args){
        String ruleIdAndRuleversion="COMM_PRO_MAP_CODE:402601968238776321,8@124|125|_1";


        String saveType=ruleIdAndRuleversion.substring(ruleIdAndRuleversion.length()-2,ruleIdAndRuleversion.length());
//-1
        ruleIdAndRuleversion=ruleIdAndRuleversion.substring(0,ruleIdAndRuleversion.length()-2);
//COMM_PRO_MAP_CODE:402601968238776321,8@124|125|
        String [] rulAndVer = ruleIdAndRuleversion.split(",");
//COMM_PRO_MAP_CODE:402601968238776321           8@124|125|
        String ruleId = rulAndVer[0].split(":")[1];
//402601968238776321
        String ruleVersionStr=rulAndVer[1].split("@")[0];
//8
        Integer ruleVersion = Integer.parseInt(ruleVersionStr);
//8
        String ruleVertionAndProCode=rulAndVer[1];
        //8@124|125|
        int indexAt=ruleVertionAndProCode.indexOf("@");
//1

        String[] ids=ruleVertionAndProCode.substring(indexAt+1,ruleVertionAndProCode.length()).split("\\|");

        //124   125
    }
}