package com.example.remember_recipe.ui.recipe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.remember_recipe.R
import com.example.remember_recipe.model.RecipeData

@Composable
fun RecipeCard(recipe: RecipeData,modifier: Modifier = Modifier){
    Surface(
        modifier = modifier.padding(16.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = 8.dp,
    ) {
        Column() {
            Image(painter = painterResource(id = R.drawable.free_image), null)
            Column(Modifier.padding(4.dp)) {
                Text(
                    text = recipe.name,
                    style = MaterialTheme.typography.h5
                )
                Text(recipe.description)
            }
        }
    }
}

@Preview
@Composable
fun RecipeCardPreview(){
    val recipe = RecipeData(id = 0, name = "テスト", description = "説明です")
    RecipeCard(recipe = recipe)
}