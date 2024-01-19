package com.solid.service;

import com.solid.entity.Game;

public class SystemBasedVerification extends Verification {

    @Override
    public boolean verifyInstallation(Game game) {
        // Implement system-based verification logic
        System.out.println("System-based verification for " + game.getName());
        // For demonstration, assuming the verification always succeeds
        return true;
    }
}
