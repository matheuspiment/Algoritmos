package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class SomaNaturaisTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEntradaInvalida() {
        SomaNaturais.somaNaturais(0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(1, SomaNaturais.somaNaturais(1));
        Assert.assertEquals(3, SomaNaturais.somaNaturais(2));
        Assert.assertEquals(6, SomaNaturais.somaNaturais(3));
        Assert.assertEquals(55, SomaNaturais.somaNaturais(10));
    }

    @Test
    public void testCasosNaoTriviais() {
        Assert.assertEquals(25 * 26 / 2, SomaNaturais.somaNaturais(25));
        Assert.assertEquals(50 * 51 / 2, SomaNaturais.somaNaturais(50));
        Assert.assertEquals(500 * 501 / 2, SomaNaturais.somaNaturais(500));
        Assert.assertEquals(2500 * 2501 / 2, SomaNaturais.somaNaturais(2500));
    }
}