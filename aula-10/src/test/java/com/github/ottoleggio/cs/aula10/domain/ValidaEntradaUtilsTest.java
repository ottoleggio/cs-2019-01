package com.github.ottoleggio.cs.aula10.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidaEntradaUtilsTest {
    
    String[] teste1 = {"2010101", "1", "23450101", "1"};
    String[] teste2 = {"100000101", "", "23450101", "1"};
    String[] teste3 = {"20161301", "", "23450101", "1"};
    String[] teste4 = {"20160001", "", "23450101", "1"};
    String[] teste5 = {"20160931", "", "23450101", "1"};
    String[] teste6 = {"20160900", "", "23450101", "1"};
    String[] teste7 = {"", "0", "23450101", "1"};
    String[] teste8 = {"", "-1", "23450101", "1"};
    String[] teste9 = {"", "", "20191232", "1"};
    String[] teste10 = {"", "", "23450101", "-1"};
    String[] teste11 = {"", "", "23450101", "7"};
    String[] teste12 = {"20160928", "2016", "20160928", "2"};
    String[] teste13 = {"20160301", "2016", "20160228", "6"};
    String[] teste14 = {"20160331", "2018", "20160331", "3"};
    String[] teste15 = {"2018", "20160331", "3"};
    String[] teste16 = {"a", "2018", "20160331", "3"};
    String[] teste17 = {"20160331", "2018", "20160331", "-3"};
    String[] teste18 = {"20160331", "2018", "20160331", "7"};
    String[] teste19 = {"20160331", "0", "20160331", "3"};
    String[] teste20 = {"20160331", "2018", "20160332", "3"};

    @Test
    void testQtdArgCheck() {
        assertEquals(-1, ValidaEntradaUtils.qtdArgCheck(teste15));
    }

    @Test
    void testSeInteiro() {
        assertEquals(-1, ValidaEntradaUtils.seInteiro(teste16));
        assertEquals(-1, ValidaEntradaUtils.seInteiro(teste17));
    }

    @Test
    void testLimiteSemanaCheck() {
        assertEquals(-1, ValidaEntradaUtils.limiteSemanaCheck(7));
    }

    @Test
    void testAnoBissextoCheck() {
        assertEquals(-1, ValidaEntradaUtils.anoBissextoCheck(0));
    }

    @Test
    void testDataInvalida() {
        assertEquals(-1, ValidaEntradaUtils.dataInvalida("00190615"));
        assertEquals(-1, ValidaEntradaUtils.dataInvalida("20190015"));
        assertEquals(-1, ValidaEntradaUtils.dataInvalida("20191315"));
        assertEquals(-1, ValidaEntradaUtils.dataInvalida("20190600"));
        assertEquals(-1, ValidaEntradaUtils.dataInvalida("20190632"));
    }

    @Test
    void testValidadorEntrada() {
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste1));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste2));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste3));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste4));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste5));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste6));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste7));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste8));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste9));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste10));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste11));
        assertEquals(1, ValidaEntradaUtils.validadorEntrada(teste12));
        assertEquals(1, ValidaEntradaUtils.validadorEntrada(teste13));
        assertEquals(1, ValidaEntradaUtils.validadorEntrada(teste14));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste15));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste18));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste19));
        assertEquals(-1, ValidaEntradaUtils.validadorEntrada(teste20));
    }

}
