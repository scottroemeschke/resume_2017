package com.scottmeschke.resume2017.core.contact.repo;

import io.reactivex.Single;

/**
 * Created by Scott on 3/18/2017.
 */

public interface ContactRepository {
    Single<String> fetchEmail();
    Single<String> fetchPhone();
}
