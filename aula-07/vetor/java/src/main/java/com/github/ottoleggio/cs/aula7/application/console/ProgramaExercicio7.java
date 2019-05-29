package com.github.ottoleggio.cs.aula7.application.console;

import com.github.ottoleggio.cs.aula7.domain.Vetores;
import com.github.ottoleggio.cs.aula7.domain.FrequenciaAleatoria;
import com.github.ottoleggio.cs.aula7.domain.PalavraFrequente;

import java.nio.file.CopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		resultado.add(50);
		resultado.add(10);
		resultado.add(10);
		resultado.add(50);
		resultado.add(20);
		System.out.println(resultado);
		Collections.sort(resultado);
		System.out.println(resultado);
		
		//int[] cpf3 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 8, 0 };
		//System.out.println(Vetores.somaImpares(cpf3));
		//ArrayList<Integer> teste = new ArrayList<Integer>();
		System.out.println(FrequenciaAleatoria.encontraFrequente(resultado));
		//System.out.println(teste.get(0) + " " + teste.get(1));

		//System.out.println(PalavraFrequente.palavra("alo alo oh oh alo ih ah oh oh"));
	}
}
