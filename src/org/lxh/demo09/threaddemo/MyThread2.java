package org.lxh.demo09.threaddemo;

import java.util.concurrent.ThreadFactory;

public class MyThread2 implements Runnable{
	private int ticket = 5;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			if(ticket>0){
				System.out.println("ÂôÆ±£º ticket="+ ticket--);
			}
		}
	}
	
	public static void main(String args[]){
		
		MyThread2 mThread2 = new MyThread2();
		new Thread(mThread2).start();
		new Thread(mThread2).start();
		new Thread(mThread2).start();
		return;
	}
	

}
