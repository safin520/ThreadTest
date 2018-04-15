package org.lxh.demo16.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
public static void main(String args[]) throws Exception{
	ServerSocket serverSocket= null;
	Socket client = null;
	PrintStream out = null;
	BufferedReader bufferedReader = null;
	
	serverSocket = new ServerSocket(8888);
	
	boolean f = true;
	
	while(f){
		System.out.println("��������У��ȴ��ͻ������ӡ�");
		client = serverSocket.accept();
		bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));//�õ��ͻ���������Ϣ
		out = new PrintStream(client.getOutputStream());
		boolean flag= true;
		
		
		while(flag){
			String str = bufferedReader.readLine();
			if (str==null || "".equals(str)) {
				flag = false;
			}else{
				if ("bye".equals(str)) {
					flag = false;
				}else{
					out.println("ECHO��" + str);
				}
			}
			
		}
		out.close();
		client.close();
		
	}
	serverSocket.close();
	
}
}
