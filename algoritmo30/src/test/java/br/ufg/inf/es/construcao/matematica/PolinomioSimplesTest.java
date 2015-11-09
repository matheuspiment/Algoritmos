package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class PolinomioSimplesTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroGInvalido() {
        PolinomioSimples.polinomio(4, 0, new int[] {2, 4, 8});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoInvalidoDoVetor() {
        PolinomioSimples.polinomio(3, 4, new int[] {2, 7, 3});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPosicaoGInvalida() {
        PolinomioSimples.polinomio(4, 3, new int[] {3, 4, 6, 0});
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(140, PolinomioSimples.polinomio(2, 4,
                new int[] {4, 2, 1, 6, 5}));
        Assert.assertEquals(685, PolinomioSimples.polinomio(2, 6,
                new int[] {1 ,2, 2, 4, 4, 6, 6 }));
    }
}