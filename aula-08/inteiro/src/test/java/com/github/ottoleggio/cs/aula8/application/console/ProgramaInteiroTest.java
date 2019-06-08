package com.github.ottoleggio.cs.aula8.application.console;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import com.github.ottoleggio.cs.aula8.domain.ImprimeHexa;

class ProgramaInteiroTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }

    @Test
    void testImprimeHexa() throws IOException {        
        assertEquals("436f6e73",
                ImprimeHexa.leByteFile(getFilename("436f6e73.txt")));
    }

    @Test
    void testImprimeClass() throws IOException {
        assertEquals("cafebabe",
                ImprimeHexa.leByteFile(getFilename("cafebabe.class")));
    }

    @Test
    void testArquivoIncorreto() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> ImprimeHexa.leByteFile(getFilename("vazio.txt")));
        assertThrows(IllegalArgumentException.class,() -> ImprimeHexa.leByteFile(getFilename("duas_letras.txt")));
        assertThrows(IllegalArgumentException.class,() -> ImprimeHexa.leByteFile("a.txt"));
    }
}
