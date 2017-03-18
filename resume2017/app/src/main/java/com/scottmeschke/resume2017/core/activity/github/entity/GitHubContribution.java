package com.scottmeschke.resume2017.core.activity.github.entity;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class GitHubContribution {

    private final String date;
    private final String repositoryId;
    private final GitHubPullRequest pullRequest;

    public GitHubContribution(String date, String repositoryId, GitHubPullRequest pullRequest) {
        this.date = checkNotNull(date);
        this.repositoryId = checkNotNull(repositoryId);
        this.pullRequest = checkNotNull(pullRequest);
    }

    public String getDate() {
        return date;
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    public GitHubPullRequest getPullRequest() {
        return pullRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GitHubContribution that = (GitHubContribution) o;
        return Objects.equal(date, that.date) &&
                Objects.equal(repositoryId, that.repositoryId) &&
                Objects.equal(pullRequest, that.pullRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(date, repositoryId, pullRequest);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("date", date)
                .add("repositoryId", repositoryId)
                .add("pullRequest", pullRequest)
                .toString();
    }
}
