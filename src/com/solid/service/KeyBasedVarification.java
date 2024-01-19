package com.solid.service;

import com.solid.entity.Game;

public class KeyBasedVarification extends Verification {

    @Override
    public boolean verifyInstallation(Game game) {
        // Implement key-based verification logic
        System.out.println("Key-based verification for " + game.getName());
        // For demonstration, assuming the verification always succeeds
        return true;
    }

}
