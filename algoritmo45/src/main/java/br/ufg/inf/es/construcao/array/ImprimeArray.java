package br.ufg.inf.es.construcao.array;

/**
 * Implementação do algoritmo que imprime um dado array.
 */
public class ImprimeArray {

    /**
     * Imprime os n primeiros elementos de um dado array.
     *
     * @param A Array que se deseja imprimir.
     * @param n Quantidade de elementos no vetor.
     *
     * @throws IllegalArgumentException Caso os parâmetros de entrada
     * sejam inválidos.
     * O parâmetro n deve ser maior que -1.
     * O tamanho do vetor deve ser maior ou igual a n.
     */
    public static void imprime(char[] A, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n inválido");
        }

        if (A.length < n) {
            throw new IllegalArgumentException("tamanho do vetor");
        }

        int i = 0;

        while (i < n) {
            System.out.print(" " + A[i]); // print com espaço entre os dígitos.
            i = i + 1;
        }
    }
}