package br.ufg.inf.es.construcao.mdc;

import org.junit.Test;
import org.junit.Assert;

public class MdcTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        Mdc.mdc(2, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Mdc.mdc(2, 0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(1, Mdc.mdc(2, 1));
        Assert.assertEquals(2, Mdc.mdc(6, 2));
        Assert.assertEquals(10, Mdc.mdc(20, 10));
    }
}
