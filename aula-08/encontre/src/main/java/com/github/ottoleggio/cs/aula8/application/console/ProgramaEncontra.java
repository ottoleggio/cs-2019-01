package com.github.ottoleggio.cs.aula8.application.console;

import java.io.IOException;
import com.github.ottoleggio.cs.aula8.domain.EncontraPalavra;

public final class ProgramaEncontra {

    private ProgramaEncontra() {

    }

    public static void main(final String[] args) throws IOException {
        //System.out.println(EncontraPalavra.seJpeg(
        //        EncontraPalavra.confereByteJpeg(args[0])));
        EncontraPalavra.contarLinhasEColunas("/home/otto/repos/cs-2019-01/aula-08/encontre/src/test/resources/teste.txt", "aqui");
    }
}
