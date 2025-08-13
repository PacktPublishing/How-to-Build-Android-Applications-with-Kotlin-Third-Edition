package com.example.tabnavigation

import android.os.Bundle
<<<<<<< HEAD
=======
import android.util.MutableInt
>>>>>>> main
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
<<<<<<< HEAD
=======
import androidx.compose.foundation.pager.PagerState
>>>>>>> main
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.PrimaryScrollableTabRow
import androidx.compose.material3.Scaffold
<<<<<<< HEAD
=======
import androidx.compose.material3.ScrollableTabRow
>>>>>>> main
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
<<<<<<< HEAD
=======
import androidx.compose.runtime.remember
>>>>>>> main
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
import com.example.tabnavigation.Destination.Business
import com.example.tabnavigation.Destination.Other
import com.example.tabnavigation.Destination.Politics
import com.example.tabnavigation.Destination.Sport
import com.example.tabnavigation.Destination.TopStories
import com.example.tabnavigation.Destination.UKNews
import com.example.tabnavigation.Destination.WorldNews
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
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val tabNavigationItems = listOf(
        TabNavigation.TopStories,
        TabNavigation.UKNews,
        TabNavigation.Politics,
        TabNavigation.Business,
        TabNavigation.WorldNews,
        TabNavigation.Sport,
        TabNavigation.Other
    )

    var tabIndex by rememberSaveable { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            Column {
                CenterAlignedTopAppBar(
                    title = { Text(stringResource(R.string.app_name)) },
                    modifier = Modifier.statusBarsPadding(),
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.surfaceContainer
                    )
                )

                PrimaryScrollableTabRow(selectedTabIndex = tabIndex, edgePadding = 0.dp) {
                    tabNavigationItems.forEachIndexed { index, item ->

                        val isSelected  = currentDestination?.hasRoute(item.route::class) == true
                        if (isSelected) tabIndex = index

                        Tab(
                            selected = isSelected,
                            text = { Text(item.label) },
                            onClick = {
                                if (!isSelected ) {
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
<<<<<<< HEAD
=======





>>>>>>> main
