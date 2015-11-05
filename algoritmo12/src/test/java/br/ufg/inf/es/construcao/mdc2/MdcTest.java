package br.ufg.inf.es.construcao.mdc2;

import org.junit.Test;
import org.junit.Assert;

public class MdcTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        Mdc.mdc(2, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Mdc.mdc(2, 0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(20, Mdc.mdc(40, 20));
        Assert.assertEquals(50, Mdc.mdc(100, 50));
        Assert.assertEquals(5, Mdc.mdc(15, 10));
        Assert.assertEquals(15, Mdc.mdc(45, 30));
    }
}
