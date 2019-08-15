package com.company;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JIANGGE on 2019/7/30.
 */
public class TestFor {


    public static void main(String[] args){
        List<String> stringList=new ArrayList<>();
        stringList.add("1");
        stringList.add("");
        stringList.add("1");
        stringList.add(null);

        stringList.add("dfd");

        for (String str:stringList){
            if(StringUtils.isEmpty(str)){
               continue;
            }

            System.out.println(str);
        }


    }


}
