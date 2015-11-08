package br.ufg.inf.es.construcao.matematica;

/**
 * Implementação do algoritmo que soma todos os divisores de um dado número.
 */
public class SomaDivisores {

    /**
     * Soma todos os divisores de um dado inteiro n.
     *
     * @param n Número ao qual se quer obter a soma de seus divisores.
     *
     * @return A soma dos divisores do dado número.
     *
     * @throws IllegalArgumentException Caso n seja menor que o valor de
     * entrada estabelecido.
     * O parâmetro n deve ser maior que 0.
     */
    public static int somaDivisores(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n inválido");
        }

        int d = 2;
        int s = 1;

        while (d <= n / 2) {
            if (Mod.mod(n, d) == 0) {
                s = s + d;
            }

            d = d + 1;
        }

        return s;
    }
}
