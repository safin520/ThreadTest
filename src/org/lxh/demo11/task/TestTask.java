package org.lxh.demo11.task;

import java.util.Timer;

import javax.swing.event.TreeWillExpandListener;

public class TestTask {
public static void main(String args[]){
	Timer timer = new Timer();
	MyTask myTask = new MyTask();
	timer.schedule(myTask, 1000, 2000);//1秒开始，每隔2秒重复
	
//	timer.cancel();
}
}
