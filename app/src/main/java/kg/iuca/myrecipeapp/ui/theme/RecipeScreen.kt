package kg.iuca.myrecipeapp.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import kg.iuca.myrecipeapp.viewmodel.MainViewModel

@Composable
fun RecipeScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    val recipeViewModel: MainViewModel = viewModel()
    val viewState by recipeViewModel.categoriesState

    Box(modifier = Modifier.fillMaxSize()) {
        when {
            viewState.loading -> {
                Text(text = "Loading!", modifier = Modifier.align(Alignment.Center))
            }
            viewState.error != null -> {
                Text("ERROR OCCURRED", modifier = Modifier.align(Alignment.Center))
            }
            else -> {
                CategoryScreen(
                    categories = viewState.list,
                    navigateToDetail = { category ->
                        // Сохранение выбранной категории в состоянии
                        navController.currentBackStackEntry
                            ?.savedStateHandle
                            ?.set("category", category)
                        // Навигация на экран DetailScreen
                        navController.navigate(Screen.DetailScreen.route)
                    }
                )
            }
        }
    }
}
