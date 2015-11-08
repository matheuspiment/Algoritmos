package br.ufg.inf.es.construcao.matematica;

/**
 * Implementa��o do algoritmo que calcula a raiz quadrada de um dado n�mero
 * de acordo com a precis�o fornecida.
 */
public class RaizQuadrada {
    public static double raizQuadrada(int n, int i) {

        /**
         * Calcula a raiz quadrada de um dado n�mero de acordo com a
         * precis�o fornecida.
         *
         * @param n N�mero ao qual se pretende obter a raiz quadrada.
         * @param i Inteiro que indica a "precis�o" desejada.
         *
         * @return A raiz quadrada do dado n�mero.
         *
         * @throws IllegalArgumentException Caso o valor n seja menor
         * que o valor de entrada estabelecido.
         * O par�metro n deve ser maior que 0.
         */
        if (n <= 0) {
            throw new IllegalArgumentException("n inv�lido");
        }

        double r = 1;

        while (i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }
}
