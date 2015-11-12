package br.ufg.inf.es.construcao.matematica;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PermutacaoTest {
    @Test
    public void testCasoTrivial() {
        List<String> retorno = Permutacao.permuta("", "m", new ArrayList<String>());
        Assert.assertEquals(1, retorno.size());
        Assert.assertEquals("m", retorno.get(0));
    }

    @Test
    public void testSegundoCasoTrivial() {
        List<String> retorno = Permutacao.permuta("", "MA", new ArrayList<String>());
        Assert.assertEquals(2, retorno.size());
        Assert.assertTrue(retorno.contains("MA"));
        Assert.assertTrue(retorno.contains("AM"));
    }

    @Test
    public void testTerceiroCasoNaoTrivial() {
        List<String> retorno = Permutacao.permuta("", "Nunes", new ArrayList<String>());
        Assert.assertEquals(120, retorno.size());
    }

    @Test
    public void testQuartoCasoNaoTrivial() {
        List<String> retorno = Permutacao.permuta("", "TRIVIAL", new ArrayList<String>());
        Assert.assertEquals(5040, retorno.size());
    }
}