package com.takarakuji.chessplayer.jetpackboilerplate.ui.boilerplate.state

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyStateExample() {
    var counter = remember {
        mutableStateOf(0)
    }

    Column (
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
            ) {
        Button(onClick = { counter.value += 1 }) {
            Text(text = "Press")
        }
        Text(text = "I have been pressed ${counter.value} times")
    }
}
