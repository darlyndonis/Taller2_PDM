package com.pdmtaller2.DarlynDonis_00083823.data.repository.Movie

import com.pdmtaller2.DarlynDonis_00083823.data.model.Restaurant

interface MovieRepository {
    suspend fun getMovies(): List<Restaurant>
}