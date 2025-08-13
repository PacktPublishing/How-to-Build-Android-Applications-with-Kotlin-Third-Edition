package com.packt.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.packt.android.ui.theme.Activity1301Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Activity1301Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Post(
                        postViewModel = viewModel(),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Post(
    postViewModel: PostViewModel,
    modifier: Modifier
) {
    PostScreen(state = postViewModel.state.collectAsState().value, modifier = modifier)
}

@Composable
fun PostScreen(
    state: PostViewModel.State,
    modifier: Modifier
) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(state.posts.size) {
            val index = it
            Column(modifier = Modifier.padding(4.dp)) {
                Text(text = state.posts[index].title)
                Text(text = state.posts[index].body)
            }
        }

    }
}

