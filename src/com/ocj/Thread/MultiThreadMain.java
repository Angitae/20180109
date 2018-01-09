package com.ocj.Thread;

public class MultiThreadMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
		// start(): 새로운 스레드를 생성하여 run() 메소드의 명령을 실행하겠다.
		new MultiThreadOne().start();
		//runnable 인터페이스를 상속받아 작성된 클래스는
		// thread 클래스로 인스턴스를 생성하기 위한 데이터로 전달
		new Thread(new MultiThreadTwo()).start();
		
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
			//sleep(ms) : 스레드를 원하는 시간만큼 잠재운다.
			Thread.sleep(500);
		}
		
		System.out.println("Main 메소드 종료");
	}
}
