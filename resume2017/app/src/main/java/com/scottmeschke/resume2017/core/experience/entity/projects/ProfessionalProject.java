package com.scottmeschke.resume2017.core.experience.entity.projects;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class ProfessionalProject {

    private final String id;
    private final String title;
    private final String url;
    private final String description;
    private final List<String> features;
    private final List<String> screenshotPaths;

    public ProfessionalProject(String id, String title, String url, String description,
                               List<String> features, List<String> screenshotPaths) {
        this.id = checkNotNull(id);
        this.title = checkNotNull(title);
        this.url = checkNotNull(url);
        this.description = checkNotNull(description);
        this.features = checkNotNull(features);
        this.screenshotPaths = checkNotNull(screenshotPaths);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getFeatures() {
        return features;
    }

    public List<String> getScreenshotPaths() {
        return screenshotPaths;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfessionalProject that = (ProfessionalProject) o;
        return Objects.equal(id,that.id) &&
                Objects.equal(title, that.title) &&
                Objects.equal(url, that.url) &&
                Objects.equal(description, that.description) &&
                Objects.equal(features, that.features) &&
                Objects.equal(screenshotPaths, that.screenshotPaths);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, title, url, description, features, screenshotPaths);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("title", title)
                .add("url", url)
                .add("description", description)
                .add("features", features)
                .add("screenshotPaths", screenshotPaths)
                .toString();
    }
}
