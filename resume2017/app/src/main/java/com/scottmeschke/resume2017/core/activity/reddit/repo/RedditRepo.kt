package com.scottmeschke.resume2017.core.activity.reddit.repo

import com.scottmeschke.resume2017.core.activity.reddit.Activity
import io.reactivex.Observable

/**
 * Created by Scott on 5/12/2017.
 */
interface RedditRepo {
    fun observeRecentActivity(count: Int?): Observable<List<Activity>>
    fun observeRecentActivity(date: String): Observable<List<Activity>>
}
