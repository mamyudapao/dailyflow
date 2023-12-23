package com.example.dailyflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dailyflow.ui.components.Menu
import com.example.dailyflow.ui.theme.DailyFlowTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DailyFlowTheme {
                // Scaffoldを使用してアプリの基本的なレイアウトを設定
                Scaffold(
                    topBar = {
                        // TopAppBarを使用してアプリのタイトルを設定
                        TopAppBar(title = { Text(text = "DailyFlow") })
                    },
                    bottomBar = {
                        // Menuを使用してアプリのメニューを設定
                        Menu()
                    }
                ) {paddingValues ->
                    Box(modifier = Modifier.padding(paddingValues)) {
                        Greeting(name = "田中")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DailyFlowTheme {
        Greeting("田中")
    }
}