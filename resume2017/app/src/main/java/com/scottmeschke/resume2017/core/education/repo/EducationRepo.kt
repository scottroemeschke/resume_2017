package com.scottmeschke.resume2017.core.education.repo

import com.scottmeschke.resume2017.core.education.Book
import com.scottmeschke.resume2017.core.education.FormalEducationSource
import io.reactivex.Observable

/**
 * Created by Scott on 5/12/2017.
 */
interface EducationRepository {
    fun allBooks(): Observable<List<Book>>
    fun allFormalEducationSources(): Observable<List<FormalEducationSource>>
    fun book(id: String): Observable<Book>
    fun educationSource(id: String): Observable<FormalEducationSource>
}
