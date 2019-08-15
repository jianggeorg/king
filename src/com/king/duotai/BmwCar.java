package com.king.duotai;

public class BmwCar extends Car {

	public String name="BmwCar";

	@Override
	public void run() {
		System.out.println("我是宝马车。。。。");
	}

	public static void runcar(){
		System.out.println("我是其中一个子类......");
	}

	public void description() {
		System.out.println("高端、大气、上档次");
	}

	private void testCar(){}
}