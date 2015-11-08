package br.ufg.inf.es.construcao.matematica;

import br.ufg.inf.es.construcao.matematica.DivideSubtracoes;

/**
 * Impementa��o do algoritmo que obtem o resto de uma divis�o.
 */
public class ModSimples {

    /**
     * Obtem o resto da divis�o inteira de dois dados n�meros.
     *
     * @param x Dividendo.
     * @param y Divisor.
     *
     * @return O resto da divis�o.
     *
     * @throws IllegalArgumentException Caso x ou y sejam menores que
     * o valor estabelecido.
     * O par�metro x deve ser maior que 0.
     * O par�metro y deve ser maior que 0.
     */
    public static int modSimples(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("x inv�lido");
        }

        if (y <= 0) {
            throw new IllegalArgumentException("y inv�lido");
        }

        int d = DivideSubtracoes.divideSubtracoes(x, y);
        return x - (d * y);
    }
}
