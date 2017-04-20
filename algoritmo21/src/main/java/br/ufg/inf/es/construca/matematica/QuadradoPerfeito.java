package br.ufg.inf.es.construca.matematica;

/**
 * Implementação do algoritmo que verifica se um dado número é ou não
 * um quadrado perfeito.
 */
public class QuadradoPerfeito {

    /**
     * Verifica se um dado número é um quadrado perfeito.
     *
     * @param k Número a ser verificado.
     *
     * @return Retorna true caso o número seja um quadrado perfeito e false,
     * caso contrário.
     *
     * @throws IllegalArgumentException Caso o valor de k seja menor que
     * o valor de entrada estabelecido.
     * O parâmetro k deve ser maior que 0.
     */
    public static boolean quadradoPerfeito(int k) {
        if (k < 1) {
            throw new IllegalArgumentException("k inválido");
        }

        int i = 1;
        int q = 1;

        while (q < k) {
            i = i + 2;
            q = q + i;
        }

        return q == k;
    }
}
