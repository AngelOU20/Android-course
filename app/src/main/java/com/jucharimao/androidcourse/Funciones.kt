package com.jucharimao.androidcourse

fun main() {
    variablesNumericas()
//    sumaVariables(10, 20)
    println(sumaVariables(15, 20))
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

/**
 * Función con parámetros y con valor de retorno
 */
fun sumaVariables(a:Int, b:Int): Int {
    var suma:Int= a + b
    return suma
}