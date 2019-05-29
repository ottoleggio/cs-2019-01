package com.github.ottoleggio.cs.aula7.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FrequenciaAleatoriaTest {

	@Test
	void testGeraAleatorio() {
		ArrayList<Integer> resultadoEsperado1 = new ArrayList<Integer>();
		resultadoEsperado1.add(0);
		assertEquals(resultadoEsperado1, FrequenciaAleatoria.geraAleatorio(1,0));
		
		ArrayList<Integer> resultadoEsperado2 = new ArrayList<Integer>();
		resultadoEsperado2.add(0);
		resultadoEsperado2.add(0);
		resultadoEsperado2.add(0);
		assertEquals(resultadoEsperado2, FrequenciaAleatoria.geraAleatorio(3,0));
		
	}
	
	@Test
	void testEncontraFrequente() {
		ArrayList<Integer> test1 = new ArrayList<Integer>();
		test1.add(50);
		test1.add(10);
		test1.add(10);
		test1.add(50);
		test1.add(20);
		ArrayList<Integer> resultadoEsperado = new ArrayList<Integer>();
		resultadoEsperado.add(2);
		resultadoEsperado.add(10);
		resultadoEsperado.add(50);
		assertEquals(resultadoEsperado, FrequenciaAleatoria.encontraFrequente(test1));
	}

}
