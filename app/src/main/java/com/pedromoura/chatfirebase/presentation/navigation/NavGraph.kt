package com.pedromoura.chatfirebase.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bicutoru.autentication.login.LoginScreen
import com.bicutoru.autentication.login.LoginViewModel
import com.google.firebase.FirebaseApp
import com.google.firebase.database.FirebaseDatabase
import com.pedromoura.chatfirebase.presentation.chat.ChatScreen
import com.pedromoura.chatfirebase.presentation.chat.ChatViewModel
import com.pedromoura.chatfirebase.presentation.splash.SplashScreen

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object Chat : Screen("chat")
}

@Composable
fun NavGraph(startDestination: String = Screen.Splash.route) {

    FirebaseApp.initializeApp(LocalContext.current)
    val database = FirebaseDatabase.getInstance()

    val navController = rememberNavController()
    val loginViewModel = LoginViewModel(LocalContext.current)
    val chatViewModel = ChatViewModel(database, LocalContext.current)

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.Splash.route) { SplashScreen(navController) }
        composable(Screen.Login.route) { LoginScreen(loginViewModel = loginViewModel, navController = navController) }
        composable(Screen.Chat.route) { ChatScreen(chatViewModel) }
    }
}