package com.github.ottoleggio.cs.aula8.domain;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe responsável pelos métodos confereByteJpeg,
 * seJpeg.
 */
public final class VerificaFormatoUtils {

    /**
     * Tamanho do vetor que armazena as linhas
     * do arquivo.
     */
    private static final int TAMANHOLINHA = 1024;
    /**
     * Primeiro byte que identifica Jpeg.
     */
    private static final int ULTIMOBYTEJPEG = 0xffffffd9;
    /**
     * Último byte que identifica Jpeg.
     */
    private static final int PRIMEIROBYTEJPEG = 0xffd8ffe0;

    /**
     * Método construtor da classe.
     */
    private VerificaFormatoUtils() {

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
    public static boolean confereByteJpeg(final String enderecoArquivo) throws IOException {
        final File teste = new File(enderecoArquivo);
        if (!teste.exists()) {
            throw new IllegalArgumentException("O arquivo não"
        + " existe");
        }
        //System.out.println("tamanho = " + teste.length());
        if (teste.length() == 0) {
            throw new IllegalArgumentException("O arquivo não contem"
        + " dados suficientes.");
        }

        final InputStream fis = Files.newInputStream(Paths.get(enderecoArquivo));
        final DataInputStream dis = new DataInputStream(fis);
        final InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        final BufferedReader br = new BufferedReader(isr);

        boolean isJpeg = false;
        final int valor = dis.readInt();

        if (valor == PRIMEIROBYTEJPEG) {
            isJpeg = true;
        }

        int readBytes;
        int byteFinal = 0;
        final byte[] data = new byte[TAMANHOLINHA];

        readBytes = fis.read(data);
        while (readBytes != -1) {
            byteFinal = readBytes - 1;
            readBytes = fis.read(data);
        }

        if (data[byteFinal] == ULTIMOBYTEJPEG) {
            isJpeg = true;
        }
        br.close();
        dis.close();
        return isJpeg;
    }

    /**
     * Método que auxilia na formatação de retorno do
     * método main.
     *
     * @param checkJpeg Booleando identificando a
     * validação do arquivo pelo programa.
     *
     * @return Retorna True se o formato do arquivo for JPEG e
     * False caso contrário
     * @throws IOException se ocorrer exception de IO
     */
    public static String seJpeg(final boolean checkJpeg) {
        if (checkJpeg) {
            return "O arquivo é um Jpeg.";
        } else {
            return "O arquivo não é um Jpeg.";
        }
    }
}
