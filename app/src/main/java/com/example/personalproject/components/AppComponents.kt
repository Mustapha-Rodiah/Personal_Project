package com.example.personalproject.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.personalproject.R
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun  NormalText(value: String){
    Text(text = value, modifier = Modifier
        .fillMaxWidth()
        .heightIn(min = 40.dp), style = TextStyle(
        fontSize = 24.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Normal
    ),
        textAlign = TextAlign.Center)
}
@Composable
fun HeadingNormalText(value: String){
    Text(text = value, modifier = Modifier.fillMaxWidth(), style = TextStyle(
        fontSize = 30.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold
    ),
        textAlign = TextAlign.Center)
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedText(labelString:String){

    var textValue by remember { mutableStateOf("") }
  OutlinedTextField( label = { Text(text = labelString) },
      modifier = Modifier.fillMaxWidth(),
          colors = TextFieldDefaults.outlinedTextFieldColors(
              focusedBorderColor = colorResource(id = R.color.black),
              focusedLabelColor = colorResource(id = R.color.black),
              cursorColor = colorResource(id = R.color.black)
          ),
      keyboardOptions = KeyboardOptions.Default,
      value = textValue, onValueChange = {textValue = it})
}