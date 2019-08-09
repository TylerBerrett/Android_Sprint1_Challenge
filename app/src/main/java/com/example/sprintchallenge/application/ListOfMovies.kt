package com.example.sprintchallenge.application

import android.app.Application
import com.example.sprintchallenge.model.movieListItem

class ListOfMovies: Application() {
    var movies = ArrayList<movieListItem>()

    fun addMovie(movie: movieListItem) {
            movies.add(movie)
    }

}