package br.ufg.inf.es.construcao.mdc2;

/**
 * Implementação do algoritmo que calcula o MDC de dois dados números
 * de uma "outra forma".
 */
public class Mdc {

    /**
     * Calcula o máximo divisor comum entre dois dados números.
     *
     * @param a Primeiro número de entrada.
     * @param b Segundo número de entrada.
     *
     * @return Retona o máximo divisor comum entre os números dados.
     *
     * @throws IllegalArgumentException Caso a ou b sejam menores que o
     * limite de entrada estabelecido.
     * O parâmetro a deve ser igual ou maior que b.
     * O parâmetro b deve ser maior que 0.
     */
    public static int mdc(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("a inválido");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("b inválido");
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b -a;
            }
        }

        return a;
    }
}
