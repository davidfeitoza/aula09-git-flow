package org.example;

import java.util.regex.Pattern;

/**
 * Serviço responsável por enviar notificações por email.
 */
public class NotificacaoService {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
    );

    /**
     * Envia um email para o destinatário informado.
     *
     * @param destinatario endereço de email do destinatário
     * @param mensagem texto da mensagem
     * @throws IllegalArgumentException se o email for nulo ou tiver formato inválido
     */
    public void enviarEmail(String destinatario, String mensagem) {
        if (destinatario == null || !EMAIL_PATTERN.matcher(destinatario).matches()) {
            throw new IllegalArgumentException("Email inválido");
        }

        System.out.println("Enviando email para " + destinatario + ": " + mensagem);
    }
}