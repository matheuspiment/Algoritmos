package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class ModSimplesTest {
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        ModSimples.modSimples(0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws  Exception {
        ModSimples.modSimples(1, 0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(0, ModSimples.modSimples(1, 1));
        Assert.assertEquals(2, ModSimples.modSimples(5, 3));
        Assert.assertEquals(0, ModSimples.modSimples(4, 2));
        Assert.assertEquals(6, ModSimples.modSimples(27, 7));
        Assert.assertEquals(1, ModSimples.modSimples(26, 5));
    }
}