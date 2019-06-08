package com.github.ottoleggio.cs.aula8.domain;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class ImprimeHexa {

	private ImprimeHexa() {

	}

	public static String leByteFile(String arquivo) throws IOException {
		File teste = new File(arquivo);
		if (!teste.exists()) {
			throw new IllegalArgumentException("O arquivo não"
					+ " existe");
		}
		if (teste.length() < 4) {
			throw new IllegalArgumentException("O arquivo não contem"
					+ " dados suficientes.");
		}

		FileInputStream fis = new FileInputStream(arquivo);
		DataInputStream dis = new DataInputStream(fis);

		int valor = dis.readInt();

		dis.close();
		return Integer.toHexString(valor);
	}
}
