package br.ufg.inf.es.construcao.propriedade3025;

import org.junit.Test;
import org.junit.Assert;

public class Propriedade3025Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() {
        Propriedade3025.propriedade3025(-1);
        Propriedade3025.propriedade3025(10000);
    }

    @Test
    public void testFalse() {
        Assert.assertFalse(Propriedade3025.propriedade3025(500));
        Assert.assertFalse(Propriedade3025.propriedade3025(325));
    }

    @Test
    public void testTrue() {
        Assert.assertTrue(Propriedade3025.propriedade3025(1));
        Assert.assertTrue(Propriedade3025.propriedade3025(2025));
        Assert.assertTrue(Propriedade3025.propriedade3025(3025));
        Assert.assertTrue(Propriedade3025.propriedade3025(9801));
    }
}