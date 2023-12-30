package com.example.learn_together

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learn_together.ui.theme.Learn_TogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val imagePainter = painterResource(id = R.drawable.bg_compose_background)
            val title = stringResource(id = R.string.jetpack_compose_tutorial_title)
            val shortDescription =
                stringResource(id = R.string.jetpack_compose_is_a_modern_toolkit_text)
            val longDescription = stringResource(R.string.second_text)
            Learn_TogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnTogether(
                        title = title,
                        shortDescription = shortDescription,
                        longDescription = longDescription,
                        imagePainter = imagePainter
                    )
                }
            }
        }
    }
}

@Composable
fun LearnTogether(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier
) {

    Column(modifier = modifier) {
        Image(
            painter = imagePainter,
            contentDescription = null,
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )

        Text(
            text = shortDescription,
            fontSize = 14.sp,
            modifier = modifier.padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = longDescription,
            fontSize = 14.sp,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Learn_TogetherTheme {
    }
}