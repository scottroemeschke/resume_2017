package com.scottmeschke.resume2017.core.about.entity

import org.joda.time.DateTime

/**
 * Created by Scott on 5/12/2017.
 */
data class AboutMe(val name: Name, val description: String, val androidStartYear: Int, val skills: List<Skill>)

data class Skill(val name: String, val description: String, val iconCode: String)

data class Name(val first: String, val last: String)

data class Review(val name: Name, val text: String, val image: String, val date: DateTime)