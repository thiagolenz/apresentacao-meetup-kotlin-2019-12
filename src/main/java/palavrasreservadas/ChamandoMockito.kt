package palavrasreservadas

import org.mockito.Mockito

class Service {
    fun metodo () : String {
        return "teste"
    }
}

fun main() {
    val service = Service()



    Mockito.`when`(service.metodo()).thenReturn("Teste")

}