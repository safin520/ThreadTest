package org.lxh.demo13.propertiesdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo02 {
public static void main(String args[]){
	Properties pro = new Properties();
	File file = new File("C:\\Users\\szzft\\area.properties");
	try {
		pro.load(new FileInputStream(file));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("BJ属性存在，内容是：" + pro.getProperty("BJ"));
}
}
