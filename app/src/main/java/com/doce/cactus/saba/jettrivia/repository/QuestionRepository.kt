package com.doce.cactus.saba.jettrivia.repository

import android.util.Log
import com.doce.cactus.saba.jettrivia.api.QuestionApi
import com.doce.cactus.saba.jettrivia.data.DataOrException
import com.doce.cactus.saba.jettrivia.model.Question
import java.util.concurrent.Flow
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {
    private val dataOrException = DataOrException<List<Question>,Boolean, Exception>()


    suspend fun getAllQuestions(): DataOrException<List<Question>, Boolean, Exception>{
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()

        }catch (exception: Exception){
            dataOrException.e = exception
            exception.printStackTrace()
        }finally {
            dataOrException.loading = false
        }
        return dataOrException
    }
}