package com.interviewprep.moshi_androidlion48.repository.tc2rgithubrepository

import com.interviewprep.moshi_androidlion48.network.RetrofitBuilders
import com.interviewprep.moshi_androidlion48.repository.models.response.AnswersResponse
import com.interviewprep.moshi_androidlion48.repository.models.response.QuestionsResponse
import retrofit2.Response

class Tc2rGithubRepository {
    private val TAG = "ACTEST"

    companion object {
        private val retrofitBuilder: RetrofitBuilders = RetrofitBuilders()
    }

    // Creates API object using Retrofit to implement API Service
    private val tc2rGithubService = retrofitBuilder.tc2rGithubService

    suspend fun getAndroidAnswers(): Response<AnswersResponse>? {
        val request = tc2rGithubService.getAnswersResponse()

        // we got back a response, it is successful.
        if (request.isSuccessful) {
            return request
        }

        return null
    }

    suspend fun getAndroidQuestions(): Response<QuestionsResponse> {
        return tc2rGithubService.getQuestionsResponse()
    }
}