package com.github.ottoleggio.cs.aula1.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExercicio {

	@Test
	void testNumero3025() {
		assertTrue(Exercicio.numero3025(3025));
        assertThrows(IllegalArgumentException.class,() -> Exercicio.numero3025(-1));
        assertThrows(IllegalArgumentException.class,() -> Exercicio.numero3025(10000));
	}

	@Test
	void testNumero153() {
		assertTrue(Exercicio.numero153(153));
        assertThrows(IllegalArgumentException.class,() -> Exercicio.numero153(99));
        assertThrows(IllegalArgumentException.class,() -> Exercicio.numero153(1020));
	}

	@Test
	void testDiaDaSemana() {
        Exception exp = assertThrows(IllegalArgumentException.class,() -> Exercicio.diaDaSemana(0,12,2019));
        assertTrue(exp.getMessage().contains("dia"));
        assertThrows(IllegalArgumentException.class,() -> Exercicio.diaDaSemana(40,12,2019));
        assertThrows(IllegalArgumentException.class,() -> Exercicio.diaDaSemana(10,13,2019));
        assertThrows(IllegalArgumentException.class,() -> Exercicio.diaDaSemana(10,12,1750));
		assertEquals(Exercicio.diaDaSemana(14, 5, 2019), 1);
		assertEquals(Exercicio.diaDaSemana(9, 5, 2017), 1);
		assertEquals(Exercicio.diaDaSemana(9, 1, 2017), 0);
		assertEquals(Exercicio.diaDaSemana(9, 2, 2017), 3);
	}

	@Test
	void testMod() {
        assertThrows(IllegalArgumentException.class,() -> Exercicio.mod(11,0));
        assertThrows(IllegalArgumentException.class,() -> Exercicio.mod(-1,10));
		assertEquals(Exercicio.mod(11, 10), 1);
		assertEquals(Exercicio.mod(10, 10), 0);
	}

	@Test
	void testSomaNaturais() {
        assertThrows(IllegalArgumentException.class,() -> Exercicio.somaNaturais(0));
		assertEquals(Exercicio.somaNaturais(2), 3);
		assertEquals(Exercicio.somaNaturais(1), 1);
	}

	@Test
	void testFatorial() {
        assertThrows(IllegalArgumentException.class,() -> Exercicio.fatorial(0));
		assertEquals(Exercicio.fatorial(5), 120);
	}

	@Test
	void testProduto() {
        assertThrows(IllegalArgumentException.class,() -> Exercicio.produto(-1,1));	
        assertThrows(IllegalArgumentException.class,() -> Exercicio.produto(1,-1));	
		assertEquals(Exercicio.produto(5, 2),10);
	}

	@Test
	void testPotencia() {
        assertThrows(IllegalArgumentException.class,() -> Exercicio.potencia(-1,1));
        assertThrows(IllegalArgumentException.class,() -> Exercicio.potencia(1,-1));
		assertEquals(Exercicio.potencia(5, 2),25);
	}
	
	@Test
	void testPi() {
		assertThrows(IllegalArgumentException.class,() -> Exercicio.pi(0));
		assertEquals(3.1425916543395442, Exercicio.pi(1000));
	}

	@Test
	void testLogaritmoNatural() {
		assertThrows(IllegalArgumentException.class,() -> Exercicio.logaritmoNatural(-1.0 , 3.0));
		assertThrows(IllegalArgumentException.class,() -> Exercicio.logaritmoNatural(2.0 , -3.0));
		assertEquals(5.0, Exercicio.logaritmoNatural(2, 2));
		
	}

	@Test
	void testRazaoAurea() {
		assertThrows(IllegalArgumentException.class,() -> Exercicio.razaoAurea(-1,1,0));
		assertThrows(IllegalArgumentException.class,() -> Exercicio.razaoAurea(1,1,0));
		assertThrows(IllegalArgumentException.class,() -> Exercicio.razaoAurea(1,2,-1));
		assertEquals(1.6180339887498947, Exercicio.razaoAurea(1, 2, 1000));
	}

	@Test
	void testQuadradoPerfeito() {
        assertThrows(IllegalArgumentException.class,() -> Exercicio.quadradoPerfeito(0));
		assertTrue(Exercicio.quadradoPerfeito(25));
		assertFalse(Exercicio.quadradoPerfeito(24));
	}

	@Test
	void testRaiz() {
        assertThrows(IllegalArgumentException.class,() -> Exercicio.raiz(-1,2));
        assertEquals(2.0, Exercicio.raiz(4, 100));
	}

	@Test
	void testPrimo() {
        assertThrows(IllegalArgumentException.class,() -> Exercicio.primo(-1));
		assertTrue(Exercicio.primo(3));
		assertTrue(Exercicio.primo(19));
		assertTrue(Exercicio.primo(229));
		assertFalse(Exercicio.primo(4));
		assertFalse(Exercicio.primo(192));
	}

	@Test
	void testCrivoEratostenes() {
		int[] test1 = new int[19];
		for (int i = 1; i < 19; i++) {
			test1[i] = 0;
		}
     //   assertThrows(IllegalArgumentException.class,() -> Exercicio.crivoEratostenes(test1));
        assertEquals(true, Exercicio.crivoEratostenes(test1));
	}
	
	@Test
	void testCrivoEratostenesVazio() {
		int[] test2 = new int[1];
			test2[0] = 0;

        assertThrows(IllegalArgumentException.class,() -> Exercicio.crivoEratostenes(test2));

	}

	@Test
	void testMdc() {
        assertThrows(IllegalArgumentException.class,() -> Exercicio.mdc(3,0));
        assertThrows(IllegalArgumentException.class,() -> Exercicio.mdc(3,4));
        assertEquals(5.0, Exercicio.mdc(95, 50));
	}

	@Test
	void testMdc2() {
        assertThrows(IllegalArgumentException.class,() -> Exercicio.mdc2(3,0));
        assertThrows(IllegalArgumentException.class,() -> Exercicio.mdc2(3,4));
        assertEquals(5.0, Exercicio.mdc2(95, 50));
	}

	@Test
	void testHorner() {
		int[] test1 = {0,1,2};
        assertThrows(IllegalArgumentException.class,() -> Exercicio.horner(0,test1));
        assertEquals(12, Exercicio.horner(1, test1));
 	}

	@Test
	void testFibonacci() {
        assertThrows(IllegalArgumentException.class,() -> Exercicio.fibonacci(-1));
        assertEquals(8, Exercicio.fibonacci(6));
        assertEquals(1, Exercicio.fibonacci(1));
	}

	@Test
	void testDigitoCPF() {
		int[] test1 = { 3 };
        assertThrows(IllegalArgumentException.class,() -> Exercicio.digitoCPF(test1));
		int[] test2 = { 3,2,3,4,5,6,7,8,9,0,1,2 };
        assertThrows(IllegalArgumentException.class,() -> Exercicio.digitoCPF(test2));
		int[] test3 = { 3,2,3,4,5,6,7,8,9,0,10 };
        assertThrows(IllegalArgumentException.class,() -> Exercicio.digitoCPF(test3));
		int[] test4 = { 3,2,3,4,5,6,7,8,9,0,-1 };
        assertThrows(IllegalArgumentException.class,() -> Exercicio.digitoCPF(test4));
		
		int[] cpf1 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 0 };
		assertTrue(Exercicio.digitoCPF(cpf1));
		
		int[] cpf2 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 3 };
		assertFalse(Exercicio.digitoCPF(cpf2));
		
		int[] cpf3 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 8, 0 };
		assertFalse(Exercicio.digitoCPF(cpf3));
	}

	@Test
	void testDigitoCPF2() {
		int[] test1 = { 3 };
        assertThrows(IllegalArgumentException.class,() -> Exercicio.digitoCPF2(test1));
		int[] test2 = { 3,2,3,4,5,6,7,8,9,0,1,2 };
        assertThrows(IllegalArgumentException.class,() -> Exercicio.digitoCPF2(test2));
		int[] test3 = { 3,2,3,4,5,6,7,8,9,0,10 };
        assertThrows(IllegalArgumentException.class,() -> Exercicio.digitoCPF2(test3));
		int[] test4 = { 3,2,3,4,5,6,7,8,9,0,-1 };
        assertThrows(IllegalArgumentException.class,() -> Exercicio.digitoCPF2(test4));
        
		int[] cpf1 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 0 };
		assertTrue(Exercicio.digitoCPF2(cpf1));
		
		int[] cpf2 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 3 };
		assertFalse(Exercicio.digitoCPF2(cpf2));
		
		int[] cpf3 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 8, 0 };
		assertFalse(Exercicio.digitoCPF2(cpf3));
	}

}
