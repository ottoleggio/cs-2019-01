package com.github.ottoleggio.cs.aula8.application.console;

import java.io.IOException;
import com.github.ottoleggio.cs.aula8.domain.ImprimeHexa;

public final class ProgramaInteiro {

    private ProgramaInteiro() {

    }

    public static void main(final String[] args) throws IOException {
        System.out.println(ImprimeHexa.leByteFile(args[0]));
    }
}
