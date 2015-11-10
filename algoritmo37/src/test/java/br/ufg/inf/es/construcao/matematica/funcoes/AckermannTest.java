package br.ufg.inf.es.construcao.matematica.funcoes;

import org.junit.Test;
import org.junit.Assert;

public class AckermannTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        Ackermann.funcaoAckermann(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Ackermann.funcaoAckermann(0, -1);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(1, Ackermann.funcaoAckermann(0, 0));
        Assert.assertEquals(2, Ackermann.funcaoAckermann(0, 1));
        Assert.assertEquals(4, Ackermann.funcaoAckermann(0, 3));
        Assert.assertEquals(2, Ackermann.funcaoAckermann(1, 0));
        Assert.assertEquals(6, Ackermann.funcaoAckermann(1, 4));
        Assert.assertEquals(3, Ackermann.funcaoAckermann(2, 0));
        Assert.assertEquals(9, Ackermann.funcaoAckermann(2, 3));
        Assert.assertEquals(29, Ackermann.funcaoAckermann(3, 2));
        Assert.assertEquals(13, Ackermann.funcaoAckermann(4, 0));
    }
}