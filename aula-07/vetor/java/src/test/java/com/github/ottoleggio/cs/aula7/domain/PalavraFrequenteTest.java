package com.github.ottoleggio.cs.aula7.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalavraFrequenteTest {

	@Test
	void testPalavra() {
		String test1 = "alo alo oh oh alo ih ah oh oh";
		assertEquals(PalavraFrequente.palavra(test1),"oh");
		
		String test2 = "oh";
		assertEquals(PalavraFrequente.palavra(test2),"oh");

	}

}
