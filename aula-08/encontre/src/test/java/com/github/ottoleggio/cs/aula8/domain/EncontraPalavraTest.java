package com.github.ottoleggio.cs.aula8.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class EncontraPalavraTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }
    
    @Test
    void testContaOcorrencias() throws IOException {
        assertEquals("Encontradas: 7.",
                EncontraPalavra.contaOcorrencias(getFilename("7ocorrencias.txt"), "aqui"));
        assertEquals("Encontradas: 2.",
                EncontraPalavra.contaOcorrencias(getFilename("2ocorrenciasLinhaVazia.txt"), "aqui"));
        assertEquals("Encontradas: 2.",
                EncontraPalavra.contaOcorrencias(getFilename("umaLinha.txt"), "teste"));
        assertEquals("Encontradas: 0.",
                EncontraPalavra.contaOcorrencias(getFilename("umaLinha.txt"), ""));
        assertEquals("Encontradas: 2.",
                EncontraPalavra.contaOcorrencias(getFilename("espacoNoFim.txt"), "aqui"));
        assertEquals("Encontradas: 0.",
                EncontraPalavra.contaOcorrencias(getFilename("zeroOcorrencias.txt"), "aqui"));
    }

    @Test
    void testExcepContaOcorrencias() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> 
        EncontraPalavra.contaOcorrencias(getFilename("vazio.txt"), "aqui"));
    }

    @Test
    void testContarLinhasEColunas() throws IOException {
        String teste = "Encontradas: 2.\n" + 
                "L1 C10: frase de teste teste";
        assertEquals(teste,
                EncontraPalavra.retornaSaida(getFilename("umaLinha.txt"), "teste"));
    }

    @Test
    void testExcepContarLinhasEColunas() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> 
        EncontraPalavra.contarLinhasEColunas(getFilename("vazio.txt"), "aqui"));
    }

    @Test
    void testRetornaSaida() throws IOException {
        String teste = "Encontradas: 7.\n" + 
                "L1 C1: aqui\n" + 
                "L2 C10: testando aqui aqui aqui\n" + 
                "L3 C12: esse teste aqui\n" + 
                "L4 C1: aqui\n" + 
                "L7 C1: aqui";
        assertEquals(teste,
                EncontraPalavra.retornaSaida(getFilename("7ocorrencias.txt"), "aqui"));
    }
}
