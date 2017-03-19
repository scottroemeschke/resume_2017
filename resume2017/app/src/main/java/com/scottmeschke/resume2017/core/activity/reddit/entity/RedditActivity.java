package com.scottmeschke.resume2017.core.activity.reddit.entity;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Scott on 3/18/2017.
 */

public class RedditActivity {

    private final RedditActivityType activityType;
    private final Integer score;
    private final String body;
    private final String subredditName;
    private final String postTitle;
    private final String postUrl;

    public RedditActivity(RedditActivityType activityType, Integer score, String body,
                          String subredditName, String postTitle, String postUrl) {
        this.activityType = checkNotNull(activityType);
        this.score = checkNotNull(score);
        this.body = checkNotNull(body);
        this.subredditName = checkNotNull(subredditName);
        this.postTitle = checkNotNull(postTitle);
        this.postUrl = checkNotNull(postUrl);
    }

    public RedditActivityType getActivityType() {
        return activityType;
    }

    public Integer getScore() {
        return score;
    }

    public String getBody() {
        return body;
    }

    public String getSubredditName() {
        return subredditName;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public String getPostUrl() {
        return postUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RedditActivity that = (RedditActivity) o;
        return Objects.equal(activityType, that.activityType) &&
                Objects.equal(score, that.score) &&
                Objects.equal(body, that.body) &&
                Objects.equal(subredditName, that.subredditName) &&
                Objects.equal(postTitle, that.postTitle) &&
                Objects.equal(postUrl, that.postUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(activityType, score, body, subredditName, postTitle, postUrl);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("activityType",  activityType)
                .add("score", score)
                .add("body", body)
                .add("subredditName", subredditName)
                .add("postTitle", postTitle)
                .add("postUrl", postUrl)
                .toString();
    }
}
