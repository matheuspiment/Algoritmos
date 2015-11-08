package br.ufg.inf.es.construca.matematica;

import org.junit.Test;
import org.junit.Assert;

public class QuadradoPerfeitoTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() {
        QuadradoPerfeito.quadradoPerfeito(0);
    }

    @Test
    public void testQuadradosPerfeitos() {
        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(9));
        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(16));
        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(25));
        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(49));
        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(100));
    }

    @Test
    public void testNaoQuadradosPerfeitos() {
        Assert.assertFalse(QuadradoPerfeito.quadradoPerfeito(8));
        Assert.assertFalse(QuadradoPerfeito.quadradoPerfeito(18));
        Assert.assertFalse(QuadradoPerfeito.quadradoPerfeito(74));

    }
}