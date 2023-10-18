package com.example.kartunama

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BusinessCard() {
    val name by remember { mutableStateOf("SULKIFLI") }
    val jobTitle by remember { mutableStateOf("Android Developer Extraordinaire") }
    var contactInfo by remember { mutableStateOf("Email : sulkifli2795@gmail.com") }
    val phoneNumber by remember { mutableStateOf("No.hp : +62 856-4017-0092") }
    val socialMedia by remember { mutableStateOf("link G.dev : @g.dev/sulkifli") } // Change "address" to "socialMedia"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
            .clip(MaterialTheme.shapes.medium)
            .shadow(8.dp, shape = MaterialTheme.shapes.medium)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .wrapContentHeight()
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(120.dp)
                    .clip(shape = MaterialTheme.shapes.medium)
                    .background(MaterialTheme.colorScheme.primary)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = name,
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = jobTitle,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.secondary,

            )
        }

        Spacer(modifier = Modifier.height(16.dp))


        Column(
            modifier = Modifier
                .weight(1f)
                .wrapContentHeight()
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = phoneNumber,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.secondary,
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = socialMedia,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.secondary,
            )

            Spacer(modifier = Modifier.height(16.dp))

            BasicTextField(
                value = contactInfo,
                onValueChange = { contactInfo = it },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
                keyboardActions = KeyboardActions(
                    onDone = { /* Handle keyboard done action if needed */ }
                ),
                textStyle = TextStyle(fontSize = 16.sp),
                modifier = Modifier
            )
        }
    }
}




@Composable
fun BusinessCardApp() {
    BusinessCard()
}

@Preview
@Composable
fun BusinessCardPreview() {
    BusinessCardApp()
}
