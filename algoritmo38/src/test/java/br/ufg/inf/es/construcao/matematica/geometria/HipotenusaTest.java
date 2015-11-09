package br.ufg.inf.es.construcao.matematica.geometria;

import org.junit.Test;
import org.junit.Assert;

public class HipotenusaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        Hipotenusa.hipotenusa(0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Hipotenusa.hipotenusa(1, 0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(5, Hipotenusa.hipotenusa(3, 4), 0.1);
        Assert.assertEquals(110, Hipotenusa.hipotenusa(66, 88), 0.1);
        Assert.assertEquals(80, Hipotenusa.hipotenusa(48, 64), 0.1);
        Assert.assertEquals(25, Hipotenusa.hipotenusa(15, 20), 0.1);
    }
}