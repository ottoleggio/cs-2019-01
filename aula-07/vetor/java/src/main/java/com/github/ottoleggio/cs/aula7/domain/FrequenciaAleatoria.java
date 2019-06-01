package com.github.ottoleggio.cs.aula7.domain;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe responsavel pelo metodo FrequenciaAleatoria.
 */
public final class FrequenciaAleatoria {

    /**
     * Método construtor.
     */
	private FrequenciaAleatoria() {

	}

	/**
	 * Gera uma lista com números aleatórios.
	 *
	 * @param tamanho Tamanho da lista
	 * @param abrangencia Variação de números aleatórios
	 *
	 * @return {ArrayList<Integer>} Retorna uma lista
	 * com os numeros mais frequentes, sendo a posição
	 * 0 a frequência
	 */
	public static ArrayList<Integer> geraAleatorio(final int tamanho, final int abrangencia) {
		if (abrangencia < 0) {
			throw new IllegalArgumentException("A abrangência deve"
					+ "ser maior que 0");
		}

		if (tamanho < 0) {
			throw new IllegalArgumentException("O tamanho deve"
					+ "ser maior que 0");
		}

		Random rand = new Random();

		ArrayList<Integer> vetor = new ArrayList<Integer>();

		final int abrangenciaFunc = abrangencia + 1;
		final int tamanhoFunc = tamanho;

		for (int i = 1; i <= tamanhoFunc; i++) {
			vetor.add(rand.nextInt(abrangenciaFunc));
		}

		Collections.sort(vetor);

		return vetor;
	}

	/**
	 * Elenca os números mais frequentes de uma lista.
	 *
	 * @param vetor lista com números
	 *
	 * @return {ArrayList<Integer>} Retorna uma lista
	 * com os numeros mais frequentes, sendo a posição
	 * 0 a frequência
	 */
	public static ArrayList<Integer> encontraFrequente(final ArrayList<Integer> vetor) {
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		ArrayList<Integer> vetorAux = vetor;
		//garante lista ordenada
		Collections.sort(vetorAux);

		int i = 0;
		int contador = 0;

		while (vetorAux.get(i) == vetorAux.get(i + 1)) {
			contador++;
			//System.out.println("um encontrado");
			i++;
		}
		// armazena a frequencia na posição 0
 		resultado.add(contador + 1);

		// começa a armazenar os numeros com maxima frequencia
		resultado.add(vetorAux.get(i));

		contador++;
		i++;
		int frequencia = contador;
		for (int j = 0; j < vetorAux.size(); j++) {
			contador = 1;

			if (vetorAux.get(i) == vetorAux.get(i + 1)) {
				contador++;
				i++;
			}
			if (contador == frequencia) {
				resultado.add(vetorAux.get(i));
			}
			i++;
			j = i;
		}
		return resultado;
	}
}
