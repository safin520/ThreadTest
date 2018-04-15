package org.lxh.demo12.resourcebundledemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class InterDemo01 {
	public static void main(String args[]){
		ResourceBundle rBundle = ResourceBundle.getBundle("Message",new Locale("zh","CN"));
		System.out.println("ÄÚÈÝ£º" + rBundle.getString("info"));
	}

}
