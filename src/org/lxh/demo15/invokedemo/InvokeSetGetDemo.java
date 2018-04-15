package org.lxh.demo15.invokedemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeSetGetDemo {
	public static void main(String args[]) {
		Class<?> class1 = null;
		Object object = null;
		try {
			class1 = Class.forName("org.lxh.demo15.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			object = class1.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setter(object, "name", "李兴华", String.class);
		setter(object, "age", 30, int.class);
		System.out.print("姓名：" );
		getter(object, "name");
		System.out.print("年龄： ");
		getter(object, "age");
	}

	public static void setter(Object obj, String att, Object value, Class<?> type) {
		try {
			Method method = obj.getClass().getMethod("set" + initStr(att), type);
			method.invoke(obj, value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getter(Object obj, String att) {
		try {
			Method method = obj.getClass().getMethod("get" + initStr(att));
			System.out.println(method.invoke(obj));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String initStr(String old) {// 单词首字母大写
		String str = old.substring(0, 1).toUpperCase() + old.substring(1);
		return str;
	}
}
