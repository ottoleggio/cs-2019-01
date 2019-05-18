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
		/*int[] cpf = { 0, 1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19 };
		
		int[] test1 = new int[19];
		for (int i = 1; i < 19; i++) {
			test1[i] = 0;
		}
*/

		int[] test1 = {0,1,2};
		//System.out.println(Exercicio.digitoCPF(cpf));
		//System.out.println(Exercicio.razaoAurea(2, 4, 2));
		System.out.println(Exercicio.fibonacci(7));
	}
	
	
}
