package com.doce.cactus.saba.jettrivia.api

import com.doce.cactus.saba.jettrivia.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {

    @GET("world.json")
    suspend fun getAllQuestions(): List<Question>
}