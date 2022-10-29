package com.interviewprep.moshi_androidlion48.repository.models

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Answer(
    @Json(name = "answer") var answer: String? = null,
    @Json(name = "details") var details: String? = null
) : Parcelable
