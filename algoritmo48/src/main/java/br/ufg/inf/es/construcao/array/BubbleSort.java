package br.ufg.inf.es.construcao.array;

/**
 * Implementação do algoritmo de Bubble sort.
 */
public class BubbleSort {

    /**
     * Ordena o vetor por meio do algoritmo de Bubble sort(ordem decrescente).
     *
     * @param A Vetor a ser ordenado.
     * @param n Quantidade de elementos no vetor.
     *
     * @throws IllegalArgumentException Caso n ou o tamanho do vetor
     * sejam inválidos.
     * O parãmetro n deve ser maior ou igual a 0 e
     * menor ou igual ao tamanho do vetor.
     */
    public static void ordenacao(int[] A, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n inválido");
        }

        if (n > A.length){
            throw new IllegalArgumentException("tamanho do vetor");
        }

        int p = n - 1;

        while (p >= 1) {
            int i = 0;
            while (i < p) {
                if (A[i] < A[i + 1]) {
                    int t = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = t;
                }

                i = i + 1;
            }

            p = p - 1;
        }
    }
}
