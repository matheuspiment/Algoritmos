package br.ufg.inf.es.construcao.matematica;

/**
 * Implementa��o do algoritmo que obtem o resto de uma divis�o.
 */
public class Mod {

    /**
     * Obtem o resto da divis�o de dois dados n�meros.
     *
     * @param x Dividendo.
     * @param y Divisor.
     *
     * @return O resto da divis�o.
     *
     * @throws IllegalArgumentException Caso os valores de x ou y sejam menores
     * que os valores de entrada estabelecidos.
     * O par�metro x deve ser maior que -1.
     * O par�metro y deve ser maior que 0.
     */
    public static int mod(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("x inv�lido");
        }

        if (y <= 0) {
            throw new IllegalArgumentException("y inv�lido");
        }

        int s = x;

        while (s >= y) {
            s = s - y;
        }

        return s;
    }
}
