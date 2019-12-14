package anotacoes;

import java.time.LocalDateTime;

public class ConsumindoOverloads {
    public static void main(String[] args) {

        new Notificacao("Esta é uma mensagem");
        new Notificacao("Esta é uma mensagem", TipoNotificacao.ERRO);
//        new Notificacao("Esta é uma mensagem", LocalDateTime.now());
        new Notificacao("Esta é uma mensagem", TipoNotificacao.ERRO, LocalDateTime.now());

    }
}
