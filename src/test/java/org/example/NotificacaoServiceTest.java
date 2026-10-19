package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoServiceTest {

    private final NotificacaoService service = new NotificacaoService();

    @ParameterizedTest
    @ValueSource(strings = {
            "ana@email.com",
            "joao.silva@empresa.com.br",
            "maria+teste@dominio.org"
    })
    void deveAceitarEmailsValidos(String email) {
        assertDoesNotThrow(() -> service.enviarEmail(email, "Olá"));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "semarroba.com",
            "ana@",
            "@email.com",
            "ana@email",
            "ana @email.com",
            ""
    })
    void deveRejeitarEmailsInvalidos(String email) {
        assertThrows(
                IllegalArgumentException.class,
                () -> service.enviarEmail(email, "Olá")
        );
    }

    @Test
    void deveRejeitarEmailNulo() {
        assertThrows(
                IllegalArgumentException.class,
                () -> service.enviarEmail(null, "Olá")
        );
    }
}