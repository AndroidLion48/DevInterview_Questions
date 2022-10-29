package com.interviewprep.moshi_androidlion48.repository.models

import com.squareup.moshi.Json

data class Question(
    @field:Json(name = "details") var details: String,
    @field:Json(name = "id") var id: Int,
    @field:Json(name = "question") var question: String,
    @field:Json(name = "questionType") var questionType: String,
    @field:Json(name = "shortAns") var shortAns: String,
    @field:Json(name = "tag") var tag: String,
    @field:Json(name = "trueOrFalse") var trueOrFalse: Boolean
)
