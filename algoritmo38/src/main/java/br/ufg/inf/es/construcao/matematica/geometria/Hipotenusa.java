package br.ufg.inf.es.construcao.matematica.geometria;

import br.ufg.inf.es.construcao.matematica.RaizQuadrada;

/**
 * Implementação do algoritmo que calcula a hipotenusa.
 */
public class Hipotenusa {

    /**
     * Calcula a hipotenusa com base nas medidas fornecidas.
     *
     * @param A Primeira medida.
     * @param B Segunda medida.
     *
     * @return Resultado da hipotenusa.
     *
     * @throws IllegalArgumentException Caso as medidas A e B sejam inválidas.
     * O parâmetro A deve ser maior que 0.
     * O parâmetro B deve ser maios que 0.
     */
    public static double hipotenusa(int A, int B) {
        if (A <= 0) {
            throw new IllegalArgumentException("valor A inválido");
        }

        if (B <= 0) {
            throw new IllegalArgumentException("valor B inválido");
        }

        int x = A * A;
        int y = B * B;
        double r = RaizQuadrada.raizQuadrada (x + y, 150);
        return r;
    }
}
