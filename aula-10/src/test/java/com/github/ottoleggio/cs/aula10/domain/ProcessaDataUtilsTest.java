package com.github.ottoleggio.cs.aula10.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProcessaDataUtilsTest {

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

    @Test
    void testExtraiDia() {
        fail("Not yet implemented");
    }

    @Test
    void testExtraiMes() {
        fail("Not yet implemented");
    }

    @Test
    void testExtraiAno() {
        fail("Not yet implemented");
    }

    @Test
    void testSeBissexto() {
        assertTrue(ProcessaDataUtils.seBissexto(2015, 2015));
        assertTrue(ProcessaDataUtils.seBissexto(2019, 2015));
        assertFalse(ProcessaDataUtils.seBissexto(2018, 2015));
        assertTrue(ProcessaDataUtils.seBissexto(2000, 1996));
        assertFalse(ProcessaDataUtils.seBissexto(1700, 1692));
    }

    @Test
    void testUltimoDiaDoMes() {
        assertEquals(31, ProcessaDataUtils.ultimoDiaDoMes(1, 2015, 2015));
        assertEquals(29, ProcessaDataUtils.ultimoDiaDoMes(2, 2015, 2015));
        assertEquals(28, ProcessaDataUtils.ultimoDiaDoMes(2, 2015, 2014));
        assertEquals(29, ProcessaDataUtils.ultimoDiaDoMes(2, 1999, 1995));
        assertEquals(31, ProcessaDataUtils.ultimoDiaDoMes(3, 2015, 2015));
        assertEquals(30, ProcessaDataUtils.ultimoDiaDoMes(4, 2015, 2015));
        assertEquals(31, ProcessaDataUtils.ultimoDiaDoMes(5, 2015, 2015));
        assertEquals(30, ProcessaDataUtils.ultimoDiaDoMes(6, 2015, 2015));
        assertEquals(31, ProcessaDataUtils.ultimoDiaDoMes(7, 2015, 2015));
        assertEquals(31, ProcessaDataUtils.ultimoDiaDoMes(8, 2015, 2015));
        assertEquals(30, ProcessaDataUtils.ultimoDiaDoMes(9, 2015, 2015));
        assertEquals(31, ProcessaDataUtils.ultimoDiaDoMes(10, 2015, 2015));
        assertEquals(30, ProcessaDataUtils.ultimoDiaDoMes(11, 2015, 2015));
        assertEquals(31, ProcessaDataUtils.ultimoDiaDoMes(12, 2015, 2015));
        assertEquals(0, ProcessaDataUtils.ultimoDiaDoMes(0, 2015, 2015));
    }

    @Test
    void testQualDataMaior() {
        assertEquals(0, ProcessaDataUtils.qualDataMaior("20180215", "20180215"));
        assertEquals(1, ProcessaDataUtils.qualDataMaior("20180215", "20180216"));
        assertEquals(-1, ProcessaDataUtils.qualDataMaior("20180215", "20180214"));
        assertEquals(1, ProcessaDataUtils.qualDataMaior("20180215", "20180315"));
        assertEquals(-1, ProcessaDataUtils.qualDataMaior("20180215", "20180114"));
        assertEquals(1, ProcessaDataUtils.qualDataMaior("20180215", "20190215"));
        assertEquals(-1, ProcessaDataUtils.qualDataMaior("20180215", "20170214"));
    }

    @Test
    void testExecutaPrograma() {
        assertEquals(-1, ProcessaDataUtils.executaPrograma("2010101", "1", "23450101", "1"));
        assertEquals(-1, ProcessaDataUtils.executaPrograma("100000101", "", "23450101", "1"));
        assertEquals(-1, ProcessaDataUtils.executaPrograma("20161301", "", "23450101", "1"));
        assertEquals(-1, ProcessaDataUtils.executaPrograma("20160001", "", "23450101", "1"));
        assertEquals(-1, ProcessaDataUtils.executaPrograma("20160931", "", "23450101", "1"));
        assertEquals(-1, ProcessaDataUtils.executaPrograma("20160900", "", "23450101", "1"));
        assertEquals(-1, ProcessaDataUtils.executaPrograma("", "0", "23450101", "1"));
        assertEquals(-1, ProcessaDataUtils.executaPrograma("", "-1", "23450101", "1"));
        assertEquals(-1, ProcessaDataUtils.executaPrograma("", "", "20191232", "1"));
        assertEquals(-1, ProcessaDataUtils.executaPrograma("", "", "23450101", "-1"));
        assertEquals(-1, ProcessaDataUtils.executaPrograma("", "", "23450101", "7"));
        assertEquals(2, ProcessaDataUtils.executaPrograma("20160928", "2016", "20160928", "2"));
        assertEquals(1, ProcessaDataUtils.executaPrograma("20160301", "2016", "20160228", "6"));
        assertEquals(3, ProcessaDataUtils.executaPrograma("20160331", "2018", "20160331", "3"));
        assertEquals(6, ProcessaDataUtils.executaPrograma("20160131", "2016", "20160331", "3"));
    }
}
