package com.studyroom.app.ui.rooms

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.studyroom.app.ui.components.PlaceholderScreen

@Composable
fun RoomDetailScreen(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    PlaceholderScreen(
        title = "Room Detail",
        description = "Placeholder screen. Room information and time slots will be added later.",
        modifier = modifier
    ) {
        OutlinedButton(onClick = onBackClick) { Text("Back") }
    }
}
