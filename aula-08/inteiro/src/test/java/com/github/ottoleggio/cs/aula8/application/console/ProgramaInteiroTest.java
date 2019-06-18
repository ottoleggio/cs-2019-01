package com.github.ottoleggio.cs.aula8.application.console;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import com.github.ottoleggio.cs.aula8.domain.ImprimeHexaUtils;

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
                ImprimeHexaUtils.leByteFile(getFilename("436f6e73.txt")));
    }

    @Test
    void testImprimeClass() throws IOException {
        assertEquals("cafebabe",
                ImprimeHexaUtils.leByteFile(getFilename("cafebabe.class")));
    }

    @Test
    void testArquivoIncorreto() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> ImprimeHexaUtils.leByteFile(getFilename("vazio.txt")));
        assertThrows(IllegalArgumentException.class,() -> ImprimeHexaUtils.leByteFile(getFilename("duas_letras.txt")));
        assertThrows(IllegalArgumentException.class,() -> ImprimeHexaUtils.leByteFile("a.txt"));
    }

    @Test
    void testMain() throws IOException {
        String[] args = {getFilename("436f6e73.txt")};
        ProgramaInteiro.main(args);
    }
}
