package com.maxim;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GitHub Username: ");
        String username = sc.nextLine();

        System.out.println("1. View user details");
        System.out.println("2. View user summary");
        System.out.println("3. View top repositories");
        System.out.println("4. Exit");
        System.out.print("Select : ");
        int option = sc.nextInt();

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
        String data = GitHubService.getUserData(username);
        User user = GitHubParser.parseUser(data);
        GitHubFormatter.printUser(user);
    }

    public static void userRepos(String username) {
        String data = GitHubService.getRepos(username);
        ArrayList<Repository> repos = GitHubParser.parseRepos(data);
        GitHubFormatter.printRepos(repos);
    }
}
