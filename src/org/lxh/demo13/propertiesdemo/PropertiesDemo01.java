package org.lxh.demo13.propertiesdemo;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo01 {
public static void main(String args[]){
	Properties properties = new Properties();
	properties.setProperty("BJ", "BeiJing");
	properties.setProperty("TJ", "TianJin");
	properties.setProperty("NJ", "NanJing");
//	File file = new File("C:" + File.separator +"Users" 
//	+ File.separator+ "szzft"+File.separator +  "area.properties");
	File file = new File("C:" + File.separator +"Users" 
			+ File.separator+ "szzft"+File.separator +  "area.xml");
	try {
//		properties.store(new FileOutputStream(file), "Area Info");
		properties.storeToXML(new FileOutputStream(file), "Area info");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
