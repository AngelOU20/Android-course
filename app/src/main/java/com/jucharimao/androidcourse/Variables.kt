package com.jucharimao.androidcourse



fun main(){

    /**
     * Variables númericas
     */
    // Int -2,147,483,648 to 2,147,483,647
    val age1: Int = 23
    var age2: Int = 26

    println(age2)
    age2 = 21
    println(age2)

    // Long -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    val longExample: Long = 300L

    // Float
    val floatExample: Float = 30.5f

    // Double
    val doubleExample: Double = 30.5324444

    /**
     * Variables alfanúmericas
     */
    // Char
    val charExample1: Char = 'u'
    val charExample2: Char = '@'
    val charExample3 = '1'

    // String
    val stringExample1: String = "Julio Ucharima"
    val stringExample2 = "curso de Android"

    /**
     * Variables booleans
     */
    // Boolean
    val booleanExample1: Boolean = true
    val booleanExample2 = false

    /**
     * Operaciones matemáticas
     */
    // Con los mismo tipos de datos
    // println("Sumar :")
    // println(age1 + age2)

    // println("Restar :")
    // println(age1 - age2)

    // println("Multiplicar :")
    // println(age1 * age2)

    // println("División :")
    // println(age1 / age2)

    // println("Módulo :")
    // println(age1 % age2)

    // Con diferentes tipos de datos
    println(age1 + longExample)
    println(age1 + floatExample)

    var exampleSuma1: Float = age1 + floatExample
    println(exampleSuma1)

    var exampleSuma2: Int = age1 + floatExample.toInt()
    println(exampleSuma2)

    /**
     * Concatenación
     */
    // Con String
    println(stringExample1 + stringExample2)

    val stringExample3 = "2"
    val stringExample4 = "24"

    println(stringExample3 + stringExample4)
    println(stringExample3.toInt() + stringExample4.toInt())

    // Concatenar con variables
    val name = "Julio"
    var stringConcatenada: String = "Hola"

    stringConcatenada = "Hola me llamo $name, y tengo $age1"
    println(stringConcatenada)

    val convetirVariable: String = age1.toString()
    println(convetirVariable)

    val convertirVariable2: Int = stringExample3.toInt()
    println(convertirVariable2)
}