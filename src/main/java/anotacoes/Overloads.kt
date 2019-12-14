package anotacoes

import java.time.LocalDateTime

 enum class TipoNotificacao {
    INFO, ERRO
 }
 data class Notificacao @JvmOverloads constructor(val mensagem: String,
                          val tipo: TipoNotificacao = TipoNotificacao.INFO,
                          val dataHora: LocalDateTime = LocalDateTime.now())
 fun main() {
    Notificacao("mensagem")
    Notificacao("mensagem", dataHora = LocalDateTime.MIN)
    Notificacao("mensagem", tipo = TipoNotificacao.ERRO)
    Notificacao("mensagem", tipo = TipoNotificacao.ERRO, dataHora = LocalDateTime.MAX)
 }






