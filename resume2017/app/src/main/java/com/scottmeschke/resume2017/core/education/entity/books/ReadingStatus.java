package com.scottmeschke.resume2017.core.education.entity.books;

/**
 * Created by Scott on 3/18/2017.
 */

public enum ReadingStatus {
    READING_CURRENTLY("reading_currently"),
    FINISHED("finished"),
    READING_SOON("reading_soon");

    private final String name;

    ReadingStatus(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
