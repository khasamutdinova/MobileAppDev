package kg.iuca.myrecipeapp.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kg.iuca.myrecipeapp.network.Category

@Composable
fun RecipeApp(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.RecipeScreen.route) {
        composable(Screen.RecipeScreen.route) {
            RecipeScreen(navController = navController)
        }
        composable(Screen.DetailScreen.route) {
            val category = navController.previousBackStackEntry
                ?.savedStateHandle
                ?.get<Category>("category") ?: Category("", "", "", "")
            CategoryDetailScreen(category = category)
        }
    }
}