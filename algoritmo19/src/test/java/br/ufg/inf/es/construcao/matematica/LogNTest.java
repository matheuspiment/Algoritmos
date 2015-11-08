package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class LogNTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        LogN.logN(0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        LogN.logN(1, 1);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(2.5, LogN.logN(1, 2), 0.1);
        Assert.assertEquals(5, LogN.logN(2, 2), 1);
        Assert.assertEquals(6.3333, LogN.logN(2, 3), 0.001);
        Assert.assertEquals(8.5, LogN.logN(3, 2), 0.1);
    }
}