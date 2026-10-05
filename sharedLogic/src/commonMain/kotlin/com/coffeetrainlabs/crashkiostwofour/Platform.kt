package com.coffeetrainlabs.crashkiostwofour

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform