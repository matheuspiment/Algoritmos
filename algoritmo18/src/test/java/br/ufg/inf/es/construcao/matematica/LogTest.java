package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class LogTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        Log.log(0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Log.log(1, 1);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(2.5, Log.log(1, 2), 0.1);
        Assert.assertEquals(5, Log.log(2, 2), 1);
        Assert.assertEquals(6.3333, Log.log(2, 3), 0.001);
    }
}