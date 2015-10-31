package br.ufg.inf.es.construcao.paridade;

import org.junit.Test;
import org.junit.Assert;

public class ParidadeTest {

    @Test
    public void testParidade() throws Exception {
        Assert.assertTrue(Paridade.paridade(2));
        Assert.assertTrue(Paridade.paridade(578));
    }

    @Test
    public void testNaoParidade() throws Exception {
        Assert.assertFalse(Paridade.paridade(3));
        Assert.assertFalse(Paridade.paridade(555));
    }
}