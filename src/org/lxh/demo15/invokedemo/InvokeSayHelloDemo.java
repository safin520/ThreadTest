package org.lxh.demo15.invokedemo;

import java.lang.reflect.Method;

public class InvokeSayHelloDemo {
public static void main(String args[]){
	Class<?> class1 = null;
	try {
		class1 = class1.forName("org.lxh.demo15.Person");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		Method method = class1.getMethod("sayChina");
		method.invoke(class1.newInstance());
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
}
