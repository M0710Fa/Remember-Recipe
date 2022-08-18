package com.example.remember_recipe.ui.recipe

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.remember_recipe.model.RecipeData

@Composable
fun RecipeList(recipeList: List<RecipeData>, modifier: Modifier){
    LazyColumn(){
        items(recipeList) { recipe ->
            RecipeCard(recipe)
        }
    }
}