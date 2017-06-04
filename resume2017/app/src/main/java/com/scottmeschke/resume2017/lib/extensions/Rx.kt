package com.scottmeschke.resume2017.lib.extensions

import com.jakewharton.rxrelay2.Relay

/**
 * Created by Scott on 5/27/2017.
 */
operator fun <T> Relay<T>.plus(item: T) {
    accept(item)
}