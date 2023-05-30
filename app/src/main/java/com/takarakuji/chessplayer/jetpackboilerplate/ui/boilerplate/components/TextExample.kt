package com.takarakuji.chessplayer.jetpackboilerplate.ui.boilerplate.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextExample() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "This is an example")
        Text(text = "This is an example", color = Color.Blue)
        Text(text = "This is an example", fontWeight = FontWeight.ExtraBold)
        Text(text = "This is an example", fontWeight = FontWeight.Light)
        Text(text = "This is an example", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(
            text = "This is an example",
            style = TextStyle(textDecoration = TextDecoration.LineThrough)
        )
        Text(
            text = "This is an example",
            style = TextStyle(textDecoration = TextDecoration.Underline)
        )
        Text(
            text = "This is an example",
            style = TextStyle(
                textDecoration = TextDecoration.combine(
                    listOf(
                        TextDecoration.LineThrough,
                        TextDecoration.Underline
                    )
                )
            )
        )
        Text(
            text = "This is an example",
            fontSize = 30.sp
        )
    }

}