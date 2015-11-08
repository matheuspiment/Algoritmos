package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class RazaoAureaTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        RazaoAurea.razaoAurea(0, 1, 1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        RazaoAurea.razaoAurea(1, 1, 1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testTerceiroParametroInvalido() {
        RazaoAurea.razaoAurea(1, 2, 0);
    }

    @Test
    public void testRazaoAurea() {
        Assert.assertEquals(1.61803398875d, RazaoAurea.razaoAurea(99, 100, 1000), 0.00000000001d);
        Assert.assertEquals(1.61803398875d, RazaoAurea.razaoAurea(90, 91, 910), 0.00000000001d);
        Assert.assertEquals(1.61803398875d, RazaoAurea.razaoAurea(50, 75, 200), 0.00000000001d);
        Assert.assertEquals(1.61803398875d, RazaoAurea.razaoAurea(41, 68, 1000), 0.00000000001d);
    }
}