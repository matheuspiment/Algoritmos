package br.ufg.inf.es.construcao.array;

import org.junit.Assert;
import org.junit.Test;

public class SomaArrayTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroNInvalido() {
        SomaArray.somaArray(new int[] {1, 3, 4, 5}, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoDoVetorInvalido() {
        SomaArray.somaArray(new int[] {1, 3, 4, 5}, 4);
    }

    @Test
    public void testCasosTriviais() {
        int[] A = new int[] {2, 4, 5, 7, 8, 11};
        Assert.assertEquals(9, SomaArray.somaArray(A, 2));
        Assert.assertEquals(24, SomaArray.somaArray(A, 4));
        Assert.assertEquals(35, SomaArray.somaArray(A, 5));
    }
}