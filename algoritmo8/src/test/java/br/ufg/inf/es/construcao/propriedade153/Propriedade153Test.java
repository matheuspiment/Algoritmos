package br.ufg.inf.es.construcao.propriedade153;

import org.junit.Test;
import org.junit.Assert;

public class Propriedade153Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() {
        Propriedade153.propriedade153(-1);
        Propriedade153.propriedade153(1000);
    }

    @Test
    public void testFalse() {
        Assert.assertFalse(Propriedade153.propriedade153(152));
        Assert.assertFalse(Propriedade153.propriedade153(369));
        Assert.assertFalse(Propriedade153.propriedade153(900));
    }

    @Test
    public void testTrue() {
        Assert.assertTrue(Propriedade153.propriedade153(1));
        Assert.assertTrue(Propriedade153.propriedade153(153));
        Assert.assertTrue(Propriedade153.propriedade153(370));
        Assert.assertTrue(Propriedade153.propriedade153(371));
        Assert.assertTrue(Propriedade153.propriedade153(407));
    }
}