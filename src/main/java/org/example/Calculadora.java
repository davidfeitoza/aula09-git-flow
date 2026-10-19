package org.example;

public class Calculadora {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor não pode ser zero"); // Fail fast
        }

        return a / b;
    }
}