package com.github.ottoleggio.cs.aula8.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public final class EncontraPalavra {

    /**
     * Método construtor da classe.
     */
    private EncontraPalavra() {

    }

    /**
     * Método que conta a quantidade de ocorrência de uma
     * palavra fornecida como parametro em um arquivo.
     *
     * @param enderecoArquivo Endereço do arquivo a ser lido
     * @param palavraBuscada Palavra a ser buscada no arquivo
     *
     * @return Retorna a quantidade de ocorrências da palavra buscada
     * em formato específico
     * @throws IOException se ocorrer exception de IO
     */
    public static String contaOcorrencias(final String enderecoArquivo,
    final String palavraBuscada) throws IOException {
        File teste = new File(enderecoArquivo);

        if (teste.length() == 0) {
            throw new IllegalArgumentException("O arquivo não contem"
        + " dados suficientes.");
        }

        FileInputStream fis = new FileInputStream(enderecoArquivo);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linhas;
        String[] palavras;
        int ocorrencias = 0;

        while ((linhas = br.readLine()) != null) {
            palavras = linhas.split(" ");

            for (int i = 0; i < palavras.length; i++) {
                if (palavraBuscada.equals(palavras[i])) {
                    ocorrencias++;
                }
            }
        }

        br.close();
        return  "Encontradas: " + ocorrencias + ".";
    }

    /**
     * Método que busca uma palavra passada como parametro
     * e especifica a linha e coluna das ocorrencias encontradas.
     *
     * @param enderecoArquivo Endereço do arquivo a ser lido
     * @param palavraBuscada Palavra a ser buscada no arquivo
     *
     * @return retorna posicao de linha e coluna da palavra
     * encontrada, e a frase completa
     * @throws IOException se ocorrer exception de IO
     */
    public static String contarLinhasEColunas(final String enderecoArquivo,
    final String palavraBuscada) throws IOException {
        File teste = new File(enderecoArquivo);

        if (teste.length() == 0) {
            throw new IllegalArgumentException("O arquivo não contem"
        + " dados suficientes.");
        }

        FileInputStream fis = new FileInputStream(enderecoArquivo);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        int contadorLinhas = 0;
        StringBuilder resultado = new StringBuilder();
        StringBuilder leitorLinha = new StringBuilder();
        String recebeLinha;

        while ((recebeLinha = br.readLine()) != null) {
            leitorLinha.append(recebeLinha);
            contadorLinhas++;
            if (leitorLinha.toString().contains(palavraBuscada)) {
                int i = 1;
                resultado.append(String.format("%nL%d C%d: %s", contadorLinhas,
                leitorLinha.indexOf(palavraBuscada) + i, leitorLinha.toString()));
            }
            leitorLinha.setLength(0);
        }

        br.close();
        return resultado.toString();
    }

    /**
     * Método que agrupa contagem de ocorrências
     * e posição de linhas e colunas
     * em formato de texto específico.
     *
     * @param enderecoArquivo Endereço do arquivo a ser lido
     * @param palavraBuscada Palavra a ser buscada no arquivo
     *
     * @return Retorna saida do programa formatada
     * @throws IOException se ocorrer exception de IO
     */
    public static String retornaSaida(final String enderecoArquivo, final String palavraBuscada) throws IOException {

        StringBuilder saida = new StringBuilder();
        saida.append(contaOcorrencias(enderecoArquivo, palavraBuscada));
        saida.append(contarLinhasEColunas(enderecoArquivo, palavraBuscada));

        return saida.toString();
    }
}
