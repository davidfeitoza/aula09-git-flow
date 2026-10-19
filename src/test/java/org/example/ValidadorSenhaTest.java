package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorSenhaTest {

    private final ValidadorSenha validador = new ValidadorSenha();

    @Test
    void deveRejeitarSenhaNula() {
        assertFalse(validador.validarSenha(null));
    }

    @Test
    void deveRejeitarSenhaCurta() {
        assertFalse(validador.validarSenha("1234"));
    }

    @Test
    void deveAceitarSenhaComOitoCaracteres() {
        assertTrue(validador.validarSenha("12345678"));
    }
}