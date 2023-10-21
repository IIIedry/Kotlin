package com.example.homework2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1C3535))
            .padding(20.dp),
    ) {
        Column (
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp, 150.dp)
                    .padding(top = 5.dp)
            )
            Text(
                text = fullName,
                fontSize = 50.sp,
                fontWeight = FontWeight.Light,
                color = Color.White,
                modifier = Modifier.padding(top = 5.dp)
            )
            Text(
                text = title,
                fontSize = 16.sp,
                color = Color(0xFF3ddc84),
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
                icon = Icons. Default. Share,
                contact = "@AndroidDev"
            )
            Template(
                icon = Icons. Default. Email,
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
            tint = Color(0xFF3ddc84),
            modifier = Modifier.padding(start = 10.dp, end = 20.dp)
        )
        Text(
            text = contact,
            color = Color.White
        )
    }
}