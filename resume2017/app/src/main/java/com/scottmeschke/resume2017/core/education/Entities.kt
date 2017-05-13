package com.scottmeschke.resume2017.core.education

/**
 * Created by Scott on 5/12/2017.
 */
data class Book (val id: String, val readingStatus: ReadingStatus, val title: String,
                 val description: String, val url: String, val thoughts: String)

enum class ReadingStatus{
    CURRENT, FINISHED, LIST
}

data class FormalEducationSource(val id: String, val name: String, val graduationDate: String,
                                 val degree: String)
