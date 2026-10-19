package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void deveDividirDoisNumeros() {
        assertEquals(5, calculadora.divide(10, 2));
    }

    @Test
    void deveLancarExcecaoQuandoDivisorForZero() {
        ArithmeticException erro = assertThrows(
                ArithmeticException.class,
                () -> calculadora.divide(10, 0)
        );

        assertEquals("Divisor não pode ser zero", erro.getMessage());
    }
}