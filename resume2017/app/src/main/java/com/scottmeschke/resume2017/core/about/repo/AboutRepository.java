package com.scottmeschke.resume2017.core.about.repo;

import com.scottmeschke.resume2017.core.about.entity.AboutMe;

import io.reactivex.Single;

/**
 * Created by Scott on 3/18/2017.
 */

public interface AboutRepository {
    Single<AboutMe> fetchAboutMe();
}
