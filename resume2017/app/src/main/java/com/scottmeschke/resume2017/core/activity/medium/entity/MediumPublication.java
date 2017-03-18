package com.scottmeschke.resume2017.core.activity.medium.entity;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class MediumPublication {

    private final String id;
    private final String title;
    private final String imgAsset;
    private final String tagline;

    public MediumPublication(String id, String title, String imgAsset, String tagline) {
        this.id = checkNotNull(id);
        this.title = checkNotNull(title);
        this.imgAsset = checkNotNull(imgAsset);
        this.tagline = checkNotNull(tagline);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImgAsset() {
        return imgAsset;
    }

    public String getTagline() {
        return tagline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediumPublication that = (MediumPublication) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(title, that.title) &&
                Objects.equal(imgAsset, that.imgAsset) &&
                Objects.equal(tagline, that.tagline);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, title, imgAsset, tagline);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("title", title)
                .add("imgAsset", imgAsset)
                .add("tagline", tagline)
                .toString();
    }
}
