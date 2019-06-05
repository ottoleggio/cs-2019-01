package com.github.ottoleggio.cs.aula8.domain;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ImprimeHexa {
	
	public static void leArquivo(String arquivo) throws IOException {
		FileInputStream fis = new FileInputStream(arquivo);
		DataInputStream dis = new DataInputStream(fis);

		int valor = dis.readInt();

		System.out.println(Integer.toHexString(valor));
		dis.close();
	}
}
