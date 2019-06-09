package com.github.ottoleggio.cs.aula8.application.console;

import java.io.IOException;
import com.github.ottoleggio.cs.aula8.domain.VerificaFormato;

public final class ProgramaJpeg {

    private ProgramaJpeg() {

    }

    public static void main(final String[] args) throws IOException {
        System.out.println(VerificaFormato.seJpeg(
                VerificaFormato.confereByteJpeg(args[0])));
    }
}
