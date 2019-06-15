package com.github.ottoleggio.cs.aula8.application.console;

import java.io.IOException;
import com.github.ottoleggio.cs.aula8.domain.EncontraPalavra;

public final class ProgramaEncontra {

    private ProgramaEncontra() {

    }

    public static void main(final String[] args) throws IOException {
        System.out.println(EncontraPalavra.retornaSaida(args[0], args[0]));
    }
}
