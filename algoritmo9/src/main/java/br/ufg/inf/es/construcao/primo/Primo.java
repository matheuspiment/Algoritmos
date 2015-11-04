package br.ufg.inf.es.construcao.primo;

/**
 * Implementa��o do algoritmo que identifica a primaridade de um dado n�mero.
 */
public class Primo {

    /**
     * Verifica se um dado n�mero � ou n�o primo.
     *
     * @param n N�mero � ser verificado.
     * @return Retorna true caso o n�mero seja primo ou false, caso contr�rio.
     * @throws IllegalArgumentException Caso n seja menor que 2.
     */
    public static boolean primo(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n inv�lido");
        }

        int i = 2;

        while (i <= (n - 1)) {
            if (n % i == 0) {
                return false;
            }

            i = i + 1;
        }

        return true;
    }
}