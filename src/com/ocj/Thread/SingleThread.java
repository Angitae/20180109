package com.ocj.Thread;

public class SingleThread {
	public void display(){
		System.out.println("display() 시작");
		for(char i = 'A'; i <= 'Z'; i++){
			System.out.print(i);
		}System.out.println("================");
		System.out.println(Thread.currentThread().getName());

		System.out.println("display() 종료");
	}
	
	public static void main(String[] args) {
		System.out.println("Main 메소드 시작");
// currentThread(): 현재 명령을 실행하는 스레드 인스턴스
// getName(): 스레드 인스턴스의 이름을 반환하는 메소드
		System.out.println(Thread.currentThread().getName());
		new SingleThread().display();
		for(char i = 'a'; i <= 'z'; i++){
			System.out.print(i);
		}System.out.println("=========");
		System.out.println("Main 메소드 종료");
	}
}
