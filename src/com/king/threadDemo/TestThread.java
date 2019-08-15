package com.king.threadDemo;

public class TestThread extends Thread {
	private Account account;
	private double money;
	public TestThread(String name,Account account,double money){
		super(name);
		this.account = account;
		this.money = money;
	}
	
	@Override
	public void run() {
		this.account.drawMoney(money);
	}
	
	public static void main(String[] args) {
		Account account = new Account("1234567",1000);
		new TestThread("ATM1号",account,800).start();
		new TestThread("ATM2号",account,800).start();
	}
}