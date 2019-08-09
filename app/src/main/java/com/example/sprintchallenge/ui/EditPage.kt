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

        val intent2 = Intent(this, MainActivity::class.java)

        button_save.setOnClickListener {
            theListOfMovies.addMovie(movieListItem(movie_text.text.toString(), switch_seen.isChecked, theListOfMovies.movies.size))
            startActivity(intent2)
        }

        button_delete.setOnClickListener {
            startActivity(intent2)
        }


        var movieInfo = intent.getSerializableExtra(MainActivity.MAIN_KEY)
        if (movieInfo != null){
            var allMovieInfo = movieInfo as movieListItem
            movie_text.setText(allMovieInfo.value)
            if (allMovieInfo.isChecked){switch_seen.toggle()}
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        val theListOfMovies = application as ListOfMovies
        theListOfMovies.addMovie(movieListItem(movie_text.text.toString(), switch_seen.isChecked, theListOfMovies.movies.size))
        startActivity(intent)
    }


}
