package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class SomatorioTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() {
        Somatorio.somatorio(0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(0.8, Somatorio.somatorio(3), 0.1);
        Assert.assertEquals(0.944, Somatorio.somatorio(7), 0.001);
        Assert.assertEquals(1.0294, Somatorio.somatorio(21), 0.001);
        Assert.assertEquals(1.05647, Somatorio.somatorio(49), 0.0001);
    }
}