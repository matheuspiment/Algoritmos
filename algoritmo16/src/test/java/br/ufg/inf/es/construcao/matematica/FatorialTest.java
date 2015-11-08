package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class FatorialTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Fatorial.fatorial(0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(6, Fatorial.fatorial(3));
        Assert.assertEquals(6 * 5 * 4 * 3 * 2, Fatorial.fatorial(6));
        Assert.assertEquals(5040, Fatorial.fatorial(7));
        Assert.assertEquals(3628800, Fatorial.fatorial(10));
    }
}