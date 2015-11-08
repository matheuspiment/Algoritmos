package br.ufg.inf.es.construcao.matematica;

import br.ufg.inf.es.construcao.matematica.Produto;

/**
 * Implementa��o do algoritmo que calcula o fatorial de um dado n�mero.
 */
public class FatorialSoma {

    /**
     * Calcula o fatorial de um dado n�mero utilizando a classe Produto.
     *
     * @param n N�mero ao qual se quer obter o fatorial.
     *
     * @return O fatorial do n�mero dado.
     *
     * @throws IllegalArgumentException Caso n esteja abaixo
     * do limite de entrada estabelecido.
     * O par�metro n deve ser maior que 0.
     */
    public static int fatorialsoma(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inv�lido");
        }

        int i = 2;
        int f = 1;
        while (i <= n) {
            f = Produto.produto(f, i);
            i = i + 1;
        }

        return f;
    }
}