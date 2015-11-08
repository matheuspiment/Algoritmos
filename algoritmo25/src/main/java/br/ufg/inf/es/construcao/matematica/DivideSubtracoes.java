package br.ufg.inf.es.construcao.matematica;

/**
 * Implementa��o do algoritmo que realiza a opera��o de divis�o inteira.
 */
public class DivideSubtracoes {

    /**
     * Realiza a divis�o inteira de dois dados n�meros atravez de subtra��es.
     *
     * @param x Dividendo.
     * @param y Divisor.
     *
     * @return O quociente da divis�o.
     *
     * @throws IllegalArgumentException Caso x ou y sejam menores que
     * o valor estabelecido.
     * O par�metro x deve ser maior que -1.
     * O par�metro y deve ser maior que 0.
     */
    public static int divideSubtracoes(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("x inv�lido");
        }

        if (y <= 0) {
            throw new IllegalArgumentException("y inv�lido");
        }

        int d = 0;
        int s = x;

        while (s >= y) {
            s = s - y;
            d = d + 1;
        }

        return d;
    }
}
