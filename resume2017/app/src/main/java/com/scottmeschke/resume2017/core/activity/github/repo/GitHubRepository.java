package com.scottmeschke.resume2017.core.activity.github.repo;

import com.scottmeschke.resume2017.core.activity.github.entity.GitHubContribution;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by Scott on 3/18/2017.
 */

public interface GitHubRepository {
    Single<List<GitHubContribution>> fetchAllContributions();
    Single<List<GitHubRepository>> fetchAllRepositories();
    Single<GitHubContribution> fetchContributions(String id);
    Single<GitHubRepository> fetchRepository(String id);
}
