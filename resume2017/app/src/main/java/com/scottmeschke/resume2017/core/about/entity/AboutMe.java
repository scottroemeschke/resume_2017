package com.scottmeschke.resume2017.core.about.entity;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class AboutMe {

    private final Name name;
    private final String description;
    private final Integer androidStartYear;
    private final List<String> skills;

    public AboutMe(Name name, Integer androidStartYear, String description, List<String> skills) {
        this.androidStartYear = checkNotNull(androidStartYear);
        this.name = checkNotNull(name);
        this.description = checkNotNull(description);
        this.skills = checkNotNull(skills);
    }

    public Name getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getSkills() {
        return skills;
    }

    public Integer getAndroidStartYear() {
        return androidStartYear;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("androidStartYear", androidStartYear)
                .add("name", name)
                .add("description", description)
                .add("skills", skills)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AboutMe aboutMe = (AboutMe) o;
        return Objects.equal(androidStartYear, aboutMe.androidStartYear) &&
                Objects.equal(name, aboutMe.name) &&
                Objects.equal(description, aboutMe.description) &&
                Objects.equal(skills, aboutMe.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, androidStartYear, description, skills);
    }
}
