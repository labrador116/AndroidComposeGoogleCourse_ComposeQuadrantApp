package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface {
                    QuadrantShowing()
                }
            }
        }
    }

    @Composable
    fun QuadrantShowing() {
        Row(modifier = Modifier.fillMaxSize()) {
            Column(Modifier.weight(1f)) {
                AddTitleText(
                    title = stringResource(R.string.title1_column_1),
                    text = stringResource(R.string.text1_column_1),
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Color(0xFFEADDFF))
                )
                AddTitleText(
                    title = stringResource(R.string.title2_column_1),
                    text = stringResource(R.string.text2_column_1),
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Color(0xFFB69DF8))
                )
            }

            Column(Modifier.weight(1f)) {
                AddTitleText(
                    title = stringResource(R.string.title1_column_2),
                    text = stringResource(R.string.text1_column_2),
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Color(0xFFD0BCFF))
                )
                AddTitleText(
                    title = stringResource(R.string.title2_column_2),
                    text = stringResource(R.string.text2_column_2),
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Color(0xFFF6EDFF))
                )
            }
        }
    }

    @Composable
    fun AddTitleText(title: String, text: String, modifier: Modifier) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = text,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun Preview() {
        QuadrantShowing()
    }
}
