import kotlin.random.Random

/*
    Fecha: 26/01/2022
    Version: 1.0
    Autor: José Luis Tocino Rojo
    Empresa/centro: I.E.S. Rafael Alberti
    Ejercicio: 1 y 2 de la actividad 5 del segundo trimestre de la asignatura Entornos de Desarrollo
*/

//Ejercicio 1.- Según el valor de la variable nota en el condicional When se imprime el como se traduce la nota recibida
//en palabras
fun ej1()
{
    print("Escriba la nota -> ")
    val nota:Int = readLine()!!.toInt() //Hecho para recibir la variable desde el teclado
    //Se podría cambiar para que pudiese recibir valores flotantes

    when (nota)
    {
        in 0..4 -> println("Suspenso")
        in 5..6 -> println("Aprobado")
        in 7..8 -> println("Notable")
        in 9..10 -> println("Sobresaliente")
        else -> println("El valor introducido no es correcto")
    }
    println("-------------------")
}

//Ejercicio 2.- Array de 20 numero aleatorios y realizar distintas transformaciones en el
fun ej2() {
    val arrayRandom = MutableList(20) { Random.nextInt(0, 200) }

    print("Valores pares de la lista -> ")
    arrayRandom.forEach() // Se imprime en pantalla los valores pares
    {
        if (it % 2 == 0)
            print("$it, ")
    }

    println()
    arrayRandom.sort() //Se ordena de menor a mayor los números de la lista
    println("Primer elemento de la lista -> ${arrayRandom[0]}")
    println("Ultimo elemento de la lista -> ${arrayRandom[19]}")

    var suma: Int = 0 //Iniciamos la variable para recoger la suma
    arrayRandom.forEach() //Recorremos la lista para hacer la suma de los elementos de la lista
    {
        suma += it
    }
    println("La suma de todos los elementos da -> $suma")

    //Borra todos los elementos que cumplan la condición
    arrayRandom.removeAll { it%2 != 0}
    println("La lista sin números impares -> $arrayRandom")
}

fun main() {
    ej1()
    ej2()
}