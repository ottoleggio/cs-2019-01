package com.github.ottoleggio.cs.aula8.domain;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public final class ImprimeHexa {

	private ImprimeHexa() {

	}

	public static String leArquivo(String arquivo) throws IOException {
		FileInputStream fis = new FileInputStream(arquivo);
		DataInputStream dis = new DataInputStream(fis);

		int valor = dis.readInt();

		dis.close();
		return Integer.toHexString(valor);
	}
}
