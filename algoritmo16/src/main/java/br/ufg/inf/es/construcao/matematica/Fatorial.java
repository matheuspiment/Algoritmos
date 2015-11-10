package br.ufg.inf.es.construcao.matematica;

/**
 * Implementa��o do algoritmo que calcula o fatorial de um dado n�mero.
 */
public class Fatorial {

    /**
     * Calcula o fatorial de um dado n�mero.
     *
     * @param n N�mero ao qual se quer obter o fatorial.
     *
     * @return O fatorial do n�mero dado.
     *
     * @throws IllegalArgumentException Caso n esteja abaixo
     * do limite de entrada estabelecido.
     * O par�metro n deve ser maior que 0.
     */
    public static int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n inv�lido");
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
