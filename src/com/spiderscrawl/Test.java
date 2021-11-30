package com.spiderscrawl;

public class Test {

	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
		
		thread.start();
		
		thread.setName("Mayur Thread");
		
		System.out.println(thread.getPriority());
		
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(thread.getPriority());
		
		for(int i=0; i<5 ; i++) {
			System.out.println("in main method");
		}
   	

	}

}
