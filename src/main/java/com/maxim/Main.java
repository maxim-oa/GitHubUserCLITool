package com.maxim;

import java.util.ArrayList;
import java.util.Scanner;

import com.maxim.Utility.InputValidator;
import com.maxim.Utility.SafeInput;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String username;

        while (true) {
            System.out.print("Enter GitHub Username: ");
            username = sc.nextLine();
            if (InputValidator.isValidUsername(username)) {
                break;
            }
        }

        System.out.println("1. View user details");
        System.out.println("2. View user summary");
        System.out.println("3. View top repositories");
        System.out.println("4. Exit");
        System.out.print("Select : ");
        int option = SafeInput.getInt(sc);

        switch (option) {
            case 1:
                userSummary(username);
                userRepos(username);
                break;

            case 2:
                userSummary(username);

            case 3:
                userRepos(username);
                break;

            default:
                break;
        }
        sc.close();
    }

    public static void userSummary(String username) {
        String response = GitHubService.getUserData(username);
        if (response == null) {
            System.out.println("User not found or API error.");
            return;
        }
        User user = GitHubParser.parseUser(response);
        GitHubFormatter.printUser(user);
    }

    public static void userRepos(String username) {
        String response = GitHubService.getRepos(username);

        if (response == null) {
            System.out.println("User not found or API error.");
            return;
        }

        ArrayList<Repository> repos = GitHubParser.parseRepos(response);
        GitHubFormatter.printRepos(repos);
    }
}
