package com.scottmeschke.resume2017.core.activity.github.repo.exception;

import com.scottmeschke.resume2017.core.activity.github.entity.GitHubRepository;

/**
 * Created by Scott on 3/18/2017.
 */

public class GitHubRepositoryNotFoundException extends Exception {

    private final String contributionId;

    private GitHubRepositoryNotFoundException(String id) {
        super();
        this.contributionId = id;
    }

    public static GitHubRepositoryNotFoundException withId(String id) {
        return new GitHubRepositoryNotFoundException(id);
    }

    @Override
    public String getMessage() {
        return "No GitHubRepository found for id:" + contributionId;
    }
}
