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

}
