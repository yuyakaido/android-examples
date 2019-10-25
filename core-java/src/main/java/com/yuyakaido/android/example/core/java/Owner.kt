package com.yuyakaido.android.example.core.java

import com.squareup.moshi.Json

data class Owner(
  @Json(name = "id") val id: Long,
  @Json(name = "login") val login: String,
  @Json(name = "avatar_url") val avatarUrl: String
)