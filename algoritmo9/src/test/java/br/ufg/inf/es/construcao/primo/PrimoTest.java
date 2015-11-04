package br.ufg.inf.es.construcao.primo;

import org.junit.Assert;
import org.junit.Test;

public class PrimoTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() {
        Primo.primo(1);
    }

    @Test
    public void testNumerosPrimos() {
        Assert.assertTrue(Primo.primo(2));
        Assert.assertTrue(Primo.primo(11));
    }

    @Test
    public void testNumerosNaoPrimos() {
        Assert.assertFalse(Primo.primo(4));
        Assert.assertFalse(Primo.primo(6));
    }
}