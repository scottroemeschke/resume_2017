package com.scottmeschke.resume2017.core.about.repo

import com.scottmeschke.resume2017.core.about.entity.AboutMe
import io.reactivex.Observable

/**
 * Created by Scott on 5/12/2017.
 */
interface AboutRepo {
    fun aboutMe(): Observable<AboutMe>
}