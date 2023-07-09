package uk.co.jatra.mm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform