package com.github.ottoleggio.cs.aula8.domain;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe responsável pelo método leByteFile.
 */
public final class ImprimeHexaUtils {

    /**
     * Método construtor da classe.
     */
    private ImprimeHexaUtils() {

    }

    /**
     * Método que retorna os primeiros quatro bytes em formato hexadecimal de um
     * arquivo enviado como parâmetro.
     *
     * @param enderecoArquivo Endereço do arquivo a ser lido
     *
     * @return String contendo os primeiros quatro bytes em formato hexadecimal
     * @throws IOException se ocorrer exception de IO
     */
    public static String leByteFile(final String enderecoArquivo)
            throws IOException {
        final File teste = new File(enderecoArquivo);
        if (!teste.exists()) {
            throw new IllegalArgumentException("O arquivo não existegetgetget");
        }

        final int limiteBytes = 4;
        if (teste.length() < limiteBytes) {
            throw new IllegalArgumentException(
                    "O arquivo não contem" + " dados suficientes.");
        }

        final InputStream fis = Files
                .newInputStream(Paths.get(enderecoArquivo));
        final DataInputStream dis = new DataInputStream(fis);

        final int valor = dis.readInt();

        dis.close();
        return Integer.toHexString(valor);
    }
}
