package com.scottmeschke.resume2017.core.education.repo;

import com.scottmeschke.resume2017.core.education.entity.books.Book;
import com.scottmeschke.resume2017.core.education.entity.formal.FormalEducationSource;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by Scott on 3/18/2017.
 */

public interface EducationRepository {
    Single<List<Book>> fetchAllBooks();
    Single<List<FormalEducationSource>> fetchAllFormalEducationSources();
    Single<Book> fetchBook(String id);
    Single<FormalEducationSource> fetchEducationSource(String id);
}
