package com.pdmtaller2.DarlynDonis_00083823.ui.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller2.DarlynDonis_00083823.ui.screens.Favorites.Favorites
import com.pdmtaller2.DarlynDonis_00083823.ui.screens.MovieDetailScreen
import com.pdmtaller2.DarlynDonis_00083823.ui.screens.MovieList.MovieListScreen
import com.pdmtaller2.DarlynDonis_00083823.ui.screens.UpComming.UpComming

@Composable
fun MainNavigation(navController: NavHostController) {
    val onMovieClick = { movieId: Int ->
        navController.navigate(MovieDetailScreenNavigation(movieId))
    }

    NavHost(navController = navController, startDestination = MovieListScreenNavigation) {
        composable <MovieListScreenNavigation> {
            MovieListScreen(onMovieClick)
        }
        composable <MovieDetailScreenNavigation> { backStackEntry ->
            val movieId = backStackEntry.arguments?.getInt("id") ?: 0
            MovieDetailScreen(movieId = movieId)
        }
        composable<MyFavoritesScreenNavigation> {
            Favorites()
        }
        composable<UpCommingScreenNavigation> {
            UpComming()
        }
    }
}