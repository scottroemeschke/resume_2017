package com.scottmeschke.resume2017.core.activity.medium.repo.exception;

/**
 * Created by Scott on 3/18/2017.
 */

public class NoMediumArticleFoundException extends Exception {

    private final String articleId;

    private NoMediumArticleFoundException(String id) {
        super();
        this.articleId = id;
    }

    public static NoMediumArticleFoundException withId(String id) {
        return new NoMediumArticleFoundException(id);
    }

    @Override
    public String getMessage() {
        return "No Article found for id:" + articleId;
    }
}
