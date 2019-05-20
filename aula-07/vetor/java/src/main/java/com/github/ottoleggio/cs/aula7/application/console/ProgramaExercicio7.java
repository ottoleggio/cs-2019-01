package com.github.ottoleggio.cs.aula7.application.console;

import com.github.ottoleggio.cs.aula7.domain.Exercicio7;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ProgramaExercicio7 {

	private static final Logger logger = LogManager.getLogger(ProgramaExercicio7.class);

	/**
	 * Restringe criação de instância.
	 */
	private ProgramaExercicio7() {
		// Apenas evita criação de instância.
	}

	/**
	 * Ponto de entrada da aplicação. Apenas para ilustra chamada de método.
	 *
	 * @param args Ignorados.
	 */
	public static void main(String[] args) {
		logger.info("iniciado");
		System.out.println(Exercicio7.contaLetras("octavio aug   s"));

	}
	
	
}
