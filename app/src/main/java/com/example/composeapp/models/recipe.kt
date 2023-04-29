package com.example.composeapp.models

import androidx.annotation.DrawableRes

data class recipe (
    val id: Int,
    val title : String,
     val ingredients: List<String>,
     @DrawableRes val imageResource: Int,
     val procedure: List<String>

 ) {
}
