package com.ocj.Thread;

public class SingleThread {
	public void display(){
		System.out.println("display() ����");
		for(char i = 'A'; i <= 'Z'; i++){
			System.out.print(i);
		}System.out.println("================");
		System.out.println(Thread.currentThread().getName());

		System.out.println("display() ����");
	}
	
	public static void main(String[] args) {
		System.out.println("Main �޼ҵ� ����");
// currentThread(): ���� ����� �����ϴ� ������ �ν��Ͻ�
// getName(): ������ �ν��Ͻ��� �̸��� ��ȯ�ϴ� �޼ҵ�
		System.out.println(Thread.currentThread().getName());
		new SingleThread().display();
		for(char i = 'a'; i <= 'z'; i++){
			System.out.print(i);
		}System.out.println("=========");
		System.out.println("Main �޼ҵ� ����");
	}
}
