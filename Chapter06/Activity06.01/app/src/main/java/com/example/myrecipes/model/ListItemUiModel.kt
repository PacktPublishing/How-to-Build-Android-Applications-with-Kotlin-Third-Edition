package com.example.myrecipes.model

sealed class ListItemUiModel {
    data class Title(val title: String, val flavor: Flavor) : ListItemUiModel()

    data class Recipe(val recipe: RecipeUiModel) : ListItemUiModel()
}
