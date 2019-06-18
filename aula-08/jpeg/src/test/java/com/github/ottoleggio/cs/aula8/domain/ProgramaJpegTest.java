package com.github.ottoleggio.cs.aula8.domain;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.github.ottoleggio.cs.aula8.application.console.ProgramaJpeg;

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
        assertTrue(VerificaFormatoUtils.confereByteJpeg(getFilename("imagemTrue1.jpg")));
        assertTrue(VerificaFormatoUtils.confereByteJpeg(getFilename("imagemTrue2.jpg")));
    }

    @Test
    void testOutrosFormatos() throws IOException {  
        assertFalse(VerificaFormatoUtils.confereByteJpeg(getFilename("textoFalse.txt")));
        assertFalse(VerificaFormatoUtils.confereByteJpeg(getFilename("gifFalse.gif")));
    }

    @Test
    void testArquivoIncorreto() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> VerificaFormatoUtils.confereByteJpeg(getFilename("vazio.txt")));
        assertThrows(IllegalArgumentException.class,() -> VerificaFormatoUtils.confereByteJpeg("a.txt"));
    }

    @Test
    void testRetorno() throws IOException {
        assertEquals("O arquivo é um Jpeg.", VerificaFormatoUtils.seJpeg(
                VerificaFormatoUtils.confereByteJpeg(getFilename("imagemTrue1.jpg"))));
    /*    assertEquals("O arquivo não é um Jpeg.", VerificaFormato.seJpeg(
                VerificaFormato.confereByteJpeg(getFilename("textoFalse.txt"))));*/
    }

    @Test
    void testCorrompido() throws IOException {
        assertEquals("O arquivo não é um Jpeg.", VerificaFormatoUtils.seJpeg(
                VerificaFormatoUtils.confereByteJpeg(getFilename("teste.txt"))));
    }

    @Test
    void testMain() throws IOException {
        String[] args = {getFilename("imagemTrue1.jpg")};
        ProgramaJpeg.main(args);
    }
}
