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
    }

    @Test
    void testExcepContaOcorrencias() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> 
        EncontraPalavra.contaOcorrencias(getFilename("vazio.txt"), "aqui"));
    }

  /*  @Test
    void testContarLinhasEColunas() {
        fail("Not yet implemented");
    }

    @Test
    void testRetornaSaida() {
        fail("Not yet implemented");
    } */

}
