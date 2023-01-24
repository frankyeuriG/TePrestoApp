package edu.ucne.teprestoapp.ui.ocupacion

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun OcupacionScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Ocupacion(Modifier.align(Alignment.Center))
    }
}
@Composable
fun Ocupacion(modifier: Modifier) {
    Column(modifier = modifier) {
        HeaderTitle(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(16.dp))
        DescripcionFild()
        Spacer(modifier = Modifier.padding(4.dp))
        SalarioFild()
        Spacer(modifier = Modifier.padding(16.dp))
        GuardarButton()
    }
}
@Composable
fun GuardarButton() {
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2196F3))
    ) {
        Icon(imageVector= Icons.Default.AddCircle,contentDescription="Guardar" )
        Text(text = "Guardar")
    }
}
@Composable
fun SalarioFild() {
    TextField(
        value = "", onValueChange = {},
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text(text = "Salario") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFF636262),
            backgroundColor = Color(0xFFDEDDDD),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}
@Composable
fun DescripcionFild() {
    TextField(
        value = "", onValueChange = {},
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text(text = "Descripción") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = false,
        maxLines = 10,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFF2196F3),
            backgroundColor = Color(0xFFDEDDDD),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}
@Composable
fun HeaderTitle(modifier: Modifier) {
    Text(text = "Registro de Ocupaciones", modifier = modifier)
}