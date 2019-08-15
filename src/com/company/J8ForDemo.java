package com.company;

import java.util.ArrayList;
import java.util.List;

public class J8ForDemo {
    public static void main(String[] args){
        List<Integer> list=new ArrayList();
        for (int i=0;i<100001;i++){
            list.add(i);
        }

        Long time1=System.currentTimeMillis();
        list.stream().forEach(obj->{
            if(obj==100000){
                System.out.println(obj);
            }
        });

        Long time2=System.currentTimeMillis();
        System.out.println("流处理for时间"+(time2-time1));

        Long time3=System.currentTimeMillis();
        for (Integer inte:list){
            if(inte==100000){
                System.out.println(inte);
            }
        }
        Long time4=System.currentTimeMillis();
        System.out.println("传统for时间"+(time4-time3));
    }
}
