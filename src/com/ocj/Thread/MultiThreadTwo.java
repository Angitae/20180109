package com.ocj.Thread;

public class MultiThreadTwo implements Runnable{
	@Override
	public void run() {
		System.out.println("$$ run() 메소드 시작>>" 
				+  Thread.currentThread().getName());
		
		for(char i = 'a'; i <='w'; i++){
			System.out.println(i);
		}
		
		System.out.println("$$ run() 메소드 종료>>" 
				+  Thread.currentThread().getName());
		
	}
}
