package br.ufg.inf.es.construcao.harmonicos;

/**
 * Implementação do algoritmo que calcula o valor de uma série harmônica
 * até o valor 1/n.
 */
public class NumeroHarmonico {

    /**
     * Calcula o valor de uma série harmônica até o valor 1/n
     * de um dado número.
     *
     * @param n Nímero cujo valor da sequência harmônica será calculado.
     *
     * @return O valor da sequência harmônica.
     *
     * @throws IllegalArgumentException Caso n seja menor que 1.
     */
    public static double numeroHarmonico(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inválido");
        }

        double i = 2;
        double s = 1;

        while (i <= n) {
            s = s + (1 / i);
            i = i + 1;
        }

        return s;
    }
}
