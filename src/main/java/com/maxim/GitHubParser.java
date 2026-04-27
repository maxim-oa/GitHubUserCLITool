package com.maxim;

import org.json.JSONObject;

public class GitHubParser {

    public static User parseUser(String jsonString) {
        JSONObject json = new JSONObject(jsonString);

        String name = json.optString("name","N/A");
        int repos = json.getInt("public_repos");
        int followers = json.getInt("followers");
        int following = json.getInt("following");

        return new User(name, repos, followers, following);
        
    }

}
