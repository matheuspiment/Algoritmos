package br.ufg.inf.es.construcao.array;

import org.junit.Test;
import org.junit.Assert;

public class BubbleSortTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroNInvalido() {
        BubbleSort.ordenacao(new int[5], -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoInvalidoDoVetor() {
        BubbleSort.ordenacao(new int[10], 11);
    }

    @Test
    public void testPrimeiroVetorOrdenacao() {
        int[] A = {1, 3, 4, 2};
        BubbleSort.ordenacao(A, 4);
        int[] B = {4, 3, 2, 1};
        for (int i = 0; i < A.length; i++) {
            Assert.assertEquals(A[i], B[i]);
        }
    }

    @Test
    public void testSegundoVetorOrdenacao() {
        int[] A = {2, 6, 7, 1, 8, 9, 0, 10};
        BubbleSort.ordenacao(A, 8);
        int[] B = {10, 9, 8, 7, 6, 2, 1, 0};
        for (int i = 0; i < A.length; i++) {
            Assert.assertEquals(A[i], B[i]);
        }
    }

    @Test
    public void testTerceiroVetorOrdenacao() {
        int[] A = {2, 3, 5, 8, 9, 11, 12, 15, 20};
        BubbleSort.ordenacao(A, 9);
        int[] B = {20, 15, 12, 11, 9, 8, 5, 3, 2};
        for (int i = 0; i < A.length; i++) {
            Assert.assertEquals(A[i], B[i]);
        }
    }

}