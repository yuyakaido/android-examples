package com.yuyakaido.android.example.jetpack.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.core.sp
import androidx.ui.graphics.Color
import androidx.ui.layout.Padding
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Padding(16.dp) {
        styledText("Hello Jetpack Compose")
      }
    }
  }

  @Composable
  private fun styledText(text: String) {
    return Text(
      text = text,
      style = TextStyle(
        color = Color.DarkGray,
        fontSize = 20.sp,
        fontWeight = FontWeight.bold
      )
    )
  }

}
