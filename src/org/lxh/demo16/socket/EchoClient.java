package org.lxh.demo16.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
public static void main(String args[]) throws Exception, IOException{
	Socket client = null;
	client = new Socket("localhost",8888);
	
	BufferedReader bufferedReader = null;
	PrintStream out = null;
	BufferedReader input = null;
	input = new BufferedReader( new InputStreamReader(System.in));
	out = new PrintStream(client.getOutputStream());//向服务端输出信息
	bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
	boolean f = true;
	
	if(f){
		System.out.print("输入信息： " );
		String str = input.readLine();
		out.println(str);
		if ("bye".equals(str)) {
			f =false;
		}else{
			String echo = bufferedReader.readLine();
			System.out.println(echo);
		}
		
		
	}
	client.close();
	bufferedReader.close();
	
}
}
