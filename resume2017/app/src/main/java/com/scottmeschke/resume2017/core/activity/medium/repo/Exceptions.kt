package com.scottmeschke.resume2017.core.activity.medium.repo

/**
 * Created by Scott on 5/12/2017.
 */
class NoMediumArticleFoundException private constructor(private val articleId: String) : Exception() {
    override val message
       get() = "No Article found for id:" + articleId
}

class NoMediumPublicationFoundException private constructor(private val articleId: String) : Exception() {
    override val message
        get() = "No Publication found for id:" + articleId
}
