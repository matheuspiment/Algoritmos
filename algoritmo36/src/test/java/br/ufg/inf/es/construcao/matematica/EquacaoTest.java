package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class EquacaoTest {

    @Test
    public void testSolucoesPossiveisDaEquacao() {
        Assert.assertEquals(6489, Equacao.equacao());
    }
}