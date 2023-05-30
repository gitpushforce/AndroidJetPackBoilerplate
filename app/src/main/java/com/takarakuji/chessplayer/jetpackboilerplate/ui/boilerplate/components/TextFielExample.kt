package com.takarakuji.chessplayer.jetpackboilerplate.ui.boilerplate.components

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextFieldExampleSimple() {
    var myText by remember {
        mutableStateOf("")
    }
    TextField(value = myText, onValueChange = {myText = it})
}