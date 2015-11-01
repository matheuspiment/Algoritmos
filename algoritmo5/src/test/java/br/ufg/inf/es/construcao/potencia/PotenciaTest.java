package br.ufg.inf.es.construcao.potencia;

import org.junit.Test;
import org.junit.Assert;

public class PotenciaTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        Potencia.potencia(0, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Potencia.potencia(2, -2);
    }
    
    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(1, Potencia.potencia(1, 0));
        Assert.assertEquals(1, Potencia.potencia(5, 0));
        Assert.assertEquals(1, Potencia.potencia(1, 7));
        Assert.assertEquals(7, Potencia.potencia(7, 1));
    }
    
    @Test
    public void testPotencia() {
        Assert.assertEquals(4, Potencia.potencia(2, 2));
        Assert.assertEquals(1000, Potencia.potencia(10, 3));
        Assert.assertEquals(3125, Potencia.potencia(5, 5));
    }
}
