package com.solid.entity;

public class Game {
    private String name;
    private String version;
    private int price;
	public Game(String name, String version, int price) {
		super();
		this.name = name;
		this.version = version;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    
	
    
}
