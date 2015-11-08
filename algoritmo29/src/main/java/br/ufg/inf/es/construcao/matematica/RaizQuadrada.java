package br.ufg.inf.es.construcao.matematica;

/**
 * Implementação do algoritmo que calcula a raiz quadrada de um dado número
 * de acordo com a precisão fornecida.
 */
public class RaizQuadrada {
    public static double raizQuadrada(int n, int i) {

        /**
         * Calcula a raiz quadrada de um dado número de acordo com a
         * precisão fornecida.
         *
         * @param n Número ao qual se pretende obter a raiz quadrada.
         * @param i Inteiro que indica a "precisão" desejada.
         *
         * @return A raiz quadrada do dado número.
         *
         * @throws IllegalArgumentException Caso o valor n seja menor
         * que o valor de entrada estabelecido.
         * O parâmetro n deve ser maior que 0.
         */
        if (n <= 0) {
            throw new IllegalArgumentException("n inválido");
        }

        double r = 1;

        while (i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }
}
