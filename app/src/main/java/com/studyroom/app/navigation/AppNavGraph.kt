package com.studyroom.app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.studyroom.app.ui.auth.LoginScreen
import com.studyroom.app.ui.auth.RegisterScreen
import com.studyroom.app.ui.mybookings.MyBookingsScreen
import com.studyroom.app.ui.rooms.RoomDetailScreen
import com.studyroom.app.ui.rooms.RoomsScreen

/**
 * Connects the 5 screens of the app.
 *
 * Flow: Login <-> Register -> Rooms -> Room Detail, and Rooms -> My Bookings.
 */
@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Routes.LOGIN,
        modifier = modifier
    ) {
        composable(Routes.LOGIN) {
            LoginScreen(
                onLoginClick = { navController.navigateToRooms() },
                onCreateAccountClick = {
                    navController.navigate(Routes.REGISTER) { launchSingleTop = true }
                }
            )
        }

        composable(Routes.REGISTER) {
            RegisterScreen(
                onRegisterClick = { navController.navigateToRooms() },
                onBackToLoginClick = { navController.popBackStack() }
            )
        }

        composable(Routes.ROOMS) {
            RoomsScreen(
                onRoomClick = {
                    navController.navigate(Routes.ROOM_DETAIL) { launchSingleTop = true }
                },
                onMyBookingsClick = {
                    navController.navigate(Routes.MY_BOOKINGS) { launchSingleTop = true }
                },
                onLogoutClick = {
                    navController.navigate(Routes.LOGIN) {
                        // Remove Rooms from the back stack, so Back on Login closes the app.
                        popUpTo(Routes.ROOMS) { inclusive = true }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable(Routes.ROOM_DETAIL) {
            RoomDetailScreen(onBackClick = { navController.popBackStack() })
        }

        composable(Routes.MY_BOOKINGS) {
            MyBookingsScreen(onBackClick = { navController.popBackStack() })
        }
    }
}

/**
 * Opens Rooms and removes Login and Register from the back stack,
 * so pressing Back on Rooms closes the app instead of returning to Login.
 */
private fun NavHostController.navigateToRooms() {
    navigate(Routes.ROOMS) {
        popUpTo(Routes.LOGIN) { inclusive = true }
        launchSingleTop = true
    }
}
