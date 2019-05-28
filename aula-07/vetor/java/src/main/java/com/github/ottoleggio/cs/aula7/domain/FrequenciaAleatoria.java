package com.github.ottoleggio.cs.aula7.domain;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public final class FrequenciaAleatoria {

    /**
	 * Método construtor.
	 */
	private FrequenciaAleatoria() {

	}

	/**
	 * Função que gera 1.000.000 números aleatórios de
	 * 0 a 1000 e elenca os mais frequentes.
	 */
	public static ArrayList<Integer> geraFrequencia() {
		Random rand = new Random();

		ArrayList<Integer> vetor = new ArrayList<Integer>();
		final int abrangencia = 1001;
		final int tamanho = 1000000;
		for (int i = 1; i <= tamanho; i++) {
			vetor.add(rand.nextInt(abrangencia));
		}

		Collections.sort(vetor);

		ArrayList<Integer> resultado = new ArrayList<Integer>();

		int i = 0;
		int contador = 0;

		while (vetor.get(i) == vetor.get(i + 1)) {
			contador++;
			//System.out.println("um encontrado");
			i++;
		}
		// armazena a frequencia na posição 0
		resultado.add(contador);

		// começa a armazenar os numeros com maxima frequencia
		resultado.add(vetor.get(i));

		int frequencia = contador;
		while (frequencia == contador) {
			contador = 0;

			while (vetor.get(i) == vetor.get(i + 1)) {
				contador++;
				i++;
			}
			if (contador == frequencia) {
				resultado.add(vetor.get(i));
			}
		}
		return resultado;
	}

}
