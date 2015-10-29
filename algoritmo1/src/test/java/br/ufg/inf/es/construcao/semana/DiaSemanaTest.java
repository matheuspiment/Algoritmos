package br.ufg.inf.es.construcao.semana;

import org.junit.Assert;
import org.junit.Test;

public class DiaSemanaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testDiaInvalido() {
        DiaSemana.diaDaSemana(0, 5, 2010);
        DiaSemana.diaDaSemana(32, 5, 2010);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMesInvalido() {
        DiaSemana.diaDaSemana(2, 0, 2010);
        DiaSemana.diaDaSemana(2, 13, 2010);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnoInvalido() {
        DiaSemana.diaDaSemana(2, 10, 500);
    }

    @Test
    public void testDiaSemanaValido() throws Exception {
        Assert.assertEquals(0, DiaSemana.diaDaSemana(1, 5, 2000));
        Assert.assertEquals(1, DiaSemana.diaDaSemana(4, 7, 1972));
        Assert.assertEquals(2, DiaSemana.diaDaSemana(11, 6, 1997));
        Assert.assertEquals(3, DiaSemana.diaDaSemana(29, 10, 2015));
        Assert.assertEquals(4, DiaSemana.diaDaSemana(12, 12, 1980));
        Assert.assertEquals(5, DiaSemana.diaDaSemana(24, 3, 1990));
        Assert.assertEquals(6, DiaSemana.diaDaSemana(19, 1, 2014));
    }
}
