package org.fredymar.projectkmp

import androidx.compose.runtime.Composable
import coil3.ImageLoader
import coil3.annotation.ExperimentalCoilApi
import coil3.compose.setSingletonImageLoaderFactory
import coil3.request.crossfade
import coil3.util.DebugLogger
import org.fredymar.projectkmp.ui.screens.Navigation
import org.fredymar.projectkmp.ui.screens.detail.DetailScreen
import org.fredymar.projectkmp.ui.screens.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalCoilApi::class)
@Composable
@Preview
fun App() {
    setSingletonImageLoaderFactory { context ->
        ImageLoader.Builder(context)
            .crossfade(true)
            .logger(DebugLogger())
            .build()
    }

    Navigation()
}