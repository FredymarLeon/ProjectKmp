package org.fredymar.projectkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform