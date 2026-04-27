package com.maxim;

public class GitHubFormatter {

    public static void printUser(User user) {

        System.err.println("\n================================");
        System.out.println("GitHub User Summary");
        System.err.println("================================");

        System.out.println("Name    :   " + user.getName());
        System.out.println("Repos   :   " + user.getRepos());
        System.out.println("Followers   :   " + user.getFollowers());
        System.out.println("Following   :   " + user.getFollowing());

        System.err.println("================================");

        
    }
    
}
