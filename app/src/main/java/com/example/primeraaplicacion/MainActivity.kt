package com.example.primeraaplicacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lección 1
        //variablesYconstantes()

        // Lección 2
        //tiposDeDatos()

        // Lección 3
        //sentenciaIf()

        // Lección 4
        //sentenciaWhen()

        // Lección 5
        //arrays()

        // Lección 6
        //maps()

        // Lección 7
        //loops()
    }

    // Functions

    private fun variablesYconstantes(){
        // Variables
        var myFirstVariable = "Hello Android"
        myFirstVariable = "Cambiada"
        println(myFirstVariable)

        // Constantes
        val myFirstConstant= 5
        println(myFirstConstant)
    }

    private fun tiposDeDatos(){
        // Strings
        val cadena1 = "Hola"
        val cadena2 = "cómo esás preciosa?"
        val cadena3 = cadena1 + ",  " + cadena2
        println(cadena3)

        // Enteros
        val numInt = 1
        val numInt2 = 3
        println(numInt+numInt2)

        // Decimales
        val myDouble = 2.5
        val myDouble2: Float = 1.5f

        // Hace la conversión automáticamente
        println(myDouble+myDouble2)

        // Booleanos
        val repetir = true
        val repetir2 = false

        println(repetir == repetir2)
        println(repetir && repetir2)
    }

    private fun sentenciaIf(){

        val myNumber = 11

        // Operadores lógicos
        // && operador 'and'
        // || operador 'or'
        // ! operador 'no'

        // Sentencia if y else if

        if(myNumber < 10) {
            println("$myNumber es menor que 10 y menor que 5")
        }else if(myNumber > 5){
            println("$myNumber es menor que 10 y mayor que 5")
        }
    }

    private fun sentenciaWhen(){

        // When con String
        val country = "Casita"

        when (country){
            "Casita", "Zamora", "Madrid"-> {
                println("Esto es España")
            } else -> {
                println("No tengo ni puta idea")
            }
        }

        // When con Int
        val age = 10

        when (age){
            in 0..2-> {
                println("Eres un bebé")
            } in 3..10 -> {
                println("Eres un niño")
            } in 11..17 -> {
                println("Eres un adolescente")
            } in 18..69 -> {
                println("Eres un adulto")
            } in 70..99 -> {
                println("Eres un viejo")
            } else ->{
                println("No existes")
            }
        }
    }

    private fun arrays(){
        val name = "Pablo"
        val surname = "Barderas"
        val company = "BarderasDev"
        val age = "21"

        // Crear un array
        val myArray = arrayListOf<String>()
        val arrayUbuntu = arrayListOf<String>()

        // Añadir datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        // Añadir un conjunto de datos
        myArray.addAll(listOf("Hola", "Cómo te va"))
        arrayUbuntu.addAll(listOf("Portatil rojo", "Portatil gris"))

        println(myArray)

        // Acceso a datos
        val myCompany = myArray[2]

        println("My company is: $myCompany")

        // Modificar datos
        myArray[5] = "qué tal estás"

        println(myArray)

        // Eliminar datos
        myArray.removeAt(4)

        println(myArray)

        // Recorrer datos
        myArray.forEach{
            println(it)
        }

        // Otras operaciones
        val numElements = myArray.count() // Cuenta los elementos del Array

        println(numElements)

        myArray.clear() // Vacía el array

        println(myArray.count())

        myArray.first()
        myArray.last()

        myArray.sort()



    }

    private fun maps(){

        // Sintaxis (Mapa o diccionario, seleccionando el tipo
        // dato del contenido y a continuación del id asociado al misma)

        // Crear y añadir elementos (Se puede hacer también cuando se crea)
        var myMap: Map<String, Int> = mapOf()

        // Añadir elementos con mutable que indica que se podrán añadir más
        myMap = mutableMapOf("Pablo" to 1, "Barderas" to 2, "Ubuntu" to 3)

        println(myMap["Barderas"])
        println(myMap["Ubuntu"])
        println(myMap)

        // Añadir un solo valor (Dos formas diferentes)
        // No puede haber claves repetidas pero si valores repetidos
        myMap["Ana"] = 4
        myMap.put("Windows", 5)
        println(myMap)

        // Acceso a un dato
        println(myMap["Windows"])

        // Actualización de un dato
        myMap.put("Barderas", 25)
        println(myMap["Barderas"])

        // Eliminar un dato
        myMap.remove("Windows")
        println(myMap)
    }

    private fun loops(){

        // Bucles

        val myArray = listOf<String>("Buenas", "Estoy aprendiendo Kotlin")
        val myMap = mutableMapOf<String,Int>("Pablo" to 1, "Barderas" to 2, "Fernández" to 3)

        // For

        for (myString in myArray){
            println(myString)
        }

        for (myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        // Recorre del 0 hasta el 10
        for (x in 0..10){
            println(x)
        }

        // Recorre del 0 hasta el 9
        for (x in 0 until 10){
            println(x)
        }

        // Recorre de dos en dos
        for (x in 0..10 step 2){
            println(x)
        }

        // Recorre de froma inversa y de dos en dos
        for (c in 10 downTo 0 step 2){
            println(c)
        }

        // Array que contiene un rango de números
        val myNumericArray = (0..20)
        for (i in myNumericArray){
            println(i)
        }

        // While

        var x = 0

        while (x < 10) {
            println(x)
            x += 2
        }
    }

}

