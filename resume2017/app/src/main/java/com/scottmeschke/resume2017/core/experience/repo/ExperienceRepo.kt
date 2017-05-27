package com.scottmeschke.resume2017.core.experience.repo

import com.scottmeschke.resume2017.core.experience.Position
import com.scottmeschke.resume2017.core.experience.Project
import io.reactivex.Observable

/**
 * Created by Scott on 5/12/2017.
 */
interface ExperienceRepository {
    fun allPositions(): Observable<List<Position>>
    fun allProjects(): Observable<List<Project>>
    fun position(id: String): Observable<Position>
    fun project(id: String): Observable<Project>
}
