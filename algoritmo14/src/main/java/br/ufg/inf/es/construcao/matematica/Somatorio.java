package br.ufg.inf.es.construcao.matematica;

/**
 * Implementação do algoritmo que calcula a somatória dos termos de
 * (1 /  1 + 1 * 1) + (1 / 1 + 2 * 2) + ... + (1 / 1 + n * n).
 */
public class Somatorio {

    /**
     * Calcula a somatória de (1 /  1 + 1 * 1) + (1 / 1 + 2 * 2) + ... +
     * (1 / 1 + n * n).
     *
     * @param n O número de termos que se deseja obter a somatória.
     *
     * @return A somatória.
     *
     * @throws IllegalArgumentException Caso n esteja abaixo
     * do limite de entrada estabelecido.
     * O parâmetro n deve ser igual ou maior que 1.
     */
    public static double somatorio(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inválido");
        }

        int i = 1;
        double s = 0;

        while (i <= n) {
            double d = 1 + i * i;
            s = s + 1 / d;
            i = i + 1;
        }

        return s;
    }
}
