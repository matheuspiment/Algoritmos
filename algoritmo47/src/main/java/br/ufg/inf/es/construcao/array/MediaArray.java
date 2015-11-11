package br.ufg.inf.es.construcao.array;

import br.ufg.inf.es.construcao.array.SomaArray;

/**
 * Implementação do algoritmo que calcula a média da soma dos n elementos
 * de um array.
 */
public class MediaArray {

    /**
     * Calcula a média da soma dos n primeiros elementos de um dado array.
     *
     * @param A Elementos do array.
     * @param n Indica os n primeiros elementos que serão somados
     *          para o calculo da média.
     *
     * @return A média da soma dos n primeiros elementos do array.
     *
     * @throws IllegalArgumentException Caso os parâmetros de entrada
     * sejam inválidos.
     * O parâmetro n deve ser maior que -1.
     * O tamanho do vetor deve ser maior ou igual a n.
     */
    public static double mediaArray(int[] A, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n inválido");
        }

        if (A.length < n) {
            throw new IllegalArgumentException("tamanho do vetor");
        }

        double s = SomaArray.somaArray(A, n);
        return s / n;
    }
}
