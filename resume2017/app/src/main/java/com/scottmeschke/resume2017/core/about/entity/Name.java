package com.scottmeschke.resume2017.core.about.entity;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class Name {

    private final String first;
    private final String last;

    public Name(String first, String last) {
        this.first = checkNotNull(first);
        this.last = checkNotNull(last);
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("first", first)
                .add("last", last)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equal(first, name.first) &&
                Objects.equal(last, name.last);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(first, last);
    }
}
