package com.scottmeschke.resume2017.core.activity.github.repo.exception;

/**
 * Created by Scott on 3/18/2017.
 */

public class GitHubContributionNotFoundException extends Exception{

    private final String contributionId;

    private GitHubContributionNotFoundException(String id) {
        super();
        this.contributionId = id;
    }

    public static GitHubContributionNotFoundException withId(String id) {
        return new GitHubContributionNotFoundException(id);
    }

    @Override
    public String getMessage() {
        return "No GitHubContribution found for id:" + contributionId;
    }
}
