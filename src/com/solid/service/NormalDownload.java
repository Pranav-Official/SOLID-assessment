package com.solid.service;

import com.solid.entity.Game;

public class NormalDownload implements Downloadable {

	@Override
	public void downloadGame(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Downloading " + game.getName() + "...");
	}

}
