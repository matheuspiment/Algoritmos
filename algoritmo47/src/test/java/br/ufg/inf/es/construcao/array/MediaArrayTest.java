package br.ufg.inf.es.construcao.array;

import org.junit.Test;
import org.junit.Assert;

public class MediaArrayTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroNInvalido() {
        MediaArray.mediaArray(new int[] {1, 3, 4, 5}, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoDoVetorInvalido() {
        MediaArray.mediaArray(new int[] {1, 3, 4, 5}, 4);
    }

    @Test
    public void testCasosTriviais() {
        int[] A = new int[] {2, 4, 5, 7, 8, 11, 13};
        Assert.assertEquals(4.5, MediaArray.mediaArray(A, 2), 0.1);
        Assert.assertEquals(6, MediaArray.mediaArray(A, 4), 1);
        Assert.assertEquals(7, MediaArray.mediaArray(A, 5), 1);
        Assert.assertEquals(8, MediaArray.mediaArray(A, 6), 1);
    }
}