package partioning

class MainPartioning {
}

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val (pares, impares) = numbers.partition { it % 2 == 0 }


    println(pares)
    println(impares)

    val listA = listOf("one", "two", "three")
    val listB = listOf("four", "five")
    val listFinal = listA + listB


    println(listFinal)


//    val cidades = listOf("Curitiba", "Londrina", "Cascavel", "Lapa", "Foz do Iguaçu")
//    val mapa = cidades.groupBy { it.first().toUpperCase() }
//    println(mapa)
    // {C=[Curitiba, Cascavel], L=[Londrina, Lapa], F=[Foz do Iguaçu]}

    val cidades = listOf("Curitiba", "Londrina", "Cascavel", "Lapa", "Foz do Iguaçu")
    cidades.map { it.toUpperCase()  } // 1a interacao
            .filter { it.first() == 'C' } // 2a interacao
            .forEach { println(it) } // 3a interacao


    fun2()
    fun2Performance ()
}

fun fun2 ()  {

    val cidades = listOf("Curitiba", "Londrina", "Cascavel", "Lapa", "Foz do Iguaçu")
    cidades.asSequence()
            .map { it.toUpperCase()  } // única interacao para lista toda
            .filter { it.first() == 'C' } // única interacao para lista toda
            .forEach { println(it) } // única interacao para lista toda



}


fun fun2Performance ()  {

    val cidades = listOf("Curitiba", "Londrina", "Cascavel", "Lapa", "Foz do Iguaçu")
    cidades.stream() // performance do JAVA STREAM é melhor
            .map { it.toUpperCase()  }
            .filter { it.first() == 'C' }
            .forEach { println(it) }



}