package br.ufg.inf.es.construcao.matematica;

/**
 * Impementação do algoritmo que obtem o resto de uma divisão.
 */
public class ModSimples {

    /**
     * Obtem o resto da divisão inteira de dois dados nímeros.
     *
     * @param x Dividendo.
     * @param y Divisor.
     *
     * @return O resto da divisão.
     *
     * @throws IllegalArgumentException Caso x ou y sejam menores que
     * o valor estabelecido.
     * O parâmetro x deve ser maior que 0.
     * O parâmetro y deve ser maior que 0.
     */
    public static int modSimples(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("x inválido");
        }

        if (y <= 0) {
            throw new IllegalArgumentException("y inválido");
        }

        int d = DivideSubtracoes.divideSubtracoes(x, y);
        return x - (d * y);
    }
}
