package br.ufg.inf.es.construcao.array;

/**
 * Implementação do algoritmo que que inverte a ordem de uma
 * dada sequência de caracteres.
 */
public class InverteCaracteres {

    /**
     * Inverte uma dada sequência de caracteres.
     *
     * @param S Sequência de caracteres.
     *
     * @return Sequência de caracteres inversa à sequência dada.
     */
    public static char[] inverter(char[] S) {
        char[] subS = new char[S.length];
        int n = S.length - 1;

        if (n == 1) {
            return S;
        } else {
            while (n >= 0) {
                subS[n] = S[(S.length - n) - 1];
                n--;
            }

            return subS;
        }
    }
}
