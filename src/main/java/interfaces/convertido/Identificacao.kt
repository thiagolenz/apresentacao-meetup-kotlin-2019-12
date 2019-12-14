package interfaces.convertido

 interface Identificacao {
    val cnpj: String
    val periodo: Int?

    companion object {
        fun of(cnpj: String, periodo: Int?): Identificacao {
            return object : Identificacao {
                override val cnpj: String
                    get() = cnpj
                override val periodo: Int?
                    get() = periodo
            }
        }
    }
 }




