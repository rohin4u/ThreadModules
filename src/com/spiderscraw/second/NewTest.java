package com.spiderscraw.second;

public class NewTest {

	public static void main(String[] args)throws InterruptedException {
		
		NewThread thread = new NewThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			Thread.sleep(2000);
			 System.out.println("in main thrad");
			}

	}

}
