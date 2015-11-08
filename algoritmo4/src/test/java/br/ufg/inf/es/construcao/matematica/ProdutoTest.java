package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class ProdutoTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        Produto.produto(-5, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Produto.produto(1, -2);
    }
        
    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(0, Produto.produto(0, 2));
        Assert.assertEquals(0, Produto.produto(5, 0));
        Assert.assertEquals(5, Produto.produto(5, 1));
        Assert.assertEquals(5, Produto.produto(1, 5));
    }
    
    @Test
    public void testProduto() {
        Assert.assertEquals(10, Produto.produto(5, 2));
        Assert.assertEquals(100, Produto.produto(10, 10));
        Assert.assertEquals(600, Produto.produto(200, 3));
        Assert.assertEquals(2 * 49, Produto.produto(2, 49));  
    }
}
