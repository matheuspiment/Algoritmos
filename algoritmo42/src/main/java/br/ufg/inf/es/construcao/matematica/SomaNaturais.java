package br.ufg.inf.es.construcao.matematica;

/**
 * Implementação do algoritmo que calcula a soma dos naturais po meio de
 * recursividade.
 */
public class SomaNaturais {

    /**
     * Soma os n primeiros naturais, de 1 até n.
     *
     * @param n Soma os n primeiros naturais, de 1 até n.
     *
     * @return Retorna a soma dos n naturais.
     *
     * @throws IllegalArgumentException Caso o inteiro n seja menor
     * que o limite de entrada estabelecido.
     * O parâmetro n deve ser maior que 0.
     */
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inválido");
        }

        if (n == 1) {
            return 1;
        } else {
            return somaNaturais(n - 1) + n;
        }
    }
}
