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

        ///Adding application.
        // intent to MainActivity
        val theListOfMovies = application as ListOfMovies
        val intent2 = Intent(this, MainActivity::class.java)

        ///on save adds EditText value and switch value and assigns a location for a movie list item
        button_save.setOnClickListener {
            theListOfMovies.addMovie(movieListItem(movie_text.text.toString(), switch_seen.isChecked, theListOfMovies.movies.size))
            startActivity(intent2)
        }
        /// Gos back to MainActivity movies delete themselves as soon as I edit them
        button_delete.setOnClickListener {
            startActivity(intent2)
        }

        /// Sets data when coming from TextView onClickListener
        val movieInfo = intent.getSerializableExtra(MainActivity.MAIN_KEY)
        if (movieInfo != null){
            val allMovieInfo = movieInfo as movieListItem
            movie_text.setText(allMovieInfo.value)
            if (allMovieInfo.isChecked){switch_seen.toggle()}
        }
    }

    ///Same as save button but for the back press
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        val theListOfMovies = application as ListOfMovies
        theListOfMovies.addMovie(movieListItem(movie_text.text.toString(), switch_seen.isChecked, theListOfMovies.movies.size))
        startActivity(intent)
    }
}
