package com.example.sprintchallenge.ui

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sprintchallenge.R
import com.example.sprintchallenge.application.ListOfMovies
import com.example.sprintchallenge.model.movieListItem
import kotlinx.android.synthetic.main.activity_edit_page.*
import kotlinx.android.synthetic.main.activity_main.*

class EditPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_page)

        val movieText = movie_text.text.toString()
        val seenMovie = switch_seen.isChecked


        button_add.setOnClickListener {
            ListOfMovies.addMovie(movieListItem(movieText, seenMovie, ListOfMovies.movies.size))

        }


    }
}
