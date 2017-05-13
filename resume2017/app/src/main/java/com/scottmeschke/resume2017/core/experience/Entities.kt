package com.scottmeschke.resume2017.core.experience

/**
 * Created by Scott on 5/12/2017.
 */
data class Position(val id: String, val startDate: String, val endDate: String, val title: String,
                    val organization: String, val shortDescription: String,
                    val responsibilities: List<String>, val accomplishments: List<String>)

data class Project(val id: String, val title: String, val url: String, val description: String,
                   val features: List<String>, val screenshotPaths: List<String>)