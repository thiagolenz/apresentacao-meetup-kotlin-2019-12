package anotacoes;

import java.time.LocalDateTime;

public class ChamandoClasseKotlin {
    public static void main(String[] args) {

        String text = "Este é um texto meetup kotlin";
        Notificador.notificar(new Evento(text, LocalDateTime.now()));


    }
}
