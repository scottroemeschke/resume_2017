package com.scottmeschke.resume2017.core.activity.medium.repo.exception;

/**
 * Created by Scott on 3/18/2017.
 */

public class NoMediumPublicationFoundException extends Exception {

    private final String articleId;

    private NoMediumPublicationFoundException(String id) {
        super();
        this.articleId = id;
    }

    public static NoMediumPublicationFoundException withId(String id) {
        return new NoMediumPublicationFoundException(id);
    }

    @Override
    public String getMessage() {
        return "No Publication found for id:" + articleId;
    }
}
