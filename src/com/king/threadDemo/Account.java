package com.king.threadDemo;

public class Account {
	private String userNo;
	private double account;
	public Account(String userNo,double account){
		this.userNo = userNo;
		this.account = account;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}
	
	public synchronized void drawMoney(double money){
		if(this.account>=money){
			System.out.println(Thread.currentThread().getName()+"取钱成功！吐出钞票为："+money);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.account = this.account - money;
			System.out.println("余额为："+this.account);
		}else{
			System.out.println(Thread.currentThread().getName()+"取现失败，余额不足！");
		}
	}
}