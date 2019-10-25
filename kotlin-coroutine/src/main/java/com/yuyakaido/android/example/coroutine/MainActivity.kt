package com.yuyakaido.android.example.coroutine

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.yuyakaido.android.example.coroutine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private val viewModel by viewModels<SearchRepoViewModel>()
  private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)
    viewModel.onCreate()
  }

}
