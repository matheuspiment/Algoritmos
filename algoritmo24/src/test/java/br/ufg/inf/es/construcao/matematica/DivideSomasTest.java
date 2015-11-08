package br.ufg.inf.es.construcao.matematica;

import org.junit.Assert;
import org.junit.Test;

public class DivideSomasTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        DivideSomas.divideSomas(-1,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        DivideSomas.divideSomas(0,0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(0, DivideSomas.divideSomas(0, 1));
        Assert.assertEquals(1, DivideSomas.divideSomas(1, 1));
        Assert.assertEquals(2, DivideSomas.divideSomas(4, 2));
        Assert.assertEquals(3, DivideSomas.divideSomas(15, 5));
        Assert.assertEquals(4, DivideSomas.divideSomas(16, 4));
        Assert.assertEquals(100, DivideSomas.divideSomas(300, 3));
    }
}