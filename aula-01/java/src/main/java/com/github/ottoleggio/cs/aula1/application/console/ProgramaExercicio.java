package com.github.ottoleggio.cs.aula1.application.console;

//import com.github.ottoleggio.cs.aula1.domain.Exercicio;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Programa responsável por rodar exercicios realizados
 * na disciplina de Construção de Software.
 *
 */
public final class ProgramaExercicio {
	/**
	 * Cria Log de execução.
	 */
	private static final Logger logger =
	LogManager.getLogger(ProgramaExercicio.class);

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
	public static void main(final String[] args) {

		logger.info("iniciado");

	}
}
