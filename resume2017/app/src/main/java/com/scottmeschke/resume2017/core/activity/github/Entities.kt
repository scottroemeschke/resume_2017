package com.scottmeschke.resume2017.core.activity.github

/**
 * Created by Scott on 5/12/2017.
 */

data class Contribution(val date: String, val repositoryId: String, val pullRequest: PullRequest)

data class PullRequest(val url: String, val description: String)

data class Repository(val id: String, val personal: Boolean, val url: String, val description: String)