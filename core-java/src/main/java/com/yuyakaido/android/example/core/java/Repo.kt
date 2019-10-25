package com.yuyakaido.android.example.core.java

import com.squareup.moshi.Json

data class Repo(
  @Json(name = "id") val id: Long,
  @Json(name = "name") val name: String,
  @Json(name = "owner") val owner: Owner
)