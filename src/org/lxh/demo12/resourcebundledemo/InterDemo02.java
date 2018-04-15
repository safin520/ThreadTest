package org.lxh.demo12.resourcebundledemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class InterDemo02 {
	
	public static void main(String args[]){
		Locale zhLocale = new Locale("zh","CN");
		Locale enLocale = new Locale("en","US");
		Locale frLocale = new Locale("fr","FR");
		ResourceBundle zhBundle = ResourceBundle.getBundle("Message",zhLocale);
		ResourceBundle enBundle = ResourceBundle.getBundle("Message",enLocale);
		ResourceBundle fResourceBundle = ResourceBundle.getBundle("Message",frLocale);
		System.out.println("中文：" + zhBundle.getString("info"));
		System.out.println("英文："+ enBundle.getString("info"));
		System.out.println("法文："  + fResourceBundle.getString("info"));
	}

}
