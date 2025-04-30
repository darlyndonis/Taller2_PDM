package com.pdmtaller2.DarlynDonis_00083823.data.model

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val category: String,
    val backdropUrl: String,
    val imageUrl: String,
    val menu: List<MenuItem>
)

data class MenuItem(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String
)