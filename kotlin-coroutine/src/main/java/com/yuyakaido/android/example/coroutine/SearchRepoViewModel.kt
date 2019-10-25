package com.yuyakaido.android.example.coroutine

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.yuyakaido.android.example.core.java.GitHubService
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class SearchRepoViewModel(
  application: Application
) : AndroidViewModel(application) {

  private val service = Retrofit.Builder()
    .baseUrl("https://api.github.com")
    .addConverterFactory(MoshiConverterFactory.create())
    .build()
    .create(GitHubService::class.java)

  fun onCreate() {
    viewModelScope.launch {
      val response = service.search("CardStackView")
      Log.d("MainActivity: ${Thread.currentThread().name}", "Response = $response")
    }
  }

}