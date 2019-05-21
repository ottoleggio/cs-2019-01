package com.github.ottoleggio.cs.aula7.domain;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class FrequenciaAleatoria {

	public static ArrayList<Integer> geraFrequencia() {
		Random rand = new Random();

		ArrayList<Integer> vetor = new ArrayList<Integer>();

		for (int i = 1; i <= 1000000; i++) {
			vetor.add(rand.nextInt(1001));
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
		resultado.add(contador); // armazena a frequencia na posição 0
	
		resultado.add(vetor.get(i)); // começa a armazenar os numeros com maxima frequencia
		
		int frequencia = contador;
		while (frequencia == contador) {
			contador = 0;

			while (vetor.get(i) == vetor.get(i + 1)) {
				contador++;
				i++;
			}
			if(contador == frequencia) {
				resultado.add(vetor.get(i));
			}
		}
		return resultado;
	}

}
