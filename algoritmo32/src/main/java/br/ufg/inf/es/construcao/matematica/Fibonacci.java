package br.ufg.inf.es.construcao.matematica;

/**
 * Implementação do algoritmo que exibe o valor de posição n da sequência
 * de Fibonacci.
 */
public class Fibonacci {

    /**
     * Exibe o valor de posição n da sequência
     * de Fibonacci(Fibonacci de n).
     *
     * @param n Posição que se deseja obter.
     *
     * @return Fibonacci de n.
     *
     * @throws IllegalArgumentException Caso o valor de n não atenda as
     * exigências de entrada.
     * O parâmetro n deve ser maior que -1.
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n inválido");
        }

        int a = 0; // Termo anterior.
        int c = 1; // Termo corrente.

        if (n == 0 || n == 1) {
            return n;
        }

        int i = 2; // Neste ponto, n >= 2.

        while (i <= n) {
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }
}
