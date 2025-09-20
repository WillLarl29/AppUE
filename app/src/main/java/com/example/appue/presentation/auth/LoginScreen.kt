package com.example.appue.presentation.auth

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(){
    var email by remember { mutableStateOf("") }
    var password by remember {mutableStateOf("")}

    Column(
        modifier = Modifier.padding(16.dp)
    ){
        Text("Iniciar Sesión", style = MaterialTheme.typography.titleLarge)

        //Text("Correo Electrónico")
        //TextField(value=email, onValueChange = {email = it})
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = {Text("Correo Electrónico")},
            placeholder = {Text("Correo Electrónico")},
            modifier = Modifier.fillMaxWidth()
        )


        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = {Text("Contraseña")},
            placeholder = {Text("Contraseña")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            /*TODO*/
        }, modifier = Modifier.fillMaxWidth()
        ) {
            Text("Iniciar Seción")
        }
    }
}