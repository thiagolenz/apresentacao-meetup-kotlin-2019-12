package anotacoes

import java.time.LocalDateTime


 data class Evento (val descricao: String, val date: LocalDateTime)
 class Notificador {
    companion object {
        @JvmStatic fun notificar (evento:Evento) {
            println(evento)
        }
    }
 }





