package br.ufg.inf.es.construcao.matematica;

/**
 * Implementacão do algoritmo que calcula o fatorial de um dado número.
 */
public class Fatorial {

    /**
     * Calcula o fatorial de um dado número.
     *
     * @param n Número ao qual se quer obter o fatorial.
     *
     * @return O fatorial do número dado.
     *
     * @throws IllegalArgumentException Caso n esteja abaixo
     * do limite de entrada estabelecido.
     * O parâmetro n deve ser maior que 0.
     */
    public static int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n inválido");
        }

        if (n == 0) {
            return 1;
        }

        int i = 2;
        int f = 1;

        while (i <= n) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }
}
