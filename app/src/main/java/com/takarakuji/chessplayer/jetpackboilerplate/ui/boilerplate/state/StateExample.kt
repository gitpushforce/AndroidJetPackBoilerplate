package com.takarakuji.chessplayer.jetpackboilerplate.ui.boilerplate.state

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyStateExample() {
    // remember will save the value if the view doesn't get destroyed.
    // The view gets destroyed when the view gets rotated for example.
//    var counter = remember {
//        mutableStateOf(0)
//    }
    
    // rememberSavable will save the value even the view gets destroyed.
//    val counter = rememberSaveable {
//        mutableStateOf(0)
//    }

    // Same result as line line 27 , instead using = synbol.
    // With this way we don't need to use { counter.value += 1 } to increase and ${counter.value} to get the value
    var counter by rememberSaveable() {
        mutableStateOf(0)
    }

    Column (
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
            ) {
        Button(onClick = { counter += 1 }) {
            Text(text = "Press")
        }
        Text(text = "I have been pressed $counter times")
    }
}
