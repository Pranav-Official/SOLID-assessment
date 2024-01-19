package com.solid.entity;

public class OnlineGame extends Game {
	boolean multiplayer;

	public OnlineGame(String name, String version, int price, boolean multiplayer) {
		super(name, version, price);
		this.multiplayer = multiplayer;
	}
	
	

}
