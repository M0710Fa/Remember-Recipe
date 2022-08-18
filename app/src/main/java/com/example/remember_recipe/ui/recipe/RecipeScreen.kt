package com.example.remember_recipe.ui.recipe

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.remember_recipe.model.RecipeData

@Composable
fun RecipeScreen(modifier: Modifier = Modifier) {
    Column() {
        RecipeList(SampleRecipeList, modifier = modifier.padding(16.dp))
    }
}

val SampleRecipeList = listOf(
    RecipeData(id = 0, name = "レシピA", description = "レシピAです"),
    RecipeData(id = 1, name = "レシピB", description = "レシピBです"),
    RecipeData(id = 2, name = "レシピC", description = "レシピCです")
)