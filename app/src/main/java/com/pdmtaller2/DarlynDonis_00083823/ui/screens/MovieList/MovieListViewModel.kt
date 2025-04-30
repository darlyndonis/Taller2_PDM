package com.pdmtaller2.DarlynDonis_00083823.ui.screens.MovieList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdmtaller2.DarlynDonis_00083823.data.model.Restaurant
import com.pdmtaller2.DarlynDonis_00083823.data.repository.Movie.MovieRepository
import com.pdmtaller2.DarlynDonis_00083823.data.repository.Movie.MovieRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MovieListViewModel: ViewModel() {
    val movieRepository:MovieRepository = MovieRepositoryImpl()

    private val _movies = MutableStateFlow<List<Restaurant>>(emptyList())
    val movies: StateFlow<List<Restaurant>> = _movies

    private val _loading = MutableStateFlow<Boolean>(false)
    val loading : StateFlow<Boolean> = _loading

    fun loadMovies () {
        viewModelScope.launch {
            _loading.value = true
            _movies.value = movieRepository.getMovies()
            _loading.value = false
        }
    }

}