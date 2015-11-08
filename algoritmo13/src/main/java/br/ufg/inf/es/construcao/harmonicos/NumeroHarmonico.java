package br.ufg.inf.es.construcao.harmonicos;

/**
 * Implementa��o do algoritmo que calcula o valor de uma s�rie harm�nica
 * at� o valor 1/n.
 */
public class NumeroHarmonico {

    /**
     * Calcula o valor de uma s�rie harm�nica at� o valor 1/n
     * de um dado n�mero.
     *
     * @param n N�mero cujo valor da sequ�ncia harm�nica ser� calculado.
     *
     * @return O valor da sequ�ncia harm�nica.
     *
     * @throws IllegalArgumentException Caso n seja menor que 1.
     */
    public static double numeroHarmonico(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inv�lido");
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
