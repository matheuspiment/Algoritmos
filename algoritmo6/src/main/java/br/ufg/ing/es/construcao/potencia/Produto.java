package br.ufg.ing.es.construcao.potencia;

/**
 * Implementação do algoritmo que realiza a exponenciação.
 */
public class Produto {

    /**
     * Realiza a multiplicação de dois números.
     *
     * @param a O multiplicador.
     * @param b O multiplicando.
     * @return O produto da multiplpicação.
     * @throws IllegalArgumentException Caso a ou b seja inválido, menor que 0.
     */
    public static int produto(int a, int b) {
        if (a < 0) {
            throw new IllegalArgumentException("a inválido");
        }

        if (b < 0) {
            throw new IllegalArgumentException("b inválido");
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