package br.ufg.inf.es.construcao.matematica;

import org.junit.Assert;
import org.junit.Test;

public class ModTest {

    @Test(expected = IllegalArgumentException.class)
     public void testPrimeiroParametroInvalido() {
        Mod.mod(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Mod.mod(2, 0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(0, Mod.mod(0, 10));
        Assert.assertEquals(8, Mod.mod(8, 10));
        Assert.assertEquals(0, Mod.mod(3, 1));
        Assert.assertEquals(1, Mod.mod(7, 2));
        Assert.assertEquals(3, Mod.mod(15, 4));
        Assert.assertEquals(6, Mod.mod(27, 7));
        Assert.assertEquals(4, Mod.mod(14, 10));
    }
}