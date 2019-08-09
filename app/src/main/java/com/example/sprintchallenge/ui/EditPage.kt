package com.example.sprintchallenge.ui

import android.app.Application
import android.content.Intent
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

        val theListOfMovies = application as ListOfMovies

        button_save.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            theListOfMovies.addMovie(movieListItem(movie_text.text.toString(), switch_seen.isChecked, theListOfMovies.movies.size))
            println(theListOfMovies.movies)
            startActivity(intent)
        }


    }
}
