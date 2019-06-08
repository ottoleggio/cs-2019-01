package com.github.ottoleggio.cs.aula8.domain;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class ImprimeHexa {

	/**
	 * Método construtor da classe.
	 */
	private ImprimeHexa() {

	}

	/**
	 * Método que retorna os primeiros quatro bytes em formato
	 * hexadecimal de um arquivo enviado como parâmetro.
	 *
	 * @param enderecoArquivo Endereço do arquivo a ser lido
	 *
	 * @return String contendo os primeiros quatro bytes em
	 * formato hexadecimal
	 */
	public static String leByteFile(String enderecoArquivo) throws IOException {
		File teste = new File(enderecoArquivo);
		if (!teste.exists()) {
			throw new IllegalArgumentException("O arquivo não"
					+ " existe");
		}
		if (teste.length() < 4) {
			throw new IllegalArgumentException("O arquivo não contem"
					+ " dados suficientes.");
		}

		FileInputStream fis = new FileInputStream(enderecoArquivo);
		DataInputStream dis = new DataInputStream(fis);

		int valor = dis.readInt();

		dis.close();
		return Integer.toHexString(valor);
	}
}
