package br.ufg.inf.es.construcao.propriedade;

import br.ufg.inf.es.construcao.propriedade.AtendeSomaFatDigitos;

/**
 * Implementação do algoritmo que verifica quantos números atendem
 * a propriedade "SomaFatDigitos".
 */
public class Propriedade {

    /**
     * Verifica quantos números atendem a propriedade "SomaFatDigitos".
     *
     * @return Quantos números atendem a propriedade.
     */
    public static int verifica() {
        int t = 0;
        int n = 0;

        while (n < 1000) {
            if (AtendeSomaFatDigitos.verifica(n)) {
                t = t + 1;
            }

            n = n + 1;
        }

        return t;
    }
}
