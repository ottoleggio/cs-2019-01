package com.github.ottoleggio.cs.aula10.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProcessaDataUtilsTest {

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

}
