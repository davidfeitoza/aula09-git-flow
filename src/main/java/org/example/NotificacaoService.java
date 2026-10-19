package org.example;

public class NotificacaoService {

    public void enviarEmail(String destinatario, String mensagem) {
        if (!destinatario.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }

        System.out.println("Enviando email para " + destinatario + ": " + mensagem);
    }
}