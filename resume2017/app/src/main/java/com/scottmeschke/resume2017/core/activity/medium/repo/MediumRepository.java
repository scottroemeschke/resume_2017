package com.scottmeschke.resume2017.core.activity.medium.repo;

import com.scottmeschke.resume2017.core.activity.medium.entity.MediumArticleWithPublication;
import com.scottmeschke.resume2017.core.activity.medium.entity.MediumPublication;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by Scott on 3/18/2017.
 */

public interface MediumRepository {
    Single<List<MediumArticleWithPublication>> fetchAllArticles();
    Single<List<MediumPublication>> fetchAllPublications();
    Single<MediumArticleWithPublication> fetchArticle(String id);
    Single<MediumPublication> fetchPublication(String id);
}
