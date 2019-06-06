package com.github.ottoleggio.cs.aula7.domain;

import java.util.Arrays;

/**
 * Funções matemáticas diversas com propósito de estudo das ferramentas e boas
 * práticas da disciplina de construção de software.
 */
public final class Vetores {

    /**
     * Método construtor.
     */
    private Vetores() {

    }

    /**
     * Função que encontra a menor temperatura em um vetor
     * de valores recebido como argumento.
     *
     * @param vetor Vetor contendo temperaturas.
     *
     * @return {double[]} Retorna A menor temperatura encontrada.
     */
    public static double menorTemp(final double[] vetor) {
        final double[] vetorAux = vetor;
        Arrays.sort(vetorAux);

        return vetorAux[0];
    }

    /**
     * Função que soma os números ímpares contidos em um vetor de inteiros.
     *
     * @param vetor Vetor contendo inteiros.
     *
     * @return {int} Retorna a soma dos números ímpares no vetor.
     */
    public static int somaImpares(final int[] vetor) {
        final int[] vetorAux = vetor;
        int somaImpar = 0;

        for (int i = 0; i < vetorAux.length; i++) {
            if (vetorAux[i] % 2 != 0) {
                somaImpar = somaImpar + vetorAux[i];
            }
        }

        return somaImpar;
    }

    /**
     * Função que conta a quantidade de cada uma das letras presentes em uma
     * sequência de caracteres.
     *
     * @param str Vetor contendo inteiros.
     *
     * @return {int} Retorna a soma dos números ímpares no vetor.
     */
    public static int contaLetras(final String str) {
        final String frase = str;
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                contador++;
            }
        }

        return contador;
    }
}
