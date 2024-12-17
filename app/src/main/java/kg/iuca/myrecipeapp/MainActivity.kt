package kg.iuca.myrecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kg.iuca.myrecipeapp.ui.theme.RecipeScreen
import kg.iuca.myrecipeapp.ui.theme.MyRecipeAppTheme
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyRecipeAppTheme {
        RecipeScreen()
        
    }
}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyRecipeAppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    RecipeScreen()
                }
            }
        }
    }
}

