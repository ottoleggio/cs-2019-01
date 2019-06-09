package com.github.ottoleggio.cs.aula8.domain;

import java.io.BufferedReader;
import java.io.DataInputStream;
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
    public static int contaOcorrencias(final String enderecoArquivo, final String palavraBuscada) throws IOException {
        File teste = new File(enderecoArquivo);
        if (!teste.exists()) {
            throw new IllegalArgumentException("O arquivo não"
        + " existe");
        }

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
            if (linhas.isEmpty()) {
                break;
            }
        }

        br.close();

        return ocorrencias;
    }

    public static void contarLinhasEColunas(final String enderecoArquivo, final String palavraBuscada) throws IOException {
        File teste = new File(enderecoArquivo);
        if (!teste.exists()) {
            throw new IllegalArgumentException("O arquivo não"
        + " existe");
        }

        if (teste.length() == 0) {
            throw new IllegalArgumentException("O arquivo não contem"
        + " dados suficientes.");
        }

        FileInputStream fis = new FileInputStream(enderecoArquivo);
        DataInputStream dis = new DataInputStream(fis);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linhas;
        String palavras[];
        int indiceLinha = 0;
        int indiceColuna = 0;
        int iaux = 0;
        int contadorLinhas = 0;
        int encontrou = 0;
        boolean flagPalavra = false;
        String frase = null;
        
        while ((linhas = br.readLine()) != null) {
            contadorLinhas++;
            
            for (int i = 0; i < linhas.length(); i++) {
                encontrou = 0;
                if(flagPalavra) {
                    System.out.println(retornaSaida(indiceLinha, indiceColuna, frase));
                    flagPalavra = false;
                    break;
                }
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
            }
            if (linhas.isEmpty()) {
                break;
            }
        }

        br.close();
    }
    
    public static String retornaSaida(int linha, int coluna, String frase) {
        return "L" + linha + " C" + coluna + ": " + frase;
    }
}
