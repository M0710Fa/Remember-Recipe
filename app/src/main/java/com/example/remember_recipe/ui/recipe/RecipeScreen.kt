package com.example.remember_recipe.ui.recipe

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RecipeScreen(modifier: Modifier = Modifier) {
    Column() {

        RecipeCard(modifier = modifier.padding(16.dp))
    }
}