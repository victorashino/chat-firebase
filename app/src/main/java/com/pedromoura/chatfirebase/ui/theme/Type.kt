package com.pedromoura.chatfirebase.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pedromoura.chatfirebase.R

val syne = FontFamily(
    Font(R.font.syne_semibold, FontWeight.SemiBold)
)

val urbanist = FontFamily(
    Font(R.font.urbanist_medium, FontWeight.Medium),
    Font(R.font.urbanist_semibold, FontWeight.SemiBold)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = syne,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    titleLarge = TextStyle(
        fontFamily = urbanist,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp
    )
)