package com.solid.service;

import com.solid.entity.Game;

public class FTPDownloader implements Downloadable {
    @Override
    public void downloadGame(Game game) {
        // Simulate FTP download logic
        System.out.println("Downloading game " + game.getName() + " via FTP...");
    }
}
