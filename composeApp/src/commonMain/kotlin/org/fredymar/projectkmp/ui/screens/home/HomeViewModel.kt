package org.fredymar.projectkmp.ui.screens.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil3.compose.AsyncImagePainter
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.fredymar.projectkmp.Movie
import org.fredymar.projectkmp.movies

class HomeViewModel: ViewModel() {

    var state by mutableStateOf(UiState())
    private set

    init {
        viewModelScope.launch {
            state = UiState(loading = true)
            delay(1000)
            state = UiState(loading = false, movie = movies)
        }
    }

    data class UiState(
        val loading: Boolean = false,
        val movie: List<Movie> = emptyList()
    )
}