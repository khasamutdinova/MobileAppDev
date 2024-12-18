package kg.iuca.myrecipeapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import kg.iuca.myrecipeapp.network.Category

@Composable
fun CategoryDetailScreen(category: Category) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Category Name: ${category.name}",
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Image(
            painter = rememberAsyncImagePainter(category.thumbnail),
            contentDescription = "Category Image",
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 8.dp)
        )

        Text(
            text = "Description: ${category.description}",
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}