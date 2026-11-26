package com.studyroom.app.ui.auth

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.studyroom.app.ui.components.PlaceholderScreen

@Composable
fun RegisterScreen(
    onRegisterClick: () -> Unit,
    onBackToLoginClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    PlaceholderScreen(
        title = "Register",
        description = "Placeholder screen. The registration form will be added later.",
        modifier = modifier
    ) {
        Button(onClick = onRegisterClick) { Text("Register") }
        TextButton(onClick = onBackToLoginClick) { Text("Back to login") }
    }
}
