package com.scottmeschke.resume2017.core.activity.reddit.entity;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public enum RedditActivityType {

    COMMENT("comment"),
    POST("post");

    private final String name;

    RedditActivityType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }
}
