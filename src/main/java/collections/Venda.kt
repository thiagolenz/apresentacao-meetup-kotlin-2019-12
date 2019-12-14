package collections

import java.math.BigDecimal


 data class Venda (val numero: Int,
                  val valorVenda: BigDecimal,
                  val itens: List<VendaItem>)
 data class VendaItem (val descricao: String, val valorTotal: BigDecimal)

 class VendaService {
    fun recuperarPorNumero (numero: Int) =
            Venda(1,
                    BigDecimal(80),
                    listOf(VendaItem("Mochila", BigDecimal(80)))
            )
 }



