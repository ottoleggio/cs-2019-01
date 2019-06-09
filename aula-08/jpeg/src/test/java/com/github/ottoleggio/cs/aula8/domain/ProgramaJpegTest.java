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
        assertTrue(VerificaFormato.confereByteJpeg(getFilename("imagemTrue1.jpg")));
        assertTrue(VerificaFormato.confereByteJpeg(getFilename("imagemTrue2.jpg")));
    }

    @Test
    void testOutrosFormatos() throws IOException {  
        assertFalse(VerificaFormato.confereByteJpeg(getFilename("textoFalse.txt")));
        assertFalse(VerificaFormato.confereByteJpeg(getFilename("gifFalse.gif")));
    }

    @Test
    void testArquivoIncorreto() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> VerificaFormato.confereByteJpeg(getFilename("vazio.txt")));
        assertThrows(IllegalArgumentException.class,() -> VerificaFormato.confereByteJpeg("a.txt"));
    }

    @Test
    void testRetorno() throws IOException {
        assertEquals("O arquivo é um Jpeg.", VerificaFormato.seJpeg(
                VerificaFormato.confereByteJpeg(getFilename("imagemTrue1.jpg"))));
        assertEquals("O arquivo não é um Jpeg.", VerificaFormato.seJpeg(
                VerificaFormato.confereByteJpeg(getFilename("textoFalse.txt"))));
    }
}
