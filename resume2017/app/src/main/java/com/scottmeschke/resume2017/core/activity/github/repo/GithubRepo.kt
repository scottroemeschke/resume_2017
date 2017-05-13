package com.scottmeschke.resume2017.core.activity.github.repo

import com.scottmeschke.resume2017.core.activity.github.Contribution
import io.reactivex.Observable

/**
 * Created by Scott on 5/12/2017.
 */

interface GitHubRepo {
    fun allContributions(): Observable<List<Contribution>>
    fun allRepositories(): Observable<List<GitHubRepo>>
    fun contributions(id: String): Observable<Contribution>
    fun repository(id: String): Observable<GitHubRepo>
}
