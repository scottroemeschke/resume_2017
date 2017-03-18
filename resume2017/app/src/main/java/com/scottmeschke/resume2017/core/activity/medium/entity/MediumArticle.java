package com.scottmeschke.resume2017.core.activity.medium.entity;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Optional;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class MediumArticle {

    private final String title;
    private final String url;
    private final String date;
    private final Integer lengthInMinutes;
    private final String publicationId;

    public MediumArticle(String title, String url, String date, Integer lengthInMinutes, String publicationId) {
        this.title = checkNotNull(title);
        this.url = checkNotNull(url);
        this.date = checkNotNull(date);
        this.lengthInMinutes = checkNotNull(lengthInMinutes);
        this.publicationId = publicationId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getDate() {
        return date;
    }

    public Integer getLengthInMinutes() {
        return lengthInMinutes;
    }

    public Optional<String> getPublicationId() {
        return Optional.fromNullable(publicationId);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("title", title)
                .add("url", url)
                .add("date", date)
                .add("lengthInMinutes", lengthInMinutes)
                .add("publicationId", publicationId)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediumArticle that = (MediumArticle) o;
        return Objects.equal(title, that.title) &&
                Objects.equal(url, that.url) &&
                Objects.equal(date, that.date) &&
                Objects.equal(lengthInMinutes, that.lengthInMinutes) &&
                Objects.equal(publicationId, that.publicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title,url,date,lengthInMinutes,publicationId);
    }
}
