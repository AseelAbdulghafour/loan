package com.aseel.islamicloanform.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.lifecycle.viewmodel.compose.viewModel
import com.aseel.islamicloanform.viewmodel.LoanViewModel

@Composable
fun IslamicLoanForm(
    modifier: Modifier = Modifier,
    viewModel: LoanViewModel = viewModel()) {


    Column {
        OutlinedTextField(value = viewModel.loanAmount.toString(), onValueChange ={ viewModel.loanAmount = it.toDouble()},
            label = { Text("Loan Amount")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

        OutlinedTextField(value = viewModel.loanPeriod.toString(), onValueChange ={ viewModel.loanPeriod = it.toInt()},
            label = { Text("Loan Period")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

        OutlinedTextField(value = viewModel.salary.toString(), onValueChange ={ viewModel.salary = it.toDouble()},
            label = { Text("Monthly Salary")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

        //calculate result
        Text("Installment: ${viewModel.monthlyInstallment}",
            style = MaterialTheme.typography.bodyMedium
        )

        //calculate button
        Button(
            onClick = {viewModel.calculateInstallment(
                viewModel.loanAmount,
                viewModel.loanPeriod,
                viewModel.salary
            )

            }) {

            Text("Calculate")
        }
    }
}