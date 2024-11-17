package com.example.calculator.viewModel

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation("+")
    object Divide: CalculatorOperation("/")
    object Multiply: CalculatorOperation("x")
    object Subtract: CalculatorOperation("-")
}