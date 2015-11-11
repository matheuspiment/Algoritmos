package br.ufg.inf.es.construcao.array;

import org.junit.Test;
import org.junit.Assert;

public class ImprimeArrayTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroNinvalido() {
        ImprimeArray.imprime(new char[15], -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoDoVetorInvalido() {
        ImprimeArray.imprime(new char[4], 5);
        ImprimeArray.imprime(new char[6], 7);
    }

    @Test
    public void testPrimeiroArrayImpressao() {
        char[] A = {'1', '3', '4', '6', '2'};
        char[] B = {'1', '3', '4', '6', '2'};
        ImprimeArray.imprime(A, 5);
        for (int i = 0; i < A.length; i++) {
            Assert.assertEquals(A[i], B[i]);
        }
    }

    @Test
    public void testSegundoArrayImpressao() {
        char[] A = {'S', '1', '4', 'X', '2'};
        char[] B = {'S', '1', '4', 'X', '2'};
        ImprimeArray.imprime(A, 5);
        for (int i = 0; i < A.length; i++) {
            Assert.assertEquals(A[i], B[i]);
        }
    }

    @Test
    public void testArrayImpressaoAteN() {
        char[] A = {'S', '1', '4', 'X', '2'};
        char[] B = {'S', '1', '4', 'X', '2'};
        ImprimeArray.imprime(A, 4);
        for (int i = 0; i < A.length; i++) {
            Assert.assertEquals(A[i], B[i]);
        }
    }
}