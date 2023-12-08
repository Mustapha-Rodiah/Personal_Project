package com.example.personalproject.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.personalproject.components.NormalText
import com.example.personalproject.R
import com.example.personalproject.components.HeadingNormalText
import com.example.personalproject.components.OutlinedText

@Composable
fun SignUpScreen() {
   Surface(modifier = Modifier
       .background(Color.White)
       .padding(28.dp)
       .fillMaxSize(), color = Color.White) {
       Column (){
           NormalText(value = stringResource(id = R.string.hello))
           HeadingNormalText(value = stringResource(id = R.string.create))
           Spacer(modifier = Modifier.height(30.dp))
OutlinedText(labelString = stringResource(id = R.string.labelString))
       }


   }
}
@Preview
@Composable
fun SignUpScreenPreview(){
    SignUpScreen()
}