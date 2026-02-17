package com.example.qha_pmdm_2t

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.qha_pmdm_2t.presentation.viewmodel.ProductosViewModel
import com.example.qha_pmdm_2t.ui.screens.ProductosScreen
import com.example.qha_pmdm_2t.ui.theme.QHA_PMDM_2TTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QHA_PMDM_2TTheme {
                Surface {
                    val vm: ProductosViewModel = viewModel()
                    ProductosScreen(vm)
                }
            }
        }
    }
}
