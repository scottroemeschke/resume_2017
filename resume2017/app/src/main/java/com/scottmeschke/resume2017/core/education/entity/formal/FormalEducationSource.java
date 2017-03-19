package com.scottmeschke.resume2017.core.education.entity.formal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class FormalEducationSource {

    private final String id;
    private final String name;
    private final String graduationDate;
    private final String degree;

    public FormalEducationSource(String id, String name, String graduationDate, String degree) {
        this.id = checkNotNull(id);
        this.name = checkNotNull(name);
        this.graduationDate = checkNotNull(graduationDate);
        this.degree = checkNotNull(degree);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormalEducationSource that = (FormalEducationSource) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(name, that.name) &&
                Objects.equal(graduationDate, that.graduationDate) &&
                Objects.equal(degree, that.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, graduationDate, degree);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("graduationDate", graduationDate)
                .add("degree", degree)
                .toString();
    }
}
