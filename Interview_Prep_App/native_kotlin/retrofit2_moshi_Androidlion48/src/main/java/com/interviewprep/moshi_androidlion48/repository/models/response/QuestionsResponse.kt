package com.interviewprep.moshi_androidlion48.repository.models.response

import com.interviewprep.moshi_androidlion48.repository.models.Question
import com.squareup.moshi.Json

class QuestionsResponse(@field:Json(name = "questions") val questions: List<Question>)
