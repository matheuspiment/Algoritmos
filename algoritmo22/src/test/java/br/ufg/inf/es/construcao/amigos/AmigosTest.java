package br.ufg.inf.es.construcao.amigos;

import org.junit.Assert;
import org.junit.Test;

public class AmigosTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        Amigos.amigos(0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Amigos.amigos(1, 0);
    }

    @Test
    public void testNumerosAmigos() {
        Assert.assertEquals('V', Amigos.amigos(220, 284));
    }

    @Test
    public void testNumerosNaoAmigos() {
        Assert.assertEquals('F', Amigos.amigos(25, 33));
        Assert.assertEquals('F', Amigos.amigos(45, 31));
    }
}