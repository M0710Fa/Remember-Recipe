package com.example.remember_recipe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.remember_recipe.ui.recipe.RecipeScreen
import com.example.remember_recipe.ui.theme.RememberrecipeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RememberRecipeApp()
        }
    }
}

@Composable
fun RememberRecipeApp(){
    RememberrecipeTheme {
        Scaffold(
            topBar = {
                Text(
                    stringResource(id = R.string.recipeList_name),
                    style = MaterialTheme.typography.h4
                )
            }
        ) {
            RecipeScreen()
        }

    }
}