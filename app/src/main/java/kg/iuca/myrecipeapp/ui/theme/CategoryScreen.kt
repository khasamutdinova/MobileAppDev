package kg.iuca.myrecipeapp.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kg.iuca.myrecipeapp.network.Category

@Composable
fun CategoryScreen(
    categories: List<Category>,
    navigateToDetail: (Category) -> Unit
) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(categories) { category ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { navigateToDetail(category) }
                    .padding(16.dp)
            ) {
                CategoryItem(category = category)
            }
        }
    }
}
