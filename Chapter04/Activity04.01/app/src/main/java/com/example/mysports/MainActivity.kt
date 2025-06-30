package com.example.mysports

import android.R.attr.label
import android.R.attr.onClick
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.bottomnavigation.ContentScreen
import com.example.bottomnavigation.SportsScreen
import com.example.mysports.AppRoute.CalendarAppRoute
import com.example.mysports.AppRoute.HomeAppRoute
import com.example.mysports.AppRoute.MySportItemAppRoute
import com.example.mysports.ui.theme.MySportsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySportsTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("My Sports") },
                modifier = Modifier.statusBarsPadding(),
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceContainer
                )
            )
        },
        bottomBar = { BottomNavigationBar(navController) }
    ) { paddingValues ->
        NavigationHost(navController, modifier = Modifier.padding(paddingValues))
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {

    val items = listOf(
        AppBottomNavigation.Home,
        AppBottomNavigation.Calendar,
        AppBottomNavigation.Profile,
        AppBottomNavigation.MySports,
    )

    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry.value?.destination

    NavigationBar(
        containerColor = Color.White,
        contentColor = Color.Black
    ) {
        items.forEach { item ->

            val isSelected = currentDestination?.hasRoute(item.route::class) == true

            NavigationBarItem(
                selected = isSelected,
                icon = {
                        Icon(
                            imageVector = if (isSelected) item.selectedIcon else item.unselectedIcon,
                            contentDescription = item.label
                        )
                },
                label = { Text(item.label) },
                onClick = { navController.navigate(item.route) }
            )
        }
    }
}

@Composable
fun NavigationHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = HomeAppRoute,
        modifier = modifier
    ) {
        composable<HomeAppRoute> {
            ContentScreen("Home")
        }
        composable<AppRoute.ProfileAppRoute> {
            ContentScreen("Calendar")
        }
        composable<CalendarAppRoute> {
            ContentScreen("Profile")
        }
        composable<AppRoute.MySportsAppRoute> {
            SportsScreen(navController)
        }
        composable<AppRoute.MySportItemAppRoute> {
            navBackStackEntry ->
            val appRoute = navBackStackEntry.toRoute<MySportItemAppRoute>()
            ContentScreen(appRoute.label)
        }
    }
}
