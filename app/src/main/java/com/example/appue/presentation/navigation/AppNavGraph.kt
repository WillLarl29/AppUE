package com.example.appue.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.appue.presentation.auth.LoginScreen
import com.example.appue.presentation.auth.RegisterScreen
import com.example.appue.presentation.home.HomeScreen

@Composable
fun AppNavGraph(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "register"){
        composable("register") { RegisterScreen(navController) }

        composable(
            "login/{email}/{password}",
            arguments = listOf(
                navArgument("email") { type = NavType.StringType },
                navArgument("password") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            LoginScreen(navController, backStackEntry)
        }

        composable("home") { HomeScreen(navController) }
    }
}