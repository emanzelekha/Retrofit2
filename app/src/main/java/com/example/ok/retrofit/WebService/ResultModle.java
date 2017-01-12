package com.example.ok.retrofit.WebService;

import java.util.List;

/**
 * Created by ok on 12/01/2017.
 */

public class ResultModle {
    private List<Post>posts;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
