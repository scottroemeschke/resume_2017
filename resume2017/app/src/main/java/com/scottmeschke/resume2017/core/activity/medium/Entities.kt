package com.scottmeschke.resume2017.core.activity.medium

/**
 * Created by Scott on 5/12/2017.
 */
data class Article(val title: String, val date: String, val lengthInMinutes: Int, val publicationId: String)

data class Publication(val id: String, val title: String, val imgAsset: String, val tagline: String)

data class ArticleWithPublication(val article: Article, val publication: Publication)