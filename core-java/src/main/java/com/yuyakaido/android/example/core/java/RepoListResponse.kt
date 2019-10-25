package com.yuyakaido.android.example.core.java

import com.squareup.moshi.Json

data class RepoListResponse(
  @Json(name = "items") val items: List<Repo>
)