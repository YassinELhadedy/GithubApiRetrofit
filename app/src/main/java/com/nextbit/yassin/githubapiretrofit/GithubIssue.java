package com.nextbit.yassin.githubapiretrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yassin on 9/27/17.
 */

public class GithubIssue {
    String id;
    String title;
    String comments_url;

    @SerializedName("body")
    String comment;

    @Override
    public String toString() {
        return id +  " - " + title;
    }
}
