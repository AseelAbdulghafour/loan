package com.aseel.islamicloanform.viewmodel

import android.icu.util.CurrencyAmount
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoanViewModel : ViewModel() {
    //states
    var monthlyInstallment by mutableStateOf(0.0)
    var loanAmount by mutableStateOf(0.0)
    var loanPeriod by mutableStateOf(0)
    var salary by mutableStateOf(0.0)
    //loan calculation
    fun calculateInstallment(loanAmount: Double?, loanPeriod: Int?, salary: Double?){

        if ((loanAmount == null) || (loanPeriod == null) || (salary == null) || ( loanPeriod==0 )){
            monthlyInstallment = 0.0
            return
        }

        val calculatededInstallment = loanAmount / loanPeriod

        val maxInstallment = 0.4 * salary
        if (calculatededInstallment <= maxInstallment){
            monthlyInstallment = calculatededInstallment
            // calculate new loan period based on max installment
            val newLoanPeriod = loanAmount / maxInstallment
        }
    }
}