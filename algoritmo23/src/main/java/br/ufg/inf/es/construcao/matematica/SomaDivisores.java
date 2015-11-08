package br.ufg.inf.es.construcao.matematica;

import br.ufg.inf.es.construcao.matematica.Mod;

/**
 * Implementa��o do algoritmo que soma todos os divisores de um dado n�mero.
 */
public class SomaDivisores {

    /**
     * Soma todos os divisores de um dado inteiro n.
     *
     * @param n N�mero ao qual se quer obter a soma de seus divisores.
     *
     * @return A soma dos divisores do dado n�mero.
     *
     * @throws IllegalArgumentException Caso n seja menor que o valor de
     * entrada estabelecido.
     * O par�metro n deve ser maior que 0.
     */
    public static int somaDivisores(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n inv�lido");
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
