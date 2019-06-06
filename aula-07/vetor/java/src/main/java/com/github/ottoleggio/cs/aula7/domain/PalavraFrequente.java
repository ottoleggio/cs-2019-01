package com.github.ottoleggio.cs.aula7.domain;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

/**
 * Classe que contém a funçao Palavra.
 */
public final class PalavraFrequente {

    /**
     * Método construtor.
     */
    private PalavraFrequente() {

    }

    /**
     * Função que encontra a palavra mais frequente.
     *
     * @param frase String contendo uma frase.
     *
     * @return {int} Retorna a palavra mais frequente.
     */
    public static String palavra(final String frase) {
        // cria contador
        final HashMap<String, Integer> contador = new HashMap<String, Integer>();

        String[] palavras = {""};

        if (frase.startsWith(" ")) {
            palavras = frase.toLowerCase().substring(1).split(" ");
        } else {
            palavras = frase.toLowerCase().split(" ");
        }

        for (final String palavra : palavras) {
            if (contador.containsKey(palavra)) {
                contador.put(palavra, contador.get(palavra) + 1);
            } else {
                contador.put(palavra, 1);
            }
        }

        final Map<String, Integer> sorted = contador.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

        return (String) sorted.keySet().toArray()[0];
    }

}

/*
 * referencias
 * https://javaconceptoftheday.com/find-most-repeated-word-in-text-file-in-java/
 * https://www.w3schools.com/java/java_hashmap.asp
 * https://www.javacodegeeks.com/2017/09/java-8-sorting-hashmap-values-ascending
 * -descending-order.html
 */
