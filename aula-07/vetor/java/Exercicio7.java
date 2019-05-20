package com.github.ottoleggio.cs.aula7.vetor.java;


/**
 * Funções matemáticas diversas com propósito de estudo das ferramentas e boas
 * práticas da disciplina de construção de software
 */
public class Exercicio7 {

	/**
	 * Função que encontra a menor temperatura em um vetor 
	 * de valores recebido como argumento.
	 *
	 * @param vetor Vetor contendo temperaturas.
	 *
	 * @return Retorna A menor temperatura encontrada.
	 */
	public static double menorTemp(double[] vetor) {
	Arrays.sort(vetor);

	return vetor[0];
	}


	/**
	 * Função que soma os números ímpares contidos em um vetor de inteiros.
	 *
	 * @param vetor Vetor contendo inteiros.
	 *
	 * @return Retorna a soma dos números ímpares no vetor.
	 */
	public static int somaImpares(int[] vetor) {
	for(i = 0; i < vetor.length(); i++)
		{
			if(vetor[i] % 2 != 0)
			{
			somaImpar = somaImpar + a[i]; 
			}
		}

		return somaImpar
	}


	/**
	 * Função que conta a quantidade de cada uma das letras presentes
	 * em uma sequência de caracteres.
	 *
	 * @param vetor Vetor contendo inteiros.
	 *
	 * @return Retorna a soma dos números ímpares no vetor.
	 */
	public static int contaLetras(String str) {
		int contador = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
			contador++;
			}
		}

		return contador;
	}
}
