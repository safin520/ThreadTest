package org.lxh.demo09.threaddemo;

public class ThreaddaemonDemo {
public static void main(String args[]){
	
	Thread thread = new Thread(new Mythread(),"Ïß³Ì");
	thread.setDaemon(true);
	thread.start();
	return;
}
}
