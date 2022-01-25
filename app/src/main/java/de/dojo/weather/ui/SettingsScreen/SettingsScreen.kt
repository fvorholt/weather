package de.dojo.weather.ui.SettingsScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.statusBarsPadding

@Composable
fun SettingsScreen(
    onApplySettings: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .statusBarsPadding()
            .padding(16.dp)
    ) {
        var headquarterChecked by remember { mutableStateOf(true) }
        var dortmundChecked by remember { mutableStateOf(false) }

        Text(
            text = "Settings",
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    headquarterChecked = true
                    dortmundChecked = false
                }
                .fillMaxWidth()
        ) {
            RadioButton(
                selected = headquarterChecked,
                onClick = {
                    headquarterChecked = true
                    dortmundChecked = false
                },
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "gcx headquarter",
                modifier = Modifier.padding(start = 16.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    dortmundChecked = true
                    headquarterChecked = false
                }
                .fillMaxWidth()
        ) {
            RadioButton(
                selected = dortmundChecked,
                onClick = {
                    dortmundChecked = true
                    headquarterChecked = false
                },
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "gcx dortmund",
                modifier = Modifier.padding(start = 16.dp)
            )
        }

        Button(
            onClick = {
                if (headquarterChecked) {
                    onApplySettings("headquarter")
                } else {
                    onApplySettings("dortmund")
                }

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Apply")
        }
    }
}
