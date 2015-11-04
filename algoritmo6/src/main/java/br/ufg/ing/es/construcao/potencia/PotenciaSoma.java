package br.ufg.ing.es.construcao.potencia;

/**
 * Implementação do algoritmo que realiza a potenciação utilizando a classe
 * Produto já implementada.
 */
public class PotenciaSoma {

    /**
     * Realiza a potenciação por meio da "soma" das multiplicações.
     *
     * @param x A base.
     * @param y O expoente.
     * @return A potência.
     * @throws IllegalArgumentException Caso x ou y seja inválido.
     * O x deve ser maior que 0.
     * O y deve ser maior ou igual à 1.
     */
    public static int potenciaSoma(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("x inválido");
        }

        if (y < 1) {
            throw new IllegalArgumentException("y inválido");
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
