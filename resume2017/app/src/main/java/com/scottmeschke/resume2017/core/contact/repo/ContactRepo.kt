package com.scottmeschke.resume2017.core.contact.repo

import io.reactivex.Observable

/**
 * Created by Scott on 5/12/2017.
 */
interface ContactRepository {
    fun email(): Observable<String>
    fun phone(): Observable<String>
}
