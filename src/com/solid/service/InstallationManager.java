package com.solid.service;

import java.util.Scanner;

import com.solid.entity.Game;

public class InstallationManager implements Installable {
	
	private Verification verification;

    public InstallationManager() {
    	Verification verification1 = null;
        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
        System.out.println("Enter the type of verification,1.Normal 2.System, 3.Online");
        int choice = scanner.nextInt();
        switch (choice) {
		case 1: {
			verification1 = new Verification();
			break;
		}
		case 2: {
			verification1 = new SystemBasedVerification();
			break;
		}
		case 3: {
			verification1 = new OnlineVerification();
			break;
		}
		default:
			System.out.println("Unexpected value: " + choice);
		}
        this.verification = verification1;
    }

	@Override
	public void installGame(Game game) {
        System.out.println("Installing " + game.getName() + "...");
        if (verification.verifyInstallation(game)) {
            System.out.println("Installation verified successfully.");
        } else {
            System.out.println("Installation verification failed.");
        }
    }
}
