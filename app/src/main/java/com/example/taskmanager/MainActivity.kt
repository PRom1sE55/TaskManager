package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayContent(
                        imageResId = R.drawable.ic_task_completed,
                        contentDescription1 = "All tasks completed",
                        contentDescription2 = "Nice Work!")
                }
            }
        }
    }
}


@Composable
fun DisplayContent(imageResId: Int, modifier: Modifier = Modifier, contentDescription1 : String, contentDescription2 : String){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ){
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = "TaskCompletePreview"
        )
        Text(
            text = contentDescription1,
            fontSize = 24.sp,
            modifier = Modifier.padding(8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = contentDescription2,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DisplayContentPreview(){
    DisplayContent(
        imageResId = R.drawable.ic_task_completed,
        contentDescription1 = "All tasks completed",
        contentDescription2 = "Nice Work!")
}