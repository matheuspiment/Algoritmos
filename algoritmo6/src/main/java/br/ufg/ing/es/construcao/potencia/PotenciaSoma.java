package br.ufg.ing.es.construcao.potencia;

/**
 * Implementa��o do algoritmo que realiza a potencia��o utilizando a classe
 * Produto j� implementada.
 */
public class PotenciaSoma {

    /**
     * Realiza a potencia��o por meio da "soma" das multiplica��es.
     *
     * @param x A base.
     * @param y O expoente.
     *
     * @return A pot�ncia.
     *
     * @throws IllegalArgumentException Caso x ou y seja inv�lido.
     * O x deve ser maior que 0.
     * O y deve ser maior ou igual � 1.
     */
    public static int potenciaSoma(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("x inv�lido");
        }

        if (y < 1) {
            throw new IllegalArgumentException("y inv�lido");
        }

        int i = 1;
        int p = x;

        while (i < y) {
            p = Produto.produto(p, x);
            i = i + 1;
        }

        return p;
    }
}
