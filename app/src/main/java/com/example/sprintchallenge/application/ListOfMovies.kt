package com.example.sprintchallenge.application

import com.example.sprintchallenge.model.movieListItem

class ListOfMovies {
    val movies = ArrayList<movieListItem>()

    fun addMovie(movie: movieListItem) {
        movies.add(movie)
    }

}