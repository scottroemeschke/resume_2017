package com.scottmeschke.resume2017.core.activity.github.repo

/**
 * Created by Scott on 5/12/2017.
 */
class GitHubContributionNotFoundException (private val contributionId: String) : Exception() {

    override val message: String
        get() = "No GitHubContribution found for id:" + contributionId
}

class GitHubRepositoryNotFoundException (private val contributionId: String) : Exception() {

    override val message: String
       get() = "No GitHubRepo found for id:" + contributionId
}
