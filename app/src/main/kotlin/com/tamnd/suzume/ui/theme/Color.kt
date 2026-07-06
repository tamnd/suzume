package com.tamnd.suzume.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Sparrow-brown brand palette, seeded from #6D4C36 through the Material 3 tonal algorithm.
// These are the fallback scheme used below Android 12 and when the user turns dynamic color off.

val SparrowLightColorScheme =
    lightColorScheme(
        primary = Color(0xFF6D4C36),
        onPrimary = Color(0xFFFFFFFF),
        primaryContainer = Color(0xFFF6DEC8),
        onPrimaryContainer = Color(0xFF543F2C),
        secondary = Color(0xFF665D4E),
        onSecondary = Color(0xFFFFFFFF),
        secondaryContainer = Color(0xFFEEE1CF),
        onSecondaryContainer = Color(0xFF4E4535),
        tertiary = Color(0xFF5B6146),
        onTertiary = Color(0xFFFFFFFF),
        tertiaryContainer = Color(0xFFDFE6BE),
        onTertiaryContainer = Color(0xFF43492D),
        error = Color(0xFFBA1A1A),
        onError = Color(0xFFFFFFFF),
        background = Color(0xFFFFF8F4),
        onBackground = Color(0xFF1F1B16),
        surface = Color(0xFFFFF8F4),
        onSurface = Color(0xFF1F1B16),
        surfaceVariant = Color(0xFFF0E0D0),
        onSurfaceVariant = Color(0xFF4F4539),
        outline = Color(0xFF817567),
    )

val SparrowDarkColorScheme =
    darkColorScheme(
        primary = Color(0xFFDCC1A9),
        onPrimary = Color(0xFF3C2C1E),
        primaryContainer = Color(0xFF554233),
        onPrimaryContainer = Color(0xFFF6DEC8),
        secondary = Color(0xFFD1C5B4),
        onSecondary = Color(0xFF372F23),
        secondaryContainer = Color(0xFF4E4535),
        onSecondaryContainer = Color(0xFFEEE1CF),
        tertiary = Color(0xFFC3CBA4),
        onTertiary = Color(0xFF2D3318),
        tertiaryContainer = Color(0xFF43492D),
        onTertiaryContainer = Color(0xFFDFE6BE),
        error = Color(0xFFFFB4AB),
        onError = Color(0xFF690005),
        background = Color(0xFF17130E),
        onBackground = Color(0xFFEAE1D9),
        surface = Color(0xFF17130E),
        onSurface = Color(0xFFEAE1D9),
        surfaceVariant = Color(0xFF4F4539),
        onSurfaceVariant = Color(0xFFD3C4B4),
        outline = Color(0xFF9C8D7F),
    )
