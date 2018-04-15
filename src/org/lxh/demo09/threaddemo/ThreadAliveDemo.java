package org.lxh.demo09.threaddemo;

public class ThreadAliveDemo {
	public static void main(String args[]) {
		Thread thread = new Thread(new Mythread(), "线程");
		System.out.println("线程开始执行之前  -->" + thread.isAlive());
		thread.start();

		System.out.println("线程开始执行之后 -->" + thread.isAlive());

		for (int i = 0; i < 3; i++) {
			System.out.println("main 运行 -->" + i);
		}
		System.out.println("代码执行之后 -->" + thread.isAlive());
	}

}
