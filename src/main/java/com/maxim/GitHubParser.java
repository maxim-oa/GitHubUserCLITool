package com.maxim;

import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONArray;

public class GitHubParser {

    public static User parseUser(String jsonString) {
        JSONObject json = new JSONObject(jsonString);

        String name = json.optString("name", "N/A");
        int repos = json.getInt("public_repos");
        int followers = json.getInt("followers");
        int following = json.getInt("following");

        return new User(name, repos, followers, following);

    }

    public static ArrayList<Repository> parseRepos(String jsonString) {
        ArrayList<Repository> repos = new ArrayList<>();
        JSONArray array = new JSONArray(jsonString);

        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);
            String name = obj.getString("name");
            int stars = obj.getInt("stargazers_count");
            int forks = obj.getInt("forks_count");
            String url = obj.getString("html_url");

            repos.add(new Repository(name, stars, forks, url));
        }

        return repos;
    }

}
