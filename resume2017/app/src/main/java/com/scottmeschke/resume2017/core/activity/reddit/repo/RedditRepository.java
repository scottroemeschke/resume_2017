package com.scottmeschke.resume2017.core.activity.reddit.repo;

import com.scottmeschke.resume2017.core.activity.reddit.entity.RedditActivity;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by Scott on 3/18/2017.
 */

public interface RedditRepository {
    Single<List<RedditActivity>> fetchRecentActivity(Integer count);
    Single<List<RedditActivity>> fetchRecentActivity(String date);
}
