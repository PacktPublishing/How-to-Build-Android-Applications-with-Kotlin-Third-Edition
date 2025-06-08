package com.example.navigationdrawer

import android.R.attr.text
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.navigationdrawer.Route.Bin
import com.example.navigationdrawer.Route.Calendar
import com.example.navigationdrawer.Route.Favorites
import com.example.navigationdrawer.Route.Home
import com.example.navigationdrawer.Route.Shopping
import com.example.navigationdrawer.ui.theme.NavigationDrawerTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun ContentScreen(name: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(name, fontSize = 28.sp)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    val currentScreenTitle = remember { mutableStateOf("") }

    ModalNavigationDrawer(
        drawerState = drawerState,
        modifier = Modifier.fillMaxSize(),
        drawerContent = {
            DrawerContent(navController, drawerState, scope)
        },
        content = {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = {
                    CenterAlignedTopAppBar(
                        title = {  Text(text = stringResource(R.string.app_name)) },
                        navigationIcon = {
                            IconButton(
                                onClick = {
                                    scope.launch {
                                        if (drawerState.isClosed) drawerState.open() else drawerState.close()
                                    }
                                }
                            ) {
                                Icon(Icons.Default.Menu, contentDescription = "Menu")
                            }
                        }
                    )
                },
            ) { paddingValues ->

                NavHost(
                    navController = navController,
                    startDestination = Home,
                    modifier = Modifier.padding(paddingValues)
                ) {
                    composable<Home> { navBackStackEntry ->
                        val route = navBackStackEntry.toRoute<Home>()
                        ContentScreen(route.name)
                    }
                    composable<Shopping> { navBackStackEntry ->
                        val route = navBackStackEntry.toRoute<Shopping>()
                        ContentScreen(route.name)
                    }
                    composable<Favorites> { navBackStackEntry ->
                        val route = navBackStackEntry.toRoute<Favorites>()
                        ContentScreen(route.name)
                    }
                    composable<Calendar> { navBackStackEntry ->
                        val route = navBackStackEntry.toRoute<Calendar>()
                        ContentScreen(route.name)
                    }
                    composable<Bin> { navBackStackEntry ->
                        val route = navBackStackEntry.toRoute<Bin>()
                        ContentScreen(route.name)
                    }
                }
            }
        }
    )
}

@Composable
fun DrawerContent(
    navController: NavHostController,
    drawerState: DrawerState,
    scope: CoroutineScope
) {
    Column(
        modifier = Modifier
            .statusBarsPadding()
            .background(Color.White)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Image(
                modifier = Modifier.width(220.dp),
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Logo",
            )
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Logo",
                modifier = Modifier
                    .padding(16.dp)
            )
        }
        NavDrawerItem(
            scope,
            navController,
            Home,
            drawerState
        )
        NavDrawerItem(
            scope,
            navController,
            Shopping,
            drawerState
        )
        NavDrawerItem(
            scope,
            navController,
            Favorites,
            drawerState
        )
        NavDrawerItem(
            scope,
            navController,
            Calendar,
            drawerState
        )
        NavDrawerItem(
            scope,
            navController,
            Bin,
            drawerState
        )
    }
}

@Composable
private fun NavDrawerItem(
    scope: CoroutineScope,
    navController: NavHostController,
    route: Route,
    drawerState: DrawerState
) {

    val currentRoute = getCurrentRoute(navController)

    Box(
        Modifier
            .background(if (currentRoute == route.name) Color.LightGray else Color.White)
            .width(220.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    scope.launch {
                        navController.navigate(route) {
                            launchSingleTop = true
                            restoreState = true
                        }
                        drawerState.close()
                    }
                }

        ) {
            Icon(
                imageVector = route.icon,
                contentDescription = route.name,
                modifier = Modifier.padding(start = 16.dp, top = 12.dp, bottom = 12.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = route.name,
                modifier = Modifier.padding(end = 16.dp)
            )
        }
    }
}

@Composable
fun getCurrentRoute(navController: NavHostController): String? {
    val navBackStackEntry = navController.currentBackStackEntryAsState().value
    return navBackStackEntry?.destination?.route
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    NavigationDrawerTheme {
        MainScreen()
    }
}
