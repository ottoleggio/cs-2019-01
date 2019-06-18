package com.github.ottoleggio.cs.aula8.application.console;

import java.io.IOException;
import java.util.logging.Logger;

import com.github.ottoleggio.cs.aula8.domain.ImprimeHexaUtils;

/**
* Executa ProgramaInteiro.
*
* @author Octavio Lo Leggio
*/
public final class ProgramaInteiro {
    /**
    * Mensagem de retorno do programa.
    */
    private static Logger log = Logger.getLogger(ProgramaInteiro.class.getName());
    /**
    * Método construtor da classe main.
    */
    private ProgramaInteiro() {

    }
    /**
    * Método main.
    * @param args String de endereço de um arquivo
    *
    * @throws IOException se ocorrer exception de IO
    */
    public static void main(final String[] args) throws IOException {
        log.info(ImprimeHexaUtils.leByteFile(args[0]));
    }
}
