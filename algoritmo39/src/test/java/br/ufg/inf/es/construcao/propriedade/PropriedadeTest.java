package br.ufg.inf.es.construcao.propriedade;

import org.junit.Test;
import org.junit.Assert;

public class PropriedadeTest {

    @Test
    public void testVerifica() {
        Assert.assertEquals(1, Propriedade.verifica());
    }
}