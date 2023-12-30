package com.example.learn_together

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learn_together.ui.theme.Learn_TogetherTheme

class TaskManagerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val imagePainter = painterResource(id = R.drawable.ic_task_completed)
            val tasksCompleted = stringResource(R.string.all_tasks_completed)
            val niceWork = stringResource(R.string.nice_work)
            Learn_TogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AllTasksCompleted(
                        imagePainter = imagePainter,
                        tasksCompleted = tasksCompleted,
                        niceWork = niceWork
                    )
                }
            }
        }
    }
}

@Composable
fun AllTasksCompleted(
    imagePainter: Painter,
    tasksCompleted: String,
    niceWork: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = imagePainter, contentDescription = null, alignment = Alignment.Center)
        Text(
            text = tasksCompleted,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(text = niceWork, fontSize = 16.sp)
    }

}

@Preview(showBackground = true)
@Composable
fun AllTasksCompletedPreview() {
    val imagePainter = painterResource(id = R.drawable.ic_task_completed)
    val tasksCompleted = stringResource(R.string.all_tasks_completed)
    val niceWork = stringResource(R.string.nice_work)
    Learn_TogetherTheme {
        AllTasksCompleted(
            imagePainter = imagePainter,
            tasksCompleted = tasksCompleted,
            niceWork = niceWork
        )
    }
}