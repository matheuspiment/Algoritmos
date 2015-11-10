package br.ufg.inf.es.construcao.cpf;

import org.junit.Test;
import org.junit.Assert;

public class CpfTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoInvalidoDoVetor() {
        Cpf.verifica(new int[10]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValoresInvalidos() {
        int[] a = {7, 1, 3, 2, 1, 7, 5, 12, 7, 4, 5, 8};
        int[] b = {7, 1, 3, 2, 1, -7, 5, 0, 7, 4, 5, 8};
        Cpf.verifica(a);
        Cpf.verifica(b);
    }

    @Test
    public void testCpfValido() {
        int[] cpfA = {0, 3, 2, 7, 8, 0, 2, 7, 9, 9, 0, 7};
        int[] cpfB = {0, 2, 0, 2, 7, 6, 2, 1, 8, 5, 7, 4};
        Assert.assertTrue(Cpf.verifica(cpfA));
        Assert.assertTrue(Cpf.verifica(cpfB));
    }

    @Test
    public void testCpfInvalido() {
        int[] cpf = {0, 3, 2, 7, 8, 0, 2, 7, 9, 9, 3, 7};
        Assert.assertFalse(Cpf.verifica(cpf));
    }
}