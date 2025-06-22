package com.example.tabnavigation

import android.net.http.SslCertificate.restoreState
import android.net.http.SslCertificate.saveState
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.tabnavigation.Route.Business
import com.example.tabnavigation.Route.Other
import com.example.tabnavigation.Route.Politics
import com.example.tabnavigation.Route.Sport
import com.example.tabnavigation.Route.TopStories
import com.example.tabnavigation.Route.UKNews
import com.example.tabnavigation.Route.WorldNews
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
        val currentDestination = navBackStackEntry?.destination

        val routes = listOf(TopStories, UKNews, Politics, Business, WorldNews, Sport, Other)

        val tabIndex = routes.indexOfFirst { currentDestination?.hasRoute(it::class) == true }.takeIf { it >= 0 } ?: 0

        Scaffold(
            topBar = {
                Column {
                    CenterAlignedTopAppBar(title = { Text(stringResource(R.string.app_name)) })
                    ScrollableTabRow(selectedTabIndex = tabIndex) {
                        routes.forEachIndexed { index, item ->
                            Tab(
                                selected = index == tabIndex,
                                text = { Text(item.label) },
                                onClick = {
                                    if (index != tabIndex) {
                                        navController.navigate(item) {
                                            launchSingleTop = true
                                            restoreState = true
                                            popUpTo(TopStories) {
                                                saveState = false
                                                inclusive = false
                                            }
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
