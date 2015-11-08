package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class FatorialSomaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        FatorialSoma.fatorialsoma(0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(1, FatorialSoma.fatorialsoma(1));
        Assert.assertEquals(6, FatorialSoma.fatorialsoma(3));
        Assert.assertEquals(2, FatorialSoma.fatorialsoma(2));
        Assert.assertEquals(720, FatorialSoma.fatorialsoma(6));
    }
}