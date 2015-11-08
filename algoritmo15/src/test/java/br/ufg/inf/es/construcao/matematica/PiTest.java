package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class PiTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Pi.pi(0);
    }

    @Test
    public void testPrecisoesDePi() {
        Assert.assertEquals(2.66, Pi.pi(2), 0.01);
        Assert.assertEquals(3.3396, Pi.pi(5), 0.0001);
        Assert.assertEquals(3.1315, Pi.pi(100), 0.0001);
        Assert.assertEquals(3.1442, Pi.pi(375), 0.0001);
        Assert.assertEquals(3.1415, Pi.pi(20000), 0.0001);
        Assert.assertEquals(3.141559, Pi.pi(30000), 0.000001);
    }
}