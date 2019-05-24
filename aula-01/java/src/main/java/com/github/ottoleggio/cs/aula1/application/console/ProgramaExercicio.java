package com.github.ottoleggio.cs.aula1.application.console;

import com.github.ottoleggio.cs.aula1.domain.Exercicio;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ProgramaExercicio {

	private static final Logger logger = LogManager.getLogger(ProgramaExercicio.class);

	/**
	 * Restringe criação de instância.
	 */
	private ProgramaExercicio() {
		// Apenas evita criação de instância.
	}

	/**
	 * Ponto de entrada da aplicação. Apenas para ilustra chamada de método.
	 *
	 * @param args Ignorados.
	 */
	public static void main(String[] args) {

		logger.info("iniciado");

	}
	
	
}
