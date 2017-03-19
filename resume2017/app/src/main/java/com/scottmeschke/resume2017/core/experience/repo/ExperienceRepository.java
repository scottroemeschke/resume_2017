package com.scottmeschke.resume2017.core.experience.repo;

import com.scottmeschke.resume2017.core.experience.entity.position.ProfessionalPosition;
import com.scottmeschke.resume2017.core.experience.entity.projects.ProfessionalProject;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by Scott on 3/18/2017.
 */

public interface ExperienceRepository {
    Single<List<ProfessionalPosition>> fetchAllPositions();
    Single<List<ProfessionalProject>> fetchAllProjects();
    Single<ProfessionalPosition> fetchPosition(String id);
    Single<ProfessionalProject> fetchProject(String id);
}
