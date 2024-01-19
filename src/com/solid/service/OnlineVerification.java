package com.solid.service;

import com.solid.entity.Game;

public class OnlineVerification extends Verification {

    @Override
    public boolean verifyInstallation(Game game) {
        // Implement online verification logic
        System.out.println("Online verification for " + game.getName());
        // For demonstration, assuming the verification always succeeds
        return true;
    }
}
