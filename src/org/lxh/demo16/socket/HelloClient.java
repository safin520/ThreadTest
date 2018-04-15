package org.lxh.demo16.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ClientInfoStatus;

public class HelloClient {
public static void main(String args[]) throws Exception, IOException{
	Socket client = null;
	client = new Socket("localhost",8888);
	
	BufferedReader buf = null;
	buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
	
	String str = buf.readLine();
	System.out.println("Êä³öÄÚÈÝ£º " + str );
	client.close();
	buf.close();
	
}
}