package org.lxh.demo09.threaddemo;

/**
 * @author szzft
 *
 */
/*public class Mythread extends Thread {
	private String name;

	public Mythread(String name) {
		// super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "���У�i = " + i);
		}
	}

	
	public static void main(String args[]){
		
		Mythread mt1 = new Mythread("�߳�a");
		Mythread mt2 = new Mythread("�߳�b");
//		mt1.start();
		mt2.start(); 
		mt2.start();
//		mt1.run();
//		mt2.run();
	}
};*/


public class Mythread implements Runnable{
	
	private String name;
	
	public Mythread(String name) {
		super();
		this.name = name;
	}
	
	

	public Mythread() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	/*	for(int i=0;i<3;i++){
//			System.out.println(name + "���У� i = " + i);
			System.out.println(Thread.currentThread().getName() + "���� -->" + i);
		}*/
		
		while(true){
			System.out.println(Thread.currentThread().getName() + "������");
		}
		
	}
	
	public static void main(String args[]){
		
		Mythread mt1 = new Mythread("�߳� A");
		Mythread mt2 = new Mythread("�߳� B");
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();
		return;
	}
	
	
}



