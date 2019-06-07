package com.github.ottoleggio.cs.aula8.application.console;

import java.io.IOException;

import com.github.ottoleggio.cs.aula8.domain.ImprimeHexa;

public class ProgramaInteiro {

	public static void main(String[] args) throws IOException {
		System.out.println(ImprimeHexa.leArquivo(args[0]));
	}
}
