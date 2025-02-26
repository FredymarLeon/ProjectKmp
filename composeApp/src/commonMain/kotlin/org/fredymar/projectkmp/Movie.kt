package org.fredymar.projectkmp


data class Movie(
    val id: Int,
    val title: String,
    val poster: String
)

val movies = (1..105).map {
    Movie(
        id = it,
        title = "Movie $it",
        poster = "https://picsum.photos/200/300?id=$it"
    )
}