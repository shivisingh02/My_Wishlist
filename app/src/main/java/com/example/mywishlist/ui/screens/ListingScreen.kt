package com.example.mywishlist.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.mywishlist.data.FakeRepository
import com.example.mywishlist.data.Item

@OptIn(ExperimentalGlideComposeApi::class, ExperimentalMaterial3Api::class)
@Composable
fun ListingScreen(onItemSelected: (Item) -> Unit) {
    val wishlist = FakeRepository().getItems()
    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        item {
            Text(
                text = "Adoption Centers",
                style = MaterialTheme.typography.headlineLarge
            )
        }
        items(wishlist) { item ->
            ItemCard(item = item, onClick = { onItemSelected(item) })
        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class, ExperimentalMaterial3Api::class)
@Composable
fun ItemCard(item: Item, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier.padding(10.dp)
    ) {
        GlideImage(
            model = item.img, contentDescription = item.title,
            contentScale = ContentScale.Crop,
            modifier =  Modifier.height(250.dp)
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = item.title)
            Text(text = item.website, style = MaterialTheme.typography.bodySmall)
        }

    }
}
