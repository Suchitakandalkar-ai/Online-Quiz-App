package com.example.onlinequizapp.models

data class Quiz(
    var id : String = "",
    var title: String = "",
    var questions: MutableMap<String, Question> = mutableMapOf()
)
