package com.maxim;

import java.util.ArrayList;
import java.util.Scanner;

import com.maxim.Utility.InputValidator;
import com.maxim.Utility.SafeInput;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n================================");
            System.out.println("GitHub CLI Tool");
            System.out.println("================================");

            System.out.println("1. View user details");
            System.out.println("2. View user summary");
            System.out.println("3. View top repositories");
            System.out.println("Anything other number -> Exit");
            System.out.print("Select : ");

            int option = SafeInput.getInt(sc);

            String username;

            switch (option) {
                case 1:
                    username = getUsername(sc);
                    if (userSummary(username)) {
                        userRepos(username);
                    }
                    break;

                case 2:
                    username = getUsername(sc);
                    userSummary(username);
                    break;

                case 3:
                    username = getUsername(sc);
                    userRepos(username);
                    break;

                default:
                    running = false;
                    break;

            }
        }
        sc.close();
    }

    private static String getUsername(Scanner sc) {
        String username;

        while (true) {
            System.out.print("Enter GitHub Username: ");
            username = sc.nextLine();
            if (InputValidator.isValidUsername(username)) {
                break;
            }
        }
        return username;
    }

    public static boolean userSummary(String username) {
        String response = GitHubService.getUserData(username);
        if (response == null) {
            System.out.println("User not found or API error.");
            return false;
        }
        User user = GitHubParser.parseUser(response);
        GitHubFormatter.printUser(user);
        return true;
    }

    public static boolean userRepos(String username) {
        String response = GitHubService.getRepos(username);

        if (response == null) {
            System.out.println("User not found or API error.");
            return false;
        }

        ArrayList<Repository> repos = GitHubParser.parseRepos(response);
        GitHubFormatter.printRepos(repos);
        return true;
    }
}
