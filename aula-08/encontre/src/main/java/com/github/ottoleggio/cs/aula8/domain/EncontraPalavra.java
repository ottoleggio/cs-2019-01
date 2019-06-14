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
     * Método que verifica o primeiro e ultimo byte de arquivo
     * a fim de verificar se o formato é JPEG ou não.
     *
     * @param enderecoArquivo Endereço do arquivo a ser lido
     *
     * @return Retorna True se o formato do arquivo for JPEG e
     * False caso contrário
     * @throws IOException se ocorrer exception de IO
     */
    public static String contaOcorrencias(final String enderecoArquivo, final String palavraBuscada) throws IOException {
        File teste = new File(enderecoArquivo);

        if (teste.length() == 0) {
            throw new IllegalArgumentException("O arquivo não contem"
        + " dados suficientes.");
        }

        FileInputStream fis = new FileInputStream(enderecoArquivo);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linhas;
        String palavras[];
        int ocorrencias = 0;

        while ((linhas = br.readLine()) != null) {
            palavras = linhas.split(" ");

            for (int i = 0; i < palavras.length; i++) {

                if(palavraBuscada.equals(palavras[i])) {
                    ocorrencias ++;
                }
            }
        }

        br.close();

        return  "Encontradas: " + ocorrencias + ".";
    }

    /**
     * Método que busca uma palavra passada como parametro
     * e especifica a linha e coluna das ocorrencias encontradas
     *
     * @param enderecoArquivo Endereço do arquivo a ser lido
     * @param palavraBuscada Palavra a ser buscada no arquivo
     *
     * @throws IOException se ocorrer exception de IO
     */
    public static String contarLinhasEColunas(final String enderecoArquivo, final String palavraBuscada) throws IOException {
        File teste = new File(enderecoArquivo);

        if (teste.length() == 0) {
            throw new IllegalArgumentException("O arquivo não contem"
        + " dados suficientes.");
        }

        FileInputStream fis = new FileInputStream(enderecoArquivo);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linhas;
        int indiceLinha = 0;
        int indiceColuna = 0;
        int iaux = 0;
        int contadorLinhas = 0;
        int encontrou = 0;
        boolean flagPalavra = false;
        String frase = null;
        StringBuilder resultado = new StringBuilder();

        while ((linhas = br.readLine()) != null) {
            contadorLinhas++;
            
            for (int i = 0; i < linhas.length(); i++) {
                encontrou = 0;
               
                if(linhas.charAt(i) == palavraBuscada.charAt(0)) {
                    iaux = i; //possivel coluna
                    for (int j = 0; j < palavraBuscada.length(); j++) {
                        encontrou ++;
                        if(encontrou == palavraBuscada.length() &&
                                (linhas.length() == i+1 ||
                                linhas.charAt(i+1) == ' ')) {
                            indiceColuna = iaux+1;
                            indiceLinha = contadorLinhas;
                            frase = linhas;
                            flagPalavra = true;
                            break;
                        }
                        if(linhas.charAt(i) != palavraBuscada.charAt(j)) {
                            encontrou = 0;
                            break;
                        }
                        i++;
                    }
                }
                if(flagPalavra) {
                    //System.out.println(retornaSaida(indiceLinha, indiceColuna, frase));
                    resultado.append(String.format("%nL%d C%d: %s",indiceLinha, indiceColuna, frase));
                    
                    flagPalavra = false;
                    break;
                }
            }
        }

        br.close();
        return resultado.toString();
    }

    /**
     * Método que retorna linhas e colunas
     * em formato de texto específico.
     *
     * @param linha Número da linha da palavra encontrada
     * @param coluna Número da coluna da palavrba encontrada
     * @param frase Frase em que a palavra foi encontrada
     *
     * @throws IOException se ocorrer exception de IO
     */
    public static String retornaSaida(final String enderecoArquivo, final String palavraBuscada) throws IOException {
        
        StringBuilder saida = new StringBuilder();
        saida.append(contaOcorrencias(enderecoArquivo, palavraBuscada));
        saida.append(contarLinhasEColunas(enderecoArquivo, palavraBuscada));

        return saida.toString();
    }
}
