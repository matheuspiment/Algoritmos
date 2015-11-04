package br.ufg.ing.es.construcao.potencia;

import org.junit.Test;
import org.junit.Assert;

public class PotenciaSomaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        PotenciaSoma.potenciaSoma(0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        PotenciaSoma.potenciaSoma(1, 0);
    }

    @Test
    public void testCasoDeFronteira() {
        Assert.assertEquals(1, PotenciaSoma.potenciaSoma(1, 1));
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(2, PotenciaSoma.potenciaSoma(2, 1));
        Assert.assertEquals(4, PotenciaSoma.potenciaSoma(2, 2));
        Assert.assertEquals(125, PotenciaSoma.potenciaSoma(5, 3));
        Assert.assertEquals(10000, PotenciaSoma.potenciaSoma(10, 4));
    }
}