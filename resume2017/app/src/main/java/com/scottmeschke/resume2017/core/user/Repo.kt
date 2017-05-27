package com.scottmeschke.resume2017.core.user

import com.jakewharton.rxrelay2.BehaviorRelay
import com.scottmeschke.resume2017.lib.extensions.plus
import io.reactivex.Completable
import io.reactivex.Observable

/**
 * Created by Scott on 5/27/2017.
 */
interface UserRepo {
    fun userRole(): Observable<Role>
    fun updateUserRole(role: Role): Completable
    fun userHumanVerified(): Observable<Boolean>
    fun updateHumanVerified(verified: Boolean): Completable
}

class FakeUserRepo(initialRole: Role? = null, humanVerified: Boolean = false): UserRepo {

    private val roleRelay = BehaviorRelay.createDefault(initialRole ?: Role.UNKNOWN)
    private val humanVerification = BehaviorRelay.createDefault(humanVerified)

    override fun userHumanVerified(): Observable<Boolean> {
        return humanVerification.hide()
    }

    override fun updateHumanVerified(verified: Boolean): Completable {
        return Completable.fromAction { humanVerification + verified }
    }

    override fun userRole(): Observable<Role> {
        return roleRelay.hide()
    }

    override fun updateUserRole(role: Role): Completable {
        return Completable.fromAction { roleRelay + role }
    }

}