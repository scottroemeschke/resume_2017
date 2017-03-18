package com.scottmeschke.resume2017.core.activity.github.entity;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class GitHubRepository {

    private final String id;
    private final Boolean personal;
    private final String url;
    private final String description;

    public GitHubRepository(String id, Boolean personal, String url, String description) {
        this.id = checkNotNull(id);
        this.personal = checkNotNull(personal);
        this.url = checkNotNull(url);
        this.description = checkNotNull(description);
    }

    public String getId() {
        return id;
    }

    public Boolean getPersonal() {
        return personal;
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
        GitHubRepository that = (GitHubRepository) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(personal, that.personal) &&
                Objects.equal(url, that.url) &&
                Objects.equal(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, personal, url, description);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("personal", personal)
                .add("url", url)
                .add("description", description)
                .toString();
    }
}
