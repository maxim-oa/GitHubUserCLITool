package com.maxim;

public class User {
    private String name;
    private int repos;
    private int followers;
    private int following;

    public User(String name, int repos, int followers, int following) {
        this.name = name;
        this.repos = repos;
        this.followers = followers;
        this.following = following;
    }

    public String getName() {
        return name;
    }

    public int getRepos() {
        return repos;
    }

    public int getFollowers() {
        return followers;
    }

    public int getFollowing() {
        return following;
    }
}
