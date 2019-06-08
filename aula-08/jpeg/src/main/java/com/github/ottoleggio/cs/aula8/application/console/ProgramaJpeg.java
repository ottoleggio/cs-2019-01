package com.github.ottoleggio.cs.aula8.application.console;

import java.io.IOException;
import com.github.ottoleggio.cs.aula8.domain.VerificaFormato;

public final class ProgramaJpeg {

    private ProgramaJpeg() {

    }

    public static void main(final String[] args) throws IOException {
        //System.out.println(ImprimeHexa.leByteFile(args[0]));
        //System.out.println(ImprimeHexa.leByteFile("/home/otto/repos/"
        //        + "cs-2019-01/aula-08/jpeg/src/test/resources/imagem.jpg"));
        System.out.println(VerificaFormato.seJpeg("/home/otto/repos/"
                + "cs-2019-01/aula-08/jpeg/src/test/resources/imagem.jpg"));
    }
}
