package com.tamnd.suzume

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.tamnd.suzume.ui.theme.SuzumeTheme
import dagger.hilt.android.AndroidEntryPoint
import com.tamnd.suzume.navigation.SuzumeApp as SuzumeAppRoot

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            SuzumeTheme {
                SuzumeAppRoot()
            }
        }
    }
}
