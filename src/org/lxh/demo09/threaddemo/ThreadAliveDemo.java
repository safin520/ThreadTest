package org.lxh.demo09.threaddemo;

public class ThreadAliveDemo {
	public static void main(String args[]) {
		Thread thread = new Thread(new Mythread(), "�߳�");
		System.out.println("�߳̿�ʼִ��֮ǰ  -->" + thread.isAlive());
		thread.start();

		System.out.println("�߳̿�ʼִ��֮�� -->" + thread.isAlive());

		for (int i = 0; i < 3; i++) {
			System.out.println("main ���� -->" + i);
		}
		System.out.println("����ִ��֮�� -->" + thread.isAlive());
	}

}
