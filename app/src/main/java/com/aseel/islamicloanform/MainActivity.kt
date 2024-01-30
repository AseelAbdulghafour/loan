package com.aseel.islamicloanform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aseel.islamicloanform.composables.IslamicLoanForm
import com.aseel.islamicloanform.ui.theme.IslamicloanformTheme
import com.aseel.islamicloanform.viewmodel.LoanViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IslamicloanformTheme {


                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),

                    ) {
                    IslamicLoanForm()
                }


            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IslamicloanformTheme {
        IslamicLoanForm()
    }
}