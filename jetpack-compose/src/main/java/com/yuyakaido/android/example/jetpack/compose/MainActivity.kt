package com.yuyakaido.android.example.jetpack.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.core.sp
import androidx.ui.graphics.Color
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextDecoration

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { styledText("Hello Jetpack Compose") }
  }

  @Composable
  private fun styledText(text: String) {
    return Text(
      text = text,
      style = TextStyle(
        color = Color.DarkGray,
        fontSize = 28.sp,
        fontWeight = FontWeight.bold,
        background = Color.LightGray,
        decoration = TextDecoration.Underline
      )
    )
  }

}
