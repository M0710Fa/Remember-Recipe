package com.example.remember_recipe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
                Text(text = "aaa")
            }
        ) {
            RecipeScreen()
        }

    }
}