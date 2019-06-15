package com.github.ottoleggio.cs.aula8.application.console;

import java.io.IOException;
import java.util.logging.Logger;

import com.github.ottoleggio.cs.aula8.domain.EncontraPalavraUtils;

/**
* Executa ProgramaEncontra.
*
* @author Octavio Lo Leggio
*/
public final class ProgramaEncontra {
    /**
    * Mensagem de retorno do programa.
    */
    private static Logger log = Logger.getLogger(ProgramaEncontra.class.getName());
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
        log.fine(EncontraPalavraUtils.retornaSaida(args[0], args[0]));
    }
}
