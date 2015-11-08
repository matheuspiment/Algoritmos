package br.ufg.inf.es.construcao.matematica;

/**
 * Implementa��o do algoritmo que realiza a multiplica��o de dois n�meros.
 */
public class Produto {

    /**
     * Realiza a multiplica��o de dois n�meros.
     *
     * @param a O multiplicador.
     * @param b O multiplicando.
     *
     * @return O produto da multiplpica��o.
     *
     * @throws IllegalArgumentException Caso a ou b seja inv�lido.
     * Os par�metros a e b devem ser maiores que 0.
     */
    public static int produto(int a, int b) {
        if (a < 0) {
            throw new IllegalArgumentException("a inv�lido");
        }

        if (b < 0) {
            throw new IllegalArgumentException("b inv�lido");
        }

        int i = 1;
        int s = 0;

        while (i <= b) {
            s = s + a;
            i = i + 1;
        }

        return s;
    }
}
