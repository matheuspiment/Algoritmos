package br.ufg.inf.es.construcao.primo;

/**
 * Implementação do algoritmo que identifica a primaridade de um dado número.
 */
public class Primo {

    /**
     * Verifica se um dado número é ou não primo.
     *
     * @param n Número à ser verificado.
     * @return Retorna true caso o número seja primo ou false, caso contrário.
     * @throws IllegalArgumentException Caso n seja menor que 2.
     */
    public static boolean primo(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n inválido");
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