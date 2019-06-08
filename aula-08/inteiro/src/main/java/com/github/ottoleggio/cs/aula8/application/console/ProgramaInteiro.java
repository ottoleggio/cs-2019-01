package com.github.ottoleggio.cs.aula8.application.console;

import java.io.File;
import java.io.IOException;

import com.github.ottoleggio.cs.aula8.domain.ImprimeHexa;

public class ProgramaInteiro {

	public static void main(String[] args) throws IOException {
		//System.out.println(ImprimeHexa.leByteFile(args[0]));
		System.out.println(ImprimeHexa.leByteFile("/home/otto/repos/cs-2019-01/"
				+ "aula-08/inteiro/src/test/resources/nao_existe.txt"));
	}
}
