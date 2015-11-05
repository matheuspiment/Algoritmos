package br.ufg.inf.es.construcao.mdc;

/**
 * Implementação do algoritmo que calcula o MDC de dois dados números.
 */
public class Mdc {

    /**
     * Obtêm o máximo divisor comum entre dois dados números.
     *
     * @param a Primeiro número de entrada.
     * @param b Segundo número de entrada.
     *
     * @return O máximo divisor comum entre os dois números dados.
     *
     * @throws IllegalAccessException Caso os valores a ou b estejam abaixo do
     * limite de entrada estabelecido.
     * O parâmetro a deve ser maior que b.
     * O parâmetro b deve ser maior que 0.
     */
    public static int mdc(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("a inválido");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("b inválido");
        }

        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }

        return a;
    }
}
