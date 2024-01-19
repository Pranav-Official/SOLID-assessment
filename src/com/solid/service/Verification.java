package com.solid.service;

import com.solid.entity.Game;

public class Verification {
	boolean verifyInstallation(Game game) {
		
		System.out.println("Plain verification for " + game.getName());
		return true;
		
	}
}
