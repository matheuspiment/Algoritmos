package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;

public class DivideTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        Divide.divide(0, 2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Divide.divide(2, 0, 3);
    }
}