package com.interviewprep.moshi_androidlion48.repository.models.response

import android.os.Parcelable
import com.interviewprep.moshi_androidlion48.repository.models.Answer
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class AnswersResponse(
    @Json(name = "answers") var answers: List<Answer>? = null
) : Parcelable
