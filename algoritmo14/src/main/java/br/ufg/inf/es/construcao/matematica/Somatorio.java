package br.ufg.inf.es.construcao.matematica;

/**
 * Implementa��o do algoritmo que calcula a somat�ria dos termos de
 * (1 /  1 + 1 * 1) + (1 / 1 + 2 * 2) + ... + (1 / 1 + n * n).
 */
public class Somatorio {

    /**
     * Calcula a somat�ria de (1 /  1 + 1 * 1) + (1 / 1 + 2 * 2) + ... +
     * (1 / 1 + n * n).
     *
     * @param n O n�mero de termos que se deseja obter a somat�ria.
     *
     * @return A somat�ria.
     *
     * @throws IllegalArgumentException Caso n esteja abaixo
     * do limite de entrada estabelecido.
     * O par�metro n deve ser igual ou maior que 1.
     */
    public static double somatorio(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inv�lido");
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
