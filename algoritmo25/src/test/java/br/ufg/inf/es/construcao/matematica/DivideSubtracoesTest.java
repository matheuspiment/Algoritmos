package br.ufg.inf.es.construcao.matematica;

import org.junit.Assert;
import org.junit.Test;

public class DivideSubtracoesTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        DivideSubtracoes.divideSubtracoes(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        DivideSubtracoes.divideSubtracoes(0, 0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(0, DivideSubtracoes.divideSubtracoes(0, 1));
        Assert.assertEquals(1, DivideSubtracoes.divideSubtracoes(1, 1));
        Assert.assertEquals(2, DivideSubtracoes.divideSubtracoes(4, 2));
        Assert.assertEquals(3, DivideSubtracoes.divideSubtracoes(15, 5));
        Assert.assertEquals(4, DivideSubtracoes.divideSubtracoes(16, 4));
        Assert.assertEquals(100, DivideSubtracoes.divideSubtracoes(300, 3));
    }
}