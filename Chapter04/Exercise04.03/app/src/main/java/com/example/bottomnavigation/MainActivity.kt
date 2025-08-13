package com.example.bottomnavigation

<<<<<<< HEAD
=======
import android.net.http.SslCertificate.restoreState
import android.net.http.SslCertificate.saveState
>>>>>>> main
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
<<<<<<< HEAD
=======
import androidx.compose.ui.graphics.Color
>>>>>>> main
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavigation.Destination.Bin
import com.example.bottomnavigation.Destination.Calendar
import com.example.bottomnavigation.Destination.Favorites
import com.example.bottomnavigation.Destination.Home
import com.example.bottomnavigation.Destination.Shopping
import com.example.bottomnavigation.ui.theme.BottomNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BottomNavigationTheme {
                MainApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp() {
    val navController: NavHostController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val bottomNavigationItems = listOf(
        BottomNavigation.Home,
        BottomNavigation.Shopping,
        BottomNavigation.Favorites,
        BottomNavigation.Calendar,
        BottomNavigation.Bin
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(stringResource(R.string.app_name)) },
                modifier = Modifier.statusBarsPadding(),
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceContainer
                )
            )
        },
        bottomBar = {

            NavigationBar {
                bottomNavigationItems.forEach { item ->
<<<<<<< HEAD
                    val isSelected =
                        currentDestination?.hasRoute(item.route::class) == true
                    NavigationBarItem(
                        selected = isSelected,
=======

                    val isSelected = currentDestination?.hasRoute(item.route::class) == true

                    NavigationBarItem(
                        selected = isSelected ,
>>>>>>> main
                        icon = {
                            BadgedBox(
                                badge = {
                                    if (item.badgeCount > 0) {
<<<<<<< HEAD
                                        Badge { Text(item.badgeCount.toString())
                                        }
=======
                                        Badge { Text(item.badgeCount.toString()) }
>>>>>>> main
                                    }
                                }
                            ) {
                                Icon(
<<<<<<< HEAD
                                    imageVector = if (isSelected)
                                        item.selectedIcon else item.
                                    unselectedIcon,
=======
                                    imageVector = if (isSelected ) item.selectedIcon else item.unselectedIcon,
>>>>>>> main
                                    contentDescription = item.label
                                )
                            }
                        },
                        label = { Text(item.label) },
                        onClick = {
<<<<<<< HEAD
                            if (!isSelected) {
                                navController.navigate(item.route) {
                                    launchSingleTop = true
                                    restoreState = true
                                    popUpTo(navController.graph.
                                    startDestinationId) {
                                        saveState = true
                                    }
=======
                            if (!isSelected ) {
                                navController.navigate(item.route) {
                                    launchSingleTop = true
                                    popUpTo(navController.graph.startDestinationId)
>>>>>>> main
                                }
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            modifier = Modifier.padding(innerPadding),
            startDestination = Home
        ) {
            composable<Home> { ContentScreen(Home.label) }
            composable<Shopping> { ContentScreen(Shopping.label) }
            composable<Favorites> { ContentScreen(Favorites.label) }
            composable<Calendar> { ContentScreen(Calendar.label) }
            composable<Bin> { ContentScreen( Bin.label) }
        }
    }
}

