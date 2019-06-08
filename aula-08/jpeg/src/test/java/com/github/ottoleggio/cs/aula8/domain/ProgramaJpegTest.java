package com.github.ottoleggio.cs.aula8.domain;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class ProgramaJpegTest extends TestCase {
    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }

    @Test
    void testJpegTrue() throws IOException {  
        assertTrue(VerificaFormato.seJpeg(getFilename("imagemTrue1.jpg")));
        assertTrue(VerificaFormato.seJpeg(getFilename("imagemTrue2.jpg")));
    }

    @Test
    void testOutrosFormatos() throws IOException {  
        assertFalse(VerificaFormato.seJpeg(getFilename("textoFalse.txt")));
        assertFalse(VerificaFormato.seJpeg(getFilename("gifFalse.gif")));
    }

    @Test
    void testArquivoIncorreto() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> VerificaFormato.seJpeg(getFilename("vazio.txt")));
        assertThrows(IllegalArgumentException.class,() -> VerificaFormato.seJpeg("a.txt"));
    }
}
