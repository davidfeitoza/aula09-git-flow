package org.example;

public class ValidadorSenha {

    public boolean validarSenha(String senha) {
        return senha != null && senha.length() >= 8;
    }
}