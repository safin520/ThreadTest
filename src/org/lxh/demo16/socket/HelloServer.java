package org.lxh.demo16.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ClientInfoStatus;

public class HelloServer {
	public static void main(String args[]) throws Exception {
		ServerSocket serverSocket = null;
		Socket client = null;
		PrintStream out = null;
		serverSocket = new ServerSocket(8888);
		System.out.println("服务端正在运行，等待客户端连接");

		client = serverSocket.accept();

		String string = "Hello world!!!";

		out = new PrintStream(client.getOutputStream());

		out.println(string);
		out.close();
		client.close();
		serverSocket.close();
	}
}
