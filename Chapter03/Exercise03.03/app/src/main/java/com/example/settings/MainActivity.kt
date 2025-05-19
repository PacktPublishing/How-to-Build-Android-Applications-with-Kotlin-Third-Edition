package com.example.settings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.settings.ui.theme.HeaderTextStyle
import com.example.settings.ui.theme.SettingsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SettingsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SettingsContainer(
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun SettingsContainer(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =
            Alignment.CenterHorizontally,
        modifier = modifier
    ) {

        // Header
        SettingsHeader()

        SettingsImage()

        SettingsCheckbox()

        SettingsSwitch()

        SettingsSlider()

        SettingsAlertDialog()

    }
}

@Composable
fun SettingsHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(
                id = R.string.app_name),
            style = HeaderTextStyle,
            modifier = Modifier.padding(end = 10.dp)
        )
        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = stringResource(
                id = R.string.settings_icon_description
            ),
        )
    }
}

@Composable
fun SettingsImage() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement =
            Arrangement.SpaceBetween
    ) {
        Text(
            text = stringResource(
                id = R.string.settings_profile_image),
            fontSize = 18.sp,
        )
        Image(
            modifier = Modifier.padding(
                end = 10.dp).height(34.dp)
                .clickable {
                    /* Handle changing the profile image */
                },
            painter = painterResource(
                id = R.drawable.sunflower),
            contentDescription = stringResource(
                id = R.string.settings_profile_image),

            )
    }
}

@Composable
fun SettingsCheckbox() {
    var isChecked by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement =
            Arrangement.SpaceBetween
    ) {
        Text(
            text = stringResource(
                id = R.string.settings_consent),
            fontSize = 18.sp,
        )
        Checkbox(
            checked = isChecked,
            onCheckedChange = { isChecked = it },
        )
    }
}

@Composable
fun SettingsSwitch() {
    var isChecked by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement =
            Arrangement.SpaceBetween
    ) {
        Text(
            text = stringResource(
                id = R.string.settings_mobile_data),
            fontSize = 18.sp,
        )
        Switch(
            modifier = Modifier.padding(end = 10.dp),
            checked = isChecked,
            onCheckedChange = { isChecked = it },
        )
    }
}

@Composable
fun SettingsSlider() {
    var sliderValue by remember { mutableStateOf(0f) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement =
            Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier.padding(end = 16.dp),
            text = stringResource(
                id = R.string.settings_text_size),
            fontSize = 18.sp,
        )
        Slider(
            value = sliderValue,
            onValueChange = { sliderValue = it },
            steps = 2
        )
    }
}

@Composable
fun SettingsAlertDialog() {
    var showDialog by remember { mutableStateOf(false) }

    Button(onClick = { showDialog = true }) {
        Text(text = stringResource(
            id = R.string.sign_out))
    }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            title = { Text(text = stringResource(
                id = R.string.alert_title)) },
            text = { Text(text = stringResource(
                id = R.string.alert_message)) },
            confirmButton = {
                Button(onClick = { showDialog = false }) {
                    Text(text = stringResource(
                        id = R.string.ok))
                }
            },
            dismissButton = {
                Button(onClick = { showDialog = false }) {
                    Text(text = stringResource(
                        id = R.string.cancel))
                }
            }
        )
    }
}





@Preview
@Composable
fun SettingsContainerPreview() {
    SettingsContainer()
}

