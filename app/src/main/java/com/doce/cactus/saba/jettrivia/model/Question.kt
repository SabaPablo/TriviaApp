package com.doce.cactus.saba.jettrivia.model

data class Question(
    val question:String,
    val category: String,
    val answer: String,
    val choices: List<String>

    )
