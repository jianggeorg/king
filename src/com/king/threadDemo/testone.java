package com.king.threadDemo;

public class testone extends Thread{

    private Integer i = 0;
    @Override
    public void run() {

        synchronized(i){
            if(i<1){
                System.out.println("线程的名称："+this.getName()+" "+i);//run方法里面获取线程名字的方法
                i++;
                System.out.println("i的大小："+i);
            }
        }



    }
    public static void main(String[] args) {
        new testone().start();
        new testone().start();
        new testone().start();
        new testone().start();
        new testone().start();
        new testone().start(); new testone().start();
        new testone().start(); new testone().start();
        new testone().start(); new testone().start();
        new testone().start();


    }
}
