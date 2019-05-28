package com.github.ottoleggio.cs.aula1.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAlgoritmos {

	@Test
    public void testCobertura() {
        assertNotNull(new Algoritmos());
	}

	@Test
	void testNumero3025() {
		assertTrue(Algoritmos.numero3025(3025));
		assertFalse(Algoritmos.numero3025(3024));
	}

	@Test
	void testExcepNumero3025() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.numero3025(-1));
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.numero3025(10000));
	}

	@Test
	void testNumero153() {
		assertTrue(Algoritmos.numero153(153));
		assertFalse(Algoritmos.numero153(154));
	}

	@Test
	void testExepNumero153() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.numero153(99));
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.numero153(1020));
	}

	@Test
	void testDiaDaSemana() {
		assertEquals(Algoritmos.diaDaSemana(14, 5, 2019), 1);
		assertEquals(Algoritmos.diaDaSemana(9, 5, 2017), 1);
		assertEquals(Algoritmos.diaDaSemana(9, 1, 2017), 0);
		assertEquals(Algoritmos.diaDaSemana(9, 2, 2017), 3);
	}

	@Test
	void testExcepDiaDaSemana() {
        Exception exp = assertThrows(IllegalArgumentException.class,() -> Algoritmos.diaDaSemana(0,12,2019));
		assertTrue(exp.getMessage().contains("dia"));
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.diaDaSemana(40,12,2019));
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.diaDaSemana(10,13,2019));
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.diaDaSemana(10,0,2019));
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.diaDaSemana(10,12,1750));
	}

	@Test
	void testMod() {
		assertEquals(Algoritmos.mod(11, 10), 1);
		assertEquals(Algoritmos.mod(10, 10), 0);
	}

	@Test
	void testExcepMod() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.mod(11,0));
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.mod(-1,10));
	}

	@Test
	void testSomaNaturais() {
		assertEquals(Algoritmos.somaNaturais(2), 3);
		assertEquals(Algoritmos.somaNaturais(1), 1);
	}

	@Test
	void testExcepSomaNaturais() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.somaNaturais(0));
	}

	@Test
	void testFatorial() {
		assertEquals(Algoritmos.fatorial(5), 120);
	}

	@Test
	void testExcepFatorial() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.fatorial(0));
	}

	@Test
	void testProduto() {
		assertEquals(Algoritmos.produto(5, 2),10);
	}

	@Test
	void testExcepProduto() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.produto(-1,1));	
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.produto(1,-1));	
	}

	@Test
	void testPotencia() {
		assertEquals(Algoritmos.potencia(5, 2),25);
	}

	@Test
	void testExcepPotencia() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.potencia(-1,1));
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.potencia(1,-1));
	}
	
	@Test
	void testPi() {
		assertEquals(3.1425916543395442, Algoritmos.pi(1000));
	}

	@Test
	void testExcepPi() {
		assertThrows(IllegalArgumentException.class,() -> Algoritmos.pi(0));
	}

	@Test
	void testLogaritmoNatural() {
		assertEquals(5.0, Algoritmos.logaritmoNatural(2, 2));
	}

	@Test
	void testExcepLogaritmoNatural() {
		assertThrows(IllegalArgumentException.class,() -> Algoritmos.logaritmoNatural(-1.0 , 3.0));
		assertThrows(IllegalArgumentException.class,() -> Algoritmos.logaritmoNatural(2.0 , -3.0));
	}

	@Test
	void testRazaoAurea() {
		assertEquals(1.6180339887498947, Algoritmos.razaoAurea(1, 2, 1000));
	}

	@Test
	void testExcepRazaoAurea() {
		assertThrows(IllegalArgumentException.class,() -> Algoritmos.razaoAurea(-1,1,0));
		assertThrows(IllegalArgumentException.class,() -> Algoritmos.razaoAurea(1,0,0));
		assertThrows(IllegalArgumentException.class,() -> Algoritmos.razaoAurea(1,2,-1));
	}

	@Test
	void testQuadradoPerfeito() {
		assertTrue(Algoritmos.quadradoPerfeito(25));
		assertFalse(Algoritmos.quadradoPerfeito(24));
	}

	@Test
	void testExcepQuadradoPerfeito() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.quadradoPerfeito(0));
	}

	@Test
	void testRaiz() {
        assertEquals(2.0, Algoritmos.raiz(4, 100));
	}

	@Test
	void testExcepRaiz() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.raiz(-1,2));
	}

	@Test
	void testPrimo() {
		assertTrue(Algoritmos.primo(3));
		assertTrue(Algoritmos.primo(19));
		assertTrue(Algoritmos.primo(229));
		assertFalse(Algoritmos.primo(4));
		assertFalse(Algoritmos.primo(192));
	}

	@Test
	void testExcepPrimo() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.primo(-1));
	}

	@Test
	void testCrivoEratostenes() {
		int[] test1 = new int[19];
		for (int i = 1; i < 19; i++) {
			test1[i] = 0;
		}
        assertEquals(true, Algoritmos.crivoEratostenes(test1));
        
		int[] test2 = new int[18];
		for (int i = 1; i < 18; i++) {
			test2[i] = 0;
		}
        assertEquals(false, Algoritmos.crivoEratostenes(test2));
	}
	
	@Test
	void testExcepCrivoEratostenes() {
		int[] test2 = new int[1];
			test2[0] = 0;

        assertThrows(IllegalArgumentException.class,() -> Algoritmos.crivoEratostenes(test2));
	}

	@Test
	void testMdc() {
        assertEquals(5.0, Algoritmos.mdc(95, 50));
	}

	@Test
	void testExcepMdc() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.mdc(3,0));
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.mdc(3,4));
	}

	@Test
	void testMdc2() {
        assertEquals(5.0, Algoritmos.mdc2(95, 50));
	}

	@Test
	void testExcepMdc2() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.mdc2(3,0));
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.mdc2(3,4));
	}

	@Test
	void testHorner() {
		int[] test1 = {0,1,2};
        assertEquals(12, Algoritmos.horner(1, test1));
 	}

	@Test
	void testExcepHorner() {
		int[] test1 = {0,1,2};
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.horner(0,test1));
 	}

	@Test
	void testFibonacci() {
        assertEquals(8, Algoritmos.fibonacci(6));
        assertEquals(1, Algoritmos.fibonacci(1));
        assertEquals(1, Algoritmos.fibonacci(0));
	}

	@Test
	void testExcepFibonacci() {
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.fibonacci(-1));
	}

	@Test
	void testDigitoCPF() {
		int[] cpf1 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 0 };
		assertTrue(Algoritmos.digitoCPF(cpf1));

		int[] cpf2 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 3 };
		assertFalse(Algoritmos.digitoCPF(cpf2));

		int[] cpf3 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 8, 0 };
		assertFalse(Algoritmos.digitoCPF(cpf3));
	}

	@Test
	void testExcepDigitoCPF() {
		int[] test1 = { 3 };
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.digitoCPF(test1));
		
		int[] test2 = { 3,2,3,4,5,6,7,8,9,0,1,2 };
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.digitoCPF(test2));
		
		int[] test3 = { 3,2,3,4,5,6,7,8,9,0,10 };
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.digitoCPF(test3));
		
		int[] test4 = { 3,2,3,4,5,6,7,8,9,0,-1 };
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.digitoCPF(test4));
	}

	@Test
	void testDigitoCPF2() {
		int[] cpf1 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 0 };
		assertTrue(Algoritmos.digitoCPF2(cpf1));
		
		int[] cpf2 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 7, 3 };
		assertFalse(Algoritmos.digitoCPF2(cpf2));
		
		int[] cpf3 = { 3, 2, 5, 3, 8, 6, 4, 9, 8, 8, 0 };
		assertFalse(Algoritmos.digitoCPF2(cpf3));
	}

	@Test
	void testExcepDigitoCPF2() {
		int[] test1 = { 3 };
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.digitoCPF2(test1));
		
		int[] test2 = { 3,2,3,4,5,6,7,8,9,0,1,2 };
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.digitoCPF2(test2));
		
		int[] test3 = { 3,2,3,4,5,6,7,8,9,0,10 };
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.digitoCPF2(test3));
		
		int[] test4 = { 3,2,3,4,5,6,7,8,9,0,-1 };
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.digitoCPF2(test4));
	}
}
