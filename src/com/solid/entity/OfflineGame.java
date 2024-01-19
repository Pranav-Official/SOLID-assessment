package com.solid.entity;

public class OfflineGame extends Game {
	
	boolean storyMode;

	public OfflineGame(String name, String version, int price, boolean storyMode) {
		super(name, version, price);
		this.storyMode = storyMode;
	}
	
	
	
}
