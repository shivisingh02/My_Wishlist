package com.example.mywishlist.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.mywishlist.data.Item
import com.example.mywishlist.ui.theme.UiState


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(uiState: UiState){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){

         Text(text = "Call Items Card")

        }
    }

@OptIn(ExperimentalGlideComposeApi::class, ExperimentalMaterial3Api::class)
@Composable
fun ItemsCard(item: Item) {
    Card(
    ) {
        GlideImage(
            model = item.img, contentDescription = item.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(250.dp)
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = item.title)
            Text(text = item.website, style = MaterialTheme.typography.bodySmall)
        }

    }
}
