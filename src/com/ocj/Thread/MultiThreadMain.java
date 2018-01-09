package com.ocj.Thread;

public class MultiThreadMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
		// start(): ���ο� �����带 �����Ͽ� run() �޼ҵ��� ����� �����ϰڴ�.
		new MultiThreadOne().start();
		//runnable �������̽��� ��ӹ޾� �ۼ��� Ŭ������
		// thread Ŭ������ �ν��Ͻ��� �����ϱ� ���� �����ͷ� ����
		new Thread(new MultiThreadTwo()).start();
		
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
			//sleep(ms) : �����带 ���ϴ� �ð���ŭ ������.
			Thread.sleep(500);
		}
		
		System.out.println("Main �޼ҵ� ����");
	}
}
