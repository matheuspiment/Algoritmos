package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class PolinomioHornerTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroGInvalido() {
        PolinomioHorner.polinomioHorner(4, 0, new int[] {2, 4, 8});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoInvalidoDoVetor() {
        PolinomioHorner.polinomioHorner(3, 4, new int[] {2, 7, 3});
    }

    @Test
    public void testCasosTriviais() {
        int[] a = new int[] {1 ,2, 2, 4, 4, 6, 6, 7 };
        Assert.assertEquals(109, PolinomioHorner.polinomioHorner(2, 4, a));
        Assert.assertEquals(685, PolinomioHorner.polinomioHorner(2, 6, a));
        Assert.assertEquals(1581, PolinomioHorner.polinomioHorner(2, 7, a));
    }
}