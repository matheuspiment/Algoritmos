package br.ufg.inf.es.construcao.amigos;

import br.ufg.inf.es.construcao.matematica.SomaDivisores;

/**
 * Implementação do algoritmo que verifica se dois dados números são amigos,
 * ou seja, se a soma dos divisores de n é igual à m e a soma dos divisores
 * de m é igual à n.
 */
public class Amigos {

    /**
     * Verifica a se os dois dados números são "amigos".
     *
     * @param n Primeiro inteiro.
     * @param m Segundo inteiro.
     *
     * @return Retorna true caso a propriedade de "amizade" exista e false,
     * caso contrário.
     *
     * @throws IllegalArgumentException Caso n ou m sejam menores que os
     * valores de entrada estabelecidos.
     * O parâmetro n deve ser maior que 0.
     * O parâmetro m deve ser maior que 0.
     */
    public static char amigos(int n, int m) {
        if (n <=0) {
            throw new IllegalArgumentException("n inválido");
        }

        if (m <= 0) {
            throw new IllegalArgumentException("m inválido");
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
