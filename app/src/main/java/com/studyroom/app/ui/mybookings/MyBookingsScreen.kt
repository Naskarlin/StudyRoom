package com.studyroom.app.ui.mybookings

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.studyroom.app.ui.components.PlaceholderScreen

@Composable
fun MyBookingsScreen(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    PlaceholderScreen(
        title = "My Bookings",
        description = "Placeholder screen. Your bookings will be listed here later.",
        modifier = modifier
    ) {
        OutlinedButton(onClick = onBackClick) { Text("Back") }
    }
}
