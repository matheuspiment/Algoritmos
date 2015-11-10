package br.ufg.inf.es.construcao.propriedade;

import org.junit.Test;
import org.junit.Assert;

public class AtendeSomaFatDigitosTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception{
        AtendeSomaFatDigitos.verifica(0);
        AtendeSomaFatDigitos.verifica(1000);
    }

    @Test
    public void testCasoTrue() {
        Assert.assertTrue(AtendeSomaFatDigitos.verifica(145));
    }

    @Test
    public void testCasoFalse() {
        Assert.assertFalse(AtendeSomaFatDigitos.verifica(122));
        Assert.assertFalse(AtendeSomaFatDigitos.verifica(144));
    }
}