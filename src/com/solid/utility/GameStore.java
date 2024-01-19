package com.solid.utility;

import com.solid.service.*;

import java.util.Scanner;

import com.solid.entity.*;

public class GameStore {

	public static void main(String[] args) {
        // Instantiate DownloadManager and InstallationManager
        Downloadable downloader = new NormalDownload();
        Installable installer = new InstallationManager();

        // Instantiate GameProcessor
        GameProcessorInterface gameProcessor = new GameProcessor(downloader, installer);

        // Create a GameInfo object (dummy game information)
//        Game gameInfo = new Game("Ghostrunner", "2.0");

        // Demo menu system
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Download and Install Game");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Process the game using GameProcessor
                	scanner.nextLine();
                	System.out.print("Enter game name: ");
                    String gameName = scanner.nextLine();
                    System.out.print("Enter game version: ");
                    String gameVersion = scanner.nextLine();
                    System.out.print("Enter game price: ");
                    int price = scanner.nextInt();
                    Game game = new OnlineGame(gameName, gameVersion,price,true);
                    
                    gameProcessor.processGame(game);
                    rewards.displayRewards(game);
                    System.out.println("Game processing completed.");
                    break;
                case 2:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 2);

        // Close the scanner
        scanner.close();
    }
}
