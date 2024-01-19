package com.solid.service;

import java.util.Scanner;

import com.solid.entity.Game;

public class GameProcessor implements GameProcessorInterface {
    private Downloadable downloader;
    private Installable installer;

    public GameProcessor(Downloadable downloader, Installable installer) {
        this.downloader = downloader;
        this.installer = installer;
        
    }

    @Override
    public void processGame(Game game) {
        downloader.downloadGame(game);
        installer.installGame(game);
    }

}
