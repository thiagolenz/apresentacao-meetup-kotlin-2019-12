package interfaces.adaptado

import interfaces.Identificacao

class IdentificacaoBuilder {
    companion object {
        fun of (cnpj: String, periodo: Int): Identificacao = Identificacao.of(cnpj, periodo)
    }
 }



