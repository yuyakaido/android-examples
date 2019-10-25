package com.yuyakaido.android.example.core.java

import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubService {

  @GET("search/repositories")
  suspend fun search(
    @Query("q") query: String
  ): RepoListResponse

}