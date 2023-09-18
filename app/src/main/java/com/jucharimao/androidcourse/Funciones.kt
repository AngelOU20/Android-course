package com.jucharimao.androidcourse

fun main() {
    variablesNumericas()

    showMyAge(23)

    add(29, 30)

    var myMultiplication: Float = multiplication(10.2f, 20.1f)
    println(myMultiplication)

    println(subtract(56, 42))
}

/**
 * Función sin parámetros y sin valor de retorno (Unit)
 */
fun variablesNumericas() {
    // Int -2,147,483,648 to 2,147,483,647
    var age1: Int = 26
    println(age1)

    // Long -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    val longExample: Long = 300L
    println(longExample)

    // Float
    val floatExample: Float = 30.5f
    println(floatExample)

    // Double
    val doubleExample: Double = 30.5324444
    println(doubleExample)
}

fun variablesAlfanumericas() {
    // Char
    val charExample: Char = 'u'
    println(charExample)

    // String
    val stringExample: String = "curso de Android"
    println(stringExample)
}

/**
 * Función con párametros de entrada
 */
fun showMyAge(currentAge: Int) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

/**
 * Función con parámetros y con valor de retorno
 */

fun multiplication(a: Float, b: Float): Float {
    var multiplicacion: Float = a * b
    return multiplicacion
}

fun subtract(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber
