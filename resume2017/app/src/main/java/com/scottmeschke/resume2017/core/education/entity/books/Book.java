package com.scottmeschke.resume2017.core.education.entity.books;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class Book {

    private final String id;
    private final ReadingStatus readingStatus;
    private final String title;
    private final String description;
    private final String url;

    public Book(String id, ReadingStatus readingStatus, String title, String description, String url) {
        this.id = checkNotNull(id);
        this.readingStatus = checkNotNull(readingStatus);
        this.title = checkNotNull(title);
        this.description = checkNotNull(description);
        this.url = checkNotNull(url);
    }

    public ReadingStatus getReadingStatus() {
        return readingStatus;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("readingStatus", readingStatus)
                .add("title", title)
                .add("description", description)
                .add("url", url)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equal(id, book.id) &&
                Objects.equal(readingStatus, book.readingStatus) &&
                Objects.equal(title, book.title) &&
                Objects.equal(description, book.description) &&
                Objects.equal(url, book.url);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, readingStatus, title, description, url);
    }
}
