package com.ocj.Thread;

public class MultiThreadOne extends Thread {
	
	@Override
	public void run() {
		System.out.println(" # run() 메소드 시작 >>"
				+ Thread.currentThread().getName());

		for(char i = 'A'; i <'Z'; i++){
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(" # run() 메소드 시작 >>"
				+ Thread.currentThread().getName());
	}
	
}
