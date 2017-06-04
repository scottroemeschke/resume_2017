package com.scottmeschke.resume2017.core.about.repo

import com.scottmeschke.resume2017.core.about.entity.AboutMe
import com.scottmeschke.resume2017.core.about.entity.Review
import io.reactivex.Observable

/**
 * Created by Scott on 5/12/2017.
 */
interface AboutRepo {
    fun aboutMe(): Observable<AboutMe>
    fun reviews() : Observable<List<Review>>
}