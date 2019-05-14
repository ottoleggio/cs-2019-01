package com.github.ottoleggio.cs.aula1.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExercicioTest {

	@Test
	void testNumero3025() {
		assertEquals(3025, 3025);
	}

	@Test
	void testNumero153() {
		assertEquals(153, 153);
	}

	@Test
	void testDiaDaSemana() {
		assertEquals(Exercicio.diaDaSemana(14, 05, 2019), 1);
		assertEquals(Exercicio.diaDaSemana(9, 05, 2017), 1);
	}

	@Test
	void testMod() {
		assertEquals(Exercicio.mod(11, 10), 1);
		assertEquals(Exercicio.mod(10, 10), 0);
	}

	@Test
	void testSomaNaturais() {
		assertEquals(Exercicio.somaNaturais(2), 3);
		assertEquals(Exercicio.somaNaturais(1), 1);
	}

	@Test
	void testFatorial() {
		assertEquals(Exercicio.fatorial(5), 120);
	}

	@Test
	void testProduto() {
		assertEquals(Exercicio.produto(5, 2),10);
	}

	@Test
	void testPotencia() {
		assertEquals(Exercicio.potencia(5, 2),25);
	}

	@Test
	void testPi() {
		assertEquals(Exercicio.pi(2),3.14);
	}

	@Test
	void testLogaritmoNatural() {
		assertEquals(Exercicio.logaritmoNatural(2, 2),5.0);
	}

	@Test
	void testRazaoAurea() {
		assertEquals(Exercicio.razaoAurea(2, 4, 2),1);
	}

	@Test
	void testQuadradoPerfeito() {
		assertTrue(Exercicio.quadradoPerfeito(25));
		assertFalse(Exercicio.quadradoPerfeito(24));
	}

	@Test
	void testRaiz() {
		fail("Not yet implemented");
	}

	@Test
	void testPrimo() {
		assertTrue(Exercicio.primo(3));
		assertTrue(Exercicio.primo(19));
		assertTrue(Exercicio.primo(229));
		assertFalse(Exercicio.primo(4));
		assertFalse(Exercicio.primo(192));
	}

	@Test
	void testCrivoEratostenes() {
		fail("Not yet implemented");
	}

	@Test
	void testMdc() {
		fail("Not yet implemented");
	}

	@Test
	void testMdc2() {
		fail("Not yet implemented");
	}

	@Test
	void testHorner() {
		fail("Not yet implemented");
	}

	@Test
	void testFibonacci() {
		fail("Not yet implemented");
	}

	@Test
	void testDigitoCPF() {
		int[] cpf1 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 0 };
		assertTrue(Exercicio.digitoCPF(cpf1));
		
		int[] cpf2 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 3 };
		assertFalse(Exercicio.digitoCPF(cpf2));
		
		int[] cpf3 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 8, 0 };
		assertFalse(Exercicio.digitoCPF(cpf3));
	}

	@Test
	void testDigitoCPF2() {
		int[] cpf1 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 0 };
		assertTrue(Exercicio.digitoCPF(cpf1));
		
		int[] cpf2 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 3 };
		assertFalse(Exercicio.digitoCPF(cpf2));
		
		int[] cpf3 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 8, 0 };
		assertFalse(Exercicio.digitoCPF(cpf3));
	}

}
