package br.ufg.inf.es.construcao.array;

import org.junit.Test;
import org.junit.Assert;

public class InverteCaracteresTest {

    @Test
    public void testInvertePrimeiroArray() {
        char[] A = {'1', '3', '2', '5'};
        char[] B = {'5', '2', '3', '1'};
        char[] C = InverteCaracteres.inverter(A);
        for (int i = 0; i < A.length; i++) { 
            // Forma de teste não recomendada.
            Assert.assertEquals(B[i], C[i]);
        }
    }

    @Test
    public void testInverteSegundoArray() {
        char[] A = {'2', 'P', 'S', '5', '4', 'J'};
        char[] B = {'J', '4', '5', 'S', 'P', '2'};
        char[] C = InverteCaracteres.inverter(A);
        for (int i = 0; i < A.length; i++) { 
            // Forma de teste não recomendada.
            Assert.assertEquals(B[i], C[i]);
        }
    }

    @Test
    public void testInverteTerceiroArray() {
        char[] A = {'2', '0', 'S', '5', '3', 'U', 'i', 'f'};
        char[] B = {'f', 'i', 'U', '3', '5', 'S', '0', '2'};
        char[] C = InverteCaracteres.inverter(A);
        for (int i = 0; i < A.length; i++) { 
            // Forma de teste não recomendada.
            Assert.assertEquals(B[i], C[i]);
        }
    }
}
