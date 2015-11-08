package br.ufg.inf.es.construcao.amigos;

import br.ufg.inf.es.construcao.matematica.SomaDivisores;

/**
 * Implementa��o do algoritmo que verifica se dois dados n�meros s�o amigos,
 * ou seja, se a soma dos divisores de n � igual � m e a soma dos divisores
 * de m � igual � n.
 */
public class Amigos {

    /**
     * Verifica a se os dois dados n�meros s�o "amigos".
     *
     * @param n Primeiro inteiro.
     * @param m Segundo inteiro.
     *
     * @return Retorna true caso a propriedade de "amizade" exista e false,
     * caso contr�rio.
     *
     * @throws IllegalArgumentException Caso n ou m sejam menores que os
     * valores de entrada estabelecidos.
     * O par�metro n deve ser maior que 0.
     * O par�metro m deve ser maior que 0.
     */
    public static char amigos(int n, int m) {
        if (n <=0) {
            throw new IllegalArgumentException("n inv�lido");
        }

        if (m <= 0) {
            throw new IllegalArgumentException("m inv�lido");
        }

        int sn = SomaDivisores.somaDivisores(n);
        int sm = SomaDivisores.somaDivisores(m);

        if (sn == m && sm == n) {
            return 'V';
        } else {
            return 'F';
        }
    }
}
