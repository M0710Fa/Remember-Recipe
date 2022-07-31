package com.example.remember_recipe.ui.recipe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.remember_recipe.R

@Composable
fun RecipeCard(modifier: Modifier = Modifier){
    Surface(
        modifier = modifier,
        elevation = 1.dp
    ) {
        Column() {
            Image(painter = painterResource(id = R.drawable.free_image), null)
            Column() {
                Text("Name")
                Text("description")
            }
        }
    }
}

@Preview
@Composable
fun RecipeCardPreview(){
    RecipeCard()
}