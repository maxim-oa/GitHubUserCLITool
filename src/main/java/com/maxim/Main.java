package com.maxim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GitHub Username: ");
        String username = sc.nextLine();

        String data = GitHubService.getUserData(username);
        User user = GitHubParser.parseUser(data);
        GitHubFormatter.printUser(user);

        sc.close();
    }
}
