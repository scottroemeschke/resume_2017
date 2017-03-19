package com.scottmeschke.resume2017.core.activity.medium.entity;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Optional;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class MediumArticleWithPublication {

    private final MediumArticle article;
    private final MediumPublication publication;

    public MediumArticleWithPublication(MediumArticle article, MediumPublication publication) {
        this.article = checkNotNull(article);
        this.publication = publication;
    }

    public MediumArticle getArticle() {
        return article;
    }

    public Optional<MediumPublication> getPublication() {
        return Optional.fromNullable(publication);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediumArticleWithPublication that = (MediumArticleWithPublication) o;
        return Objects.equal(article, that.article) &&
                Objects.equal(publication, that.publication);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(article, publication);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("article", article)
                .add("publication", publication)
                .toString();
    }
}
