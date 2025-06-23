package com.example.tabnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.tabnavigation.Destinations.Business
import com.example.tabnavigation.Destinations.Other
import com.example.tabnavigation.Destinations.Politics
import com.example.tabnavigation.Destinations.Sport
import com.example.tabnavigation.Destinations.TopStories
import com.example.tabnavigation.Destinations.UKNews
import com.example.tabnavigation.Destinations.WorldNews
import com.example.tabnavigation.ui.theme.TabNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TabNavigationTheme {
                MainApp()
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MainApp() {
        val navController = rememberNavController()
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        val tabNagigationItems = listOf(
            TabNavigation.TopStories,
            TabNavigation.UKNews,
            TabNavigation.Politics,
            TabNavigation.WorldNews,
            TabNavigation.Business,
            TabNavigation.Sport,
            TabNavigation.Other
        )

        val tabIndex = tabNagigationItems.indexOfFirst { navBackStackEntry?.destination?.hasRoute(it.route::class) == true }.takeIf { it >= 0 } ?: 0

        Scaffold(
            topBar = {
                Column {
                    CenterAlignedTopAppBar(title = { Text(stringResource(R.string.app_name)) })
                    ScrollableTabRow(selectedTabIndex = tabIndex) {
                        tabNagigationItems.forEach { item ->

                            val selected = navBackStackEntry?.destination?.hasRoute(item.route::class) == true

                            Tab(
                                selected = selected,
                                text = { Text(item.label) },
                                onClick = {
                                    if (!selected) {
                                        navController.navigate(item.route) {
                                            popUpTo(navController.graph.startDestinationId)
                                            launchSingleTop = true
                                        }
                                    }
                                }
                            )
                        }
                    }
                }
            }
        ) { paddingValues ->
            NavHost(
                navController = navController,
                startDestination = TopStories,
                modifier = Modifier.padding(paddingValues)
            ) {
                composable<TopStories> { ContentScreen(TopStories.label) }
                composable<UKNews> { ContentScreen(UKNews.label) }
                composable<Politics> { ContentScreen(Politics.label) }
                composable<Business> { ContentScreen(Business.label) }
                composable<WorldNews> { ContentScreen(WorldNews.label) }
                composable<Sport> { ContentScreen(Sport.label) }
                composable<Other> { ContentScreen(Other.label) }
            }
        }
    }
}
