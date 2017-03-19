package com.scottmeschke.resume2017.core.experience.entity.position;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class ProfessionalPosition {

    private final String id;
    private final String startDate;
    private final String endDate;
    private final String title;
    private final String organization;
    private final String short_description;
    private final List<String> responsibilities;
    private final List<String> accomplishments;

    public ProfessionalPosition(String id, String startDate, String endDate, String title,
                                String organization, String short_description,
                                List<String> responsibilities, List<String> accomplishments) {
        this.id = checkNotNull(id);
        this.startDate = checkNotNull(startDate);
        this.endDate = checkNotNull(endDate);
        this.title = checkNotNull(title);
        this.organization = checkNotNull(organization);
        this.short_description = checkNotNull(short_description);
        this.responsibilities = checkNotNull(responsibilities);
        this.accomplishments = checkNotNull(accomplishments);
    }

    public String getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getTitle() {
        return title;
    }

    public String getOrganization() {
        return organization;
    }

    public String getShort_description() {
        return short_description;
    }

    public List<String> getResponsibilities() {
        return responsibilities;
    }

    public List<String> getAccomplishments() {
        return accomplishments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfessionalPosition that = (ProfessionalPosition) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(startDate, that.startDate) &&
                Objects.equal(endDate, that.endDate) &&
                Objects.equal(title, that.title) &&
                Objects.equal(organization, that.organization) &&
                Objects.equal(short_description, that.short_description) &&
                Objects.equal(responsibilities, that.responsibilities) &&
                Objects.equal(accomplishments, that.accomplishments);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, startDate, endDate, title, organization, short_description, responsibilities, accomplishments);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("startDate", startDate)
                .add("endDate", endDate)
                .add("title", title)
                .add("organization", organization)
                .add("short_description", short_description)
                .add("responsibilities", responsibilities)
                .add("accomplishments", accomplishments)
                .toString();
    }
}
