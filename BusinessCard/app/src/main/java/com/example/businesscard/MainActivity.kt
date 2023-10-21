package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF3ddc84)
                ) {
                    Date()
                }
            }
        }
    }
}

@Composable
fun Date(){
    BusinessCard(
        image = painterResource(R.drawable.android_logo),
        fullName = stringResource(R.string.jennifer_doe),
        title = stringResource(R.string.android_developer_extraordinaire)
    )
}


@Composable
fun BusinessCard(
    image: Painter,
    fullName: String,
    title: String,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF9BC9AF))
            .padding(20.dp),
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(150.dp)
            ) {
                // Add the square background behind the image
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF1C3535))
                )
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                )
            }
            Text(
                text = fullName,
                fontSize = 52.sp,
                fontWeight = FontWeight.Light,
                color = Color.Black,
                modifier = Modifier.padding(top = 5.dp)
            )
            Text(
                text = title,
                fontSize = 20.sp,
                color = Color(0xFF088B44),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 5.dp)
            )
        }

        Column(
            modifier = Modifier
                .weight(0.3f)
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Template(
                icon = Icons.Default.Phone,
                contact = "+11 (123) 444 555 666"
            )
            Template(
                icon = Icons.Default.Share,
                contact = "@AndroidDev"
            )
            Template(
                icon = Icons.Default.Email,
                contact = "jen.doe@android.com"
            )
        }
    }
}


@Composable
fun Template(
    icon: ImageVector,
    contact: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.padding(start = 10.dp, end = 20.dp)
        )
        Text(
            text = contact,
            color = Color.White
        )
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Date()
    }
}