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
        assertTrue(ProcessaDataUtils.SeBissexto(2015, 2015));
        assertTrue(ProcessaDataUtils.SeBissexto(2019, 2015));
        assertFalse(ProcessaDataUtils.SeBissexto(2018, 2015));
        assertTrue(ProcessaDataUtils.SeBissexto(2000, 1996));
        assertFalse(ProcessaDataUtils.SeBissexto(1700, 1692));
    }

    @Test
    void testUltimoDiaDoMes() {
        assertEquals(31, ProcessaDataUtils.UltimoDiaDoMes(1, 2015, 2015));
        assertEquals(29, ProcessaDataUtils.UltimoDiaDoMes(2, 2015, 2015));
        assertEquals(28, ProcessaDataUtils.UltimoDiaDoMes(2, 2015, 2014));
        assertEquals(29, ProcessaDataUtils.UltimoDiaDoMes(2, 1999, 1995));
        assertEquals(31, ProcessaDataUtils.UltimoDiaDoMes(3, 2015, 2015));
        assertEquals(30, ProcessaDataUtils.UltimoDiaDoMes(4, 2015, 2015));
        assertEquals(31, ProcessaDataUtils.UltimoDiaDoMes(5, 2015, 2015));
        assertEquals(30, ProcessaDataUtils.UltimoDiaDoMes(6, 2015, 2015));
        assertEquals(31, ProcessaDataUtils.UltimoDiaDoMes(7, 2015, 2015));
        assertEquals(31, ProcessaDataUtils.UltimoDiaDoMes(8, 2015, 2015));
        assertEquals(30, ProcessaDataUtils.UltimoDiaDoMes(9, 2015, 2015));
        assertEquals(31, ProcessaDataUtils.UltimoDiaDoMes(10, 2015, 2015));
        assertEquals(30, ProcessaDataUtils.UltimoDiaDoMes(11, 2015, 2015));
        assertEquals(31, ProcessaDataUtils.UltimoDiaDoMes(12, 2015, 2015));
        assertEquals(0, ProcessaDataUtils.UltimoDiaDoMes(0, 2015, 2015));
    }

}
