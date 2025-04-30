package com.pdmtaller2.DarlynDonis_00083823.data.repository.Movie

import com.pdmtaller2.DarlynDonis_00083823.data.dummy.dummyRestaurants
import com.pdmtaller2.DarlynDonis_00083823.data.model.Restaurant
import kotlinx.coroutines.delay

class MovieRepositoryImpl:MovieRepository {

    override suspend fun getMovies(): List<Restaurant> {
        delay(5000)
        return dummyRestaurants
    }
}