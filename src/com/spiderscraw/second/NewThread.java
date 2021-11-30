package com.spiderscraw.second;

public class NewThread extends Thread{
	
	 @Override
	public void start() {
		super.start();
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
		System.out.println("in child thread");
		}
	}

}
