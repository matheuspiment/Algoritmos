package br.ufg.inf.es.construcao.matematica;

import org.junit.Assert;
import org.junit.Test;

public class RaizQuadradaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() {
        RaizQuadrada.raizQuadrada(0, 2);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(2.2360, RaizQuadrada.raizQuadrada(5, 3), 0.001);
        Assert.assertEquals(3, RaizQuadrada.raizQuadrada(9, 3), 0.01);
        Assert.assertEquals(4, RaizQuadrada.raizQuadrada(16, 3), 0.01);
        Assert.assertEquals(5, RaizQuadrada.raizQuadrada(25, 4), 0.01);
        Assert.assertEquals(10, RaizQuadrada.raizQuadrada(100, 5), 0.01);
        Assert.assertEquals(50, RaizQuadrada.raizQuadrada(2500, 10), 0.01);
    }
}