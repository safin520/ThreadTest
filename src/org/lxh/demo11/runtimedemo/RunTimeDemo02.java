package org.lxh.demo11.runtimedemo;

import java.io.IOException;

public class RunTimeDemo02 {

	
	public static void main(String args[]){
		Runtime runTime = Runtime.getRuntime();
		Process process = null;
		try {
			process = runTime.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		process.destroy();
	}
}
