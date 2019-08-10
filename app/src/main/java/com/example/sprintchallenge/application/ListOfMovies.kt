package com.example.sprintchallenge.application

import android.app.Application
import com.example.sprintchallenge.model.movieListItem


///Stores all my movieListItems into an array so I can access them in any activity
class ListOfMovies: Application() {
    var movies = ArrayList<movieListItem>()

    fun addMovie(movie: movieListItem) {
            movies.add(movie)
    }

    fun deleteMovie(location: Int){
        movies.removeAt(location)
    }

}