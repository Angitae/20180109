package com.ocj.Thread;

public class MultiThreadTwo implements Runnable{
	@Override
	public void run() {
		System.out.println("$$ run() �޼ҵ� ����>>" 
				+  Thread.currentThread().getName());
		
		for(char i = 'a'; i <='w'; i++){
			System.out.println(i);
		}
		
		System.out.println("$$ run() �޼ҵ� ����>>" 
				+  Thread.currentThread().getName());
		
	}
}
