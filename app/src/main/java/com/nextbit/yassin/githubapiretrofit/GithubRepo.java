package com.nextbit.yassin.githubapiretrofit;

/**
 * Created by yassin on 9/27/17.
 */

public class GithubRepo {
    String name;
    String owner;
    String url;

    @Override
    public String toString() {
        return(name + " " +  url);
    }
}
