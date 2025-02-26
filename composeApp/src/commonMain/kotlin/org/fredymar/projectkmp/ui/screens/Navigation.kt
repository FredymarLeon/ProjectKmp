package org.fredymar.projectkmp.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.fredymar.projectkmp.movies
import org.fredymar.projectkmp.ui.screens.detail.DetailScreen
import org.fredymar.projectkmp.ui.screens.home.HomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                onMovieClick = {movie ->
                   navController.navigate("details/${movie.id}")
                }
            )
        }
        composable(
            "details/{movieId}",
            arguments = listOf(navArgument("movieId") { type = NavType.IntType })
        ) {backStackEntry ->
                val movieId = backStackEntry.arguments?.getInt("movieId")
            DetailScreen(
                movie = movies.first {it.id == movieId},
                onBack = {navController.popBackStack()}
            )
        }
    }
}