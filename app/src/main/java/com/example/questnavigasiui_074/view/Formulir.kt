package com.example.questnavigasiui_074.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormIsian(
    jenisK:List<String> = list0f("Laki-laki","Perempuan"),
    onSubmitBtnClick : () -> Unit
){
    Scaffold (modifier = Modifier,
         {
            TopAppBar(
            )
        }
    )
}