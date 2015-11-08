package br.ufg.inf.es.construcao.matematica;

/**
 * Implementação do algoritmo que realiza a divisão inteira de
 * dois dados números.
 */
public class DivideSomas {

    /**
     * Realiza a divisão inteira de dois dados números atravez de somas.
     *
     * @param x Dividendo.
     * @param y Divisor.
     *
     * @return O quociente da divisão.
     *
     * @throws IllegalArgumentException Caso x ou y sejam menores que
     * o valor estabelecido.
     * O parâmetro x deve ser maior que -1.
     * O parâmetro y deve ser maior que 0.
     */
    public static int divideSomas(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("x inválido");
        }

        if (y <= 0) {
            throw new IllegalArgumentException("y inválido");
        }

        int d = 0;
        int s = y;

        while (s <= x) {
            s = s + y;
            d = d + 1;
        }

        return d;
    }
}
