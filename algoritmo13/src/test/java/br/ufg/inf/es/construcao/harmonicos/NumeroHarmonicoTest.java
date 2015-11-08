package br.ufg.inf.es.construcao.harmonicos;

import org.junit.Test;
import org.junit.Assert;

public class NumeroHarmonicoTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() {
        NumeroHarmonico.numeroHarmonico(0);
    }

    @Test
    public void testHarmonicos() {
        Assert.assertEquals(1.8333, NumeroHarmonico.numeroHarmonico(3), 0.001);
        Assert.assertEquals(2.4499, NumeroHarmonico.numeroHarmonico(6), 0.001);
        Assert.assertEquals(3.0198, NumeroHarmonico.numeroHarmonico(11), 0.001);
    }
}