package com.studyroom.app.ui.auth

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.studyroom.app.ui.components.PlaceholderScreen

@Composable
fun LoginScreen(
    onLoginClick: () -> Unit,
    onCreateAccountClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    PlaceholderScreen(
        title = "Login",
        description = "Placeholder screen. The login form will be added later.",
        modifier = modifier
    ) {
        Button(onClick = onLoginClick) { Text("Log in") }
        TextButton(onClick = onCreateAccountClick) { Text("Create account") }
    }
}
