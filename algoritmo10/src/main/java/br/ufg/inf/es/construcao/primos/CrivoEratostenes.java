package br.ufg.inf.es.construcao.primos;

/**
 * Implementação do algoritmo que simula o crivo de Erastóstenes.
 */
public class CrivoEratostenes {

    /**
     * Simula o crivo de Erastóstenes. Caso o número seja ímpar
     * sua posição no vetor assume valor 0, caso contrário, assume valor 1.
     *
     * @param a Valores de entrada do vetor.
     * @param n Número cuja primaridade será verificada.
     * 
     * @throws IllegalArgumentException Caso o n, o tamanho do vetor ou os
     * valores posteriores a segunda posição do vetor fornecidos não atendem ao
     * valor de "partida" estabelecido.
     * N deve ser um valor maior que 1.
     * O tamanho do vetor deve ser maior que n + 1.
     * Todas as posições do vetor, a partir da segunda, devem ter valor 0.
     */
    public static void crivoEratostenes(int[] a, int n) {
        if (n < 2) {
            throw new IllegalArgumentException("n inválido");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("tamanho do vetor");
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("valor da posição diferente de 0");
            }
        }

        int i = 2;
        int c = 0;

        while (i <= n / 2) {
            if (a[i] == 0) {
                c = i + i;
                while (c <= n) {
                    a[c] = 1;
                    c = c + i;
                }
            }

            i = i + 1;
        }

    }
}
