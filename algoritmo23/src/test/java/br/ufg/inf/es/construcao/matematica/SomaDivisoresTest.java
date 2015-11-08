package br.ufg.inf.es.construcao.matematica;

import org.junit.Assert;
import org.junit.Test;

public class SomaDivisoresTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() {
        SomaDivisores.somaDivisores(0);
    }

    @Test
    public void testSomaDivisores() {
        Assert.assertEquals(3, SomaDivisores.somaDivisores(4));
        Assert.assertEquals(15, SomaDivisores.somaDivisores(16));
        Assert.assertEquals(6, SomaDivisores.somaDivisores(25));
        Assert.assertEquals(13, SomaDivisores.somaDivisores(35));
        Assert.assertEquals(136, SomaDivisores.somaDivisores(112));
        Assert.assertEquals(1340, SomaDivisores.somaDivisores(1000));
    }
}