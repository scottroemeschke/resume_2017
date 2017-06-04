package com.scottmeschke.resume2017.core.activity.medium.repo

import com.scottmeschke.resume2017.core.activity.medium.ArticleWithPublication
import com.scottmeschke.resume2017.core.activity.medium.Publication
import io.reactivex.Observable

/**
 * Created by Scott on 5/12/2017.
 */
interface MediumRepository {
    fun observeAllArticles(): Observable<List<ArticleWithPublication>>
    fun observeAllPublications(): Observable<List<Publication>>
    fun observeArticle(id: String): Observable<ArticleWithPublication>
    fun observePublication(id: String): Observable<Publication>
}
