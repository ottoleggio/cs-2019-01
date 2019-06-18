package com.github.ottoleggio.cs.aula8.application.console;

import java.io.IOException;

import com.github.ottoleggio.cs.aula8.domain.VerificaFormatoUtils;

/**
* Executa ProgramaJpeg.
*
* @author Octavio Lo Leggio
*/
public final class ProgramaJpeg {
     /**
     * Método construtor da classe main.
     */
    private ProgramaJpeg() {

    }
    /**
     * Método main.
     * @param args String de endereço de um arquivo
     *
     * @throws IOException se ocorrer exception de IO
     */
    public static void main(final String[] args) throws IOException {
        System.console().writer().println(VerificaFormatoUtils.seJpeg(
                VerificaFormatoUtils.confereByteJpeg(args[0])));
    }
}
