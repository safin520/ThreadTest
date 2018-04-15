package org.lxh.demo14.enumapidemo;

public enum Color {
RED("ºìÉ«"),GREEN("ÂÌÉ«"),BLUE("À¶É«");
	
	private String name;

	private Color(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
