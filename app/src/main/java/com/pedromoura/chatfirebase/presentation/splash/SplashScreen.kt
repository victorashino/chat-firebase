package com.pedromoura.chatfirebase.presentation.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.pedromoura.chatfirebase.R
import com.pedromoura.chatfirebase.presentation.navigation.Screen
import com.pedromoura.chatfirebase.ui.theme.syne
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF7B539D)),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            fontFamily = syne,
            fontWeight = FontWeight.SemiBold,
            fontSize = 36.sp,
            textAlign = TextAlign.Center,
            color = Color.White
        )
    }

    LaunchedEffect(Unit) {
        delay(1500)
        navController.navigate(Screen.Login.route)
    }
}
