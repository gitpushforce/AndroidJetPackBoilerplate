package com.takarakuji.chessplayer.jetpackboilerplate.ui.boilerplate.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LayoutsColumnsRows() {
    Column(Modifier.fillMaxSize()) {
        Row(
            Modifier.fillMaxWidth().weight(1f),
            verticalAlignment = Alignment.CenterVertically) {
            Box(Modifier.weight(1f).fillMaxHeight().background(Color.Cyan), contentAlignment = Alignment.Center) {
                Text("Ejemplo 1")
            }
        }
        Row(Modifier.fillMaxWidth().weight(1f)) {
            Box(Modifier.weight(1f).fillMaxHeight().background(Color.Red), contentAlignment = Alignment.Center) {
                Text("Ejemplo 2")
            }
            Box(Modifier.weight(1f).fillMaxHeight().background(Color.Green), contentAlignment = Alignment.Center) {
                Text("Ejemplo 3")
            }
        }
        Row(Modifier.fillMaxWidth().weight(1f)) {
            Box(Modifier.weight(1f).fillMaxHeight().background(Color.Magenta), contentAlignment = Alignment.BottomCenter) {
                Text("Ejemplo 4")
            }
        }
    }
}