package collections;

import java.math.BigDecimal;

 public class ConsumindoLista {
    public static void main(String[] args) {
        Venda venda = new VendaService().recuperarPorNumero(1);
        venda.getItens().add(new VendaItem("Caderno", new BigDecimal(30)));
    }
 }










