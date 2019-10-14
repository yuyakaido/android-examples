package com.yuyakaido.android.example.jetpack.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.core.sp
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Padding
import androidx.ui.layout.Row
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { counter() }
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

  @Composable
  private fun textColumns() {
    Column {
      styledText("Column 1")
      styledText("Column 2")
      styledText("Column 3")
    }
  }

  @Composable
  private fun textRows() {
    Row {
      styledText("Column 1")
      styledText("Column 2")
      styledText("Column 3")
    }
  }

  @Composable
  private fun textWithPadding() {
    Padding(16.dp) {
      styledText("Hello Jetpack Compose")
    }
  }

  @Composable
  private fun counter() {
    val count = +state { 0 }
    MaterialTheme {
      Column {
        Button(
          text = "Increment",
          onClick = {
            count.value++
          }
        )
        styledText("Count: ${count.value}")
      }
    }
  }

}
