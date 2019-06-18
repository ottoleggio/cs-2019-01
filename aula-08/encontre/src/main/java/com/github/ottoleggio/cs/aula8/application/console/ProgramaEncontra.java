package com.github.ottoleggio.cs.aula8.application.console;

import java.io.IOException;

import com.github.ottoleggio.cs.aula8.domain.EncontraPalavraUtils;

/**
* Executa ProgramaEncontra.
*
* @author Octavio Lo Leggio
*/
public final class ProgramaEncontra {
    /**
    * Método construtor da classe main.
    */
    private ProgramaEncontra() {

    }
    /**
    * Método main.
    * @param args String de endereço de um arquivo
    *
    * @throws IOException se ocorrer exception de IO
    */
    public static void main(final String[] args) throws IOException {
        System.console().writer().println(EncontraPalavraUtils.
                retornaSaida(args[0], args[0]));
    }
}
