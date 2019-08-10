package com.example.sprintchallenge.model

import java.io.Serializable

///creates my "cookie cutter" for adding movies and is a Serializable so I can move the data around with Intents
class movieListItem (var value: String, var isChecked: Boolean, var location: Int): Serializable