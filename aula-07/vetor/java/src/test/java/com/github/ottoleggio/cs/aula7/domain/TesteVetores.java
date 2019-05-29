package com.github.ottoleggio.cs.aula7.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteVetores {

	@Test
	void testMenorTemp() {
		double[] test1 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 8, 0 };
		assertEquals(Vetores.menorTemp(test1),0);
		
		double[] test2 = { 3, 2, 5, 3, 8, -1, 4, 9, 8, 8, 0 };
		assertEquals(Vetores.menorTemp(test2),-1);
	}

	@Test
	void testSomaImpares() {
		int[] test1 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 8, 0 };
		assertEquals(Vetores.somaImpares(test1),20);
	}

	@Test
	void testContaLetras() {
		assertEquals(Vetores.contaLetras("octavio aug   s"),11);
		assertEquals(Vetores.contaLetras("octavioaugs"),11);
	}

}
