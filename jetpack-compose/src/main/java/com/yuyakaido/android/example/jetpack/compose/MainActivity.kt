package com.yuyakaido.android.example.jetpack.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yuyakaido.android.example.jetpack.compose.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(ActivityMainBinding.inflate(layoutInflater).root)
  }

}
