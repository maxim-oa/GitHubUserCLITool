package com.maxim;

public class Repository {

    private String name;
    private String language;
    private int stars;
    private int forks;
    private String url;

    public Repository(String name, String language, int stars, int forks, String url) {
        this.name = name;
        this.language = language;
        this.stars = stars;
        this.forks = forks;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public int getStars() {
        return stars;
    }

    public int getForks() {
        return forks;
    }

    public String getUrl() {
        return url;
    }

}
