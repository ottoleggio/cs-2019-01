package com.github.ottoleggio.cs.aula8.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe responsável pelos métodos contaOcorrencias,
 * contarLinhasEColunas e retornaSaida.
 */
public final class EncontraPalavraUtils {

    /**
     * Método construtor da classe.
     */
    private EncontraPalavraUtils() {

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
        final File teste = new File(enderecoArquivo);

        if (teste.length() == 0) {
            throw new IllegalArgumentException("O arquivo não contem"
        + " dados suficientes.");
        }

        final BufferedReader br = Files.newBufferedReader(Paths.get(enderecoArquivo));

        String linhas;
        String[] palavras;
        int ocorrencias = 0;

        linhas = br.readLine();
        while (linhas != null) {
            palavras = linhas.split(" ");

            for (int i = 0; i < palavras.length; i++) {
                if (palavraBuscada.equals(palavras[i])) {
                    ocorrencias++;
                }
            }
            linhas = br.readLine();
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
        final File teste = new File(enderecoArquivo);

        if (teste.length() == 0) {
            throw new IllegalArgumentException("O arquivo não contem"
        + " dados suficientes.");
        }

        final BufferedReader br = Files.newBufferedReader(Paths.get(enderecoArquivo));

        int contadorLinhas = 0;
        final StringBuilder resultado = new StringBuilder();
        final StringBuilder leitorLinha = new StringBuilder();
        String recebeLinha;

        recebeLinha = br.readLine();
        while (recebeLinha != null) {
            leitorLinha.append(recebeLinha);
            contadorLinhas++;
            if (leitorLinha.toString().contains(palavraBuscada)) {

                resultado.append(String.format("%nL%d C%d: %s", contadorLinhas,
                leitorLinha.indexOf(palavraBuscada) + 1, leitorLinha.toString()));
            }
            leitorLinha.setLength(0);
            recebeLinha = br.readLine();
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

        final StringBuilder saida = new StringBuilder();
        saida.append(contaOcorrencias(enderecoArquivo, palavraBuscada)).
        append(contarLinhasEColunas(enderecoArquivo, palavraBuscada));

        return saida.toString();
    }
}
