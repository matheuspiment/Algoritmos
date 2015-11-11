package br.ufg.inf.es.construcao.luhn;

import org.junit.Test;
import org.junit.Assert;

public class AlgoritmoDeLuhnTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() {
        AlgoritmoDeLuhn.checkDigit(new int[] {2});
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(1, AlgoritmoDeLuhn.checkDigit(new int[]
                {1, 5, 3, 2, 1}));
        Assert.assertEquals(8, AlgoritmoDeLuhn.checkDigit(new int[]
                {6, 3, 0, 0, 8}));
        Assert.assertEquals(9, AlgoritmoDeLuhn.checkDigit(new int[]
                {1, 3, 6, 2, 7, 8, 4, 9}));
        Assert.assertEquals(3, AlgoritmoDeLuhn.checkDigit(new int[]
                {7, 9, 9, 2, 7, 3, 9, 8, 7, 1, 3}));
        Assert.assertEquals(7, AlgoritmoDeLuhn.checkDigit(new int[]
                {5, 6, 3, 2, 7, 4, 9, 7}));
        Assert.assertEquals(7, AlgoritmoDeLuhn.checkDigit(new int[]
                {2, 6, 3, 5, 4, 5, 6, 8, 7, 5, 3, 6, 1, 0, 2, 7}));
    }
}