package com.king.duotai;

/**
 * 成员变量：编译看左边，运行看左边。
   成员方法：编译看左边，运行看右边。
   静态方法：编译看左边，运行看左边。静态和类相关，算不上重写，所以访问还是左边。
 */
public class Car {

	private String testname="testCar";

	private void testCar(){
		System.out.println("我是所有test");

	}

	public String name="Car";

	public void run() {
		System.out.println("我是所有车的父类......");
	}

	public static void runcar(){
		System.out.println("我是所有车的老子......");
	}

	public static void main(String args[]) {
		//这里可以叫向上转型
		Car car = new BmwCar();
		//成员变量：编译看左边，运行看左边。
		System.out.println("名字"+car.name);
		//成员方法：编译看左边，运行看右边。
		car.run();
		//静态方法：编译看左边，运行看左边。静态和类相关，算不上重写，所以访问还是左边。
		runcar();
		BmwCar b = (BmwCar) car;
		//向下转型。进行强制转换后调用子类对象中的方法。
		b.description();
	}
}