package com.studyroom.app.ui.rooms

import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.studyroom.app.ui.components.PlaceholderScreen

@Composable
fun RoomsScreen(
    onRoomClick: () -> Unit,
    onMyBookingsClick: () -> Unit,
    onLogoutClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    PlaceholderScreen(
        title = "Rooms",
        description = "Placeholder screen. The list of study rooms will be added later.",
        modifier = modifier
    ) {
        Button(onClick = onRoomClick) { Text("Open room (example)") }
        OutlinedButton(onClick = onMyBookingsClick) { Text("My bookings") }
        TextButton(onClick = onLogoutClick) { Text("Log out") }
    }
}
