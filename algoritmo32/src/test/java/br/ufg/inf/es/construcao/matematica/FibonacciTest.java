package br.ufg.inf.es.construcao.matematica;

import org.junit.Test;
import org.junit.Assert;

public class FibonacciTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() {
        Fibonacci.fibonacci(-1);
    }

    @Test
    public void testFibonacciSequence() {
        Assert.assertEquals(0, Fibonacci.fibonacci(0));
        Assert.assertEquals(1, Fibonacci.fibonacci(1));
        Assert.assertEquals(13, Fibonacci.fibonacci(7));
        Assert.assertEquals(610, Fibonacci.fibonacci(15));
        Assert.assertEquals(2584, Fibonacci.fibonacci(18));
        Assert.assertEquals(75025, Fibonacci.fibonacci(25));
        Assert.assertEquals(14930352, Fibonacci.fibonacci(36));
    }
}