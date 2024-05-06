package com.chandan.cricketgame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chandan.cricketgame.ui.theme.CricketGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CricketGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CricketGame()
                }
            }
        }
    }
    @Composable
    fun CricketGame(){
        val originalScore = remember { mutableStateOf(0)}
        val action = remember { mutableStateOf("NotOut")}
        Column{
            Text(text = "Chandan's First Game App")
            Text(text = "Original Score : ${originalScore.value}")
            Text(text = "Action : ${action.value}")

            Row{
                Button(onClick = {
                    originalScore.value += 6
                    action.value = "Batsman pulled a Sixer"
                }) {
                    Text(text = "Sixer")
                }
                Button(onClick = {
                    originalScore.value += 4
                    action.value = "Batsman pulled a Four"
                }) {
                    Text(text = "Four")
                }
            }
           Row {
               Button(onClick = {
                   action.value = "Batsman got Out"
               }) {
                   Text(text = "Out")
               }
               Button(onClick = {
                   action.value = "Batsman is NotOut"
               }) {
                   Text(text = "NotOut")
               }
               Button(onClick = {
                   originalScore.value = 0
               }) {
                   Text(text = "Reset")
               }
           }
        }
    }

}

