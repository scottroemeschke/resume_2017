package com.scottmeschke.resume2017.core.activity.github.entity;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Created by Scott on 3/18/2017.
 */

public class GitHubPullRequest {

    private final String url;
    private final String description;

    public GitHubPullRequest(String url, String description) {
        this.url = url;
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GitHubPullRequest that = (GitHubPullRequest) o;
        return Objects.equal(url, that.url) &&
                Objects.equal(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(url, description);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("url", url)
                .add("description", description)
                .toString();
    }
}
