package br.ufg.inf.es.construcao.matematica;

/**
 * Implementação do algoritmo que obtem o resto de uma divisão.
 */
public class Mod {

    /**
     * Obtem o resto da divisão de dois dados números.
     *
     * @param x Dividendo.
     * @param y Divisor.
     *
     * @return O resto da divisão.
     *
     * @throws IllegalArgumentException Caso os valores de x ou y sejam menores
     * que os valores de entrada estabelecidos.
     * O parâmetro x deve ser maior que 0.
     * O parâmetro y deve ser maior que -1.
     */
    public static int mod(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("x inválido");
        }

        if (y < 0) {
            throw new IllegalArgumentException("y inválido");
        }

        int s = x;

        while (s >= y) {
            s = s - y;
        }

        return s;
    }
}
