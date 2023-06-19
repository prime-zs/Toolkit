package com.prime.toolkit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.prime.toolkit.ui.theme.ToolkitTheme
import com.primex.core.padding
import com.primex.core.rememberVectorPainter
import com.primex.material2.Label
import com.primex.material2.ListTile
import com.primex.material2.OutlinedButton
import com.primex.material2.Placeholder
import com.primex.material2.Preference
import com.primex.material2.SwitchPreference
import com.primex.material3.IconButton
import com.primex.preferences.Preferences

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val x = Preferences(this)
        setContent {
            ToolkitTheme {
                // A surface container using the 'background' color from the theme
                PLaceholder()


            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Preview
@Composable
fun PLaceholder() {
    Scaffold {
        Surface(modifier = Modifier.padding(it)) {
            ListTile(
                headline = { Text(text = "Headling") },
                subtitle = { Text(text = "This is the subtitle; max lines is 4; this makes it look cool.") },
                leading = {
                    Icon(imageVector = Icons.Outlined.Info, contentDescription = null)
                },
                trailing = {
                    com.primex.material2.IconButton(
                        imageVector = Icons.Outlined.MoreVert,
                        onClick = { /*TODO*/ })
                },
                color = Color.Cyan,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}