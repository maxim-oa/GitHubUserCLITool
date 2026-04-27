package com.maxim;

import java.util.ArrayList;

public class GitHubFormatter {

    public static void printUser(User user) {

        System.err.println("\n================================");
        System.out.println("GitHub User Summary");
        System.err.println("================================");

        System.out.println("Name        :   " + user.getName());
        System.out.println("Repos       :   " + user.getRepos());
        System.out.println("Followers   :   " + user.getFollowers());
        System.out.println("Following   :   " + user.getFollowing());

        System.err.println("================================");

    }

    public static void printRepos(ArrayList<Repository> repos) {

        System.err.println("\n================================");
        System.out.println("GitHub User Repos");
        System.err.println("================================");

        for (Repository repo : repos) {
            System.out.println("Name    :   " + repo.getName());
            System.out.println("Stars   :   " + repo.getStars());
            System.out.println("Forks   :   " + repo.getForks());
            System.out.println("URL     :   " + repo.getUrl());

            System.err.println("================================");
        }

    }

}
