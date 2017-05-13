package com.scottmeschke.resume2017.core.activity.reddit

/**
 * Created by Scott on 5/12/2017.
 */
data class Activity(val type: ActivityType, val score: Int, val body: String, val subreddit: String,
                      val postTitle: String, val postUrl: String)

enum class ActivityType {
    POST, COMMENT
}