package org.lxh.demo14.enumapidemo;

public class ConstructorEnum {
public static void main(String args[]){
	for (Color c : Color.values()) {
		System.out.println(c.ordinal() + "-->" + 
	c.name() + "("  + c.getName()+ ")");
	}
}
}
