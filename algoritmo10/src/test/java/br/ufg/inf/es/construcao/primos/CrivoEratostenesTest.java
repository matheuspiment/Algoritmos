package br.ufg.inf.es.construcao.primos;

import org.junit.Test;
import org.junit.Assert;

public class CrivoEratostenesTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNInvalido() {
        CrivoEratostenes.crivoEratostenes(new int[] {1, 2}, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoInvalidoDoVetor() {
        CrivoEratostenes.crivoEratostenes(new int[] {1, 2, 0, 0}, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValoresInvalidosDoVetor() {
        CrivoEratostenes.crivoEratostenes(new int[] {1, 2, 3, 0}, 2);
    }

    @Test
    public void testCincoPrimo() {
        int[] a = new int[6];
        CrivoEratostenes.crivoEratostenes(a, 5);
        Assert.assertEquals(0, a[5]);
    }

    @Test
    public void testSetePrimo() {
        int[] a = {1, 2, 0, 0, 0, 0, 0, 0};
        CrivoEratostenes.crivoEratostenes(a, 7);
        Assert.assertEquals(0, a[7]);
    }

    @Test
    public void testQuatroNaoPrimo() {
        int[] a = {0, 0, 0, 0, 0};
        CrivoEratostenes.crivoEratostenes(a, 4);
        Assert.assertEquals(1, a[4]);
    }

    @Test
    public void testCinquentaNaoPrimo() {
        int[] a = new int[51];
        CrivoEratostenes.crivoEratostenes(a, 50);
        Assert.assertEquals(1, a[50]);
    }

}
