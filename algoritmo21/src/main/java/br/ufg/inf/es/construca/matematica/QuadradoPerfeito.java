package br.ufg.inf.es.construca.matematica;

/**
 * Implementa��o do algoritmo que verifica se um dado n�mero � ou n�o
 * um quadrado perfeito.
 */
public class QuadradoPerfeito {

    /**
     * Verifica se um dado n�mero � um quadrado perfeito.
     *
     * @param k N�mero a ser verificado.
     *
     * @return Retorna true caso o n�mero seja um quadrado perfeito e false,
     * caso contr�rio.
     *
     * @throws IllegalArgumentException Caso o valor de k seja menor que
     * o valor de entrada estabelecido.
     * O par�metro k deve ser maior que 0.
     */
    public static boolean quadradoPerfeito(int k) {
        if (k < 1) {
            throw new IllegalArgumentException("k inv�lido");
        }

        int i = 1;
        int q = 1;

        while (q < k) {
            i = i + 2;
            q = q + i;
        }

        if (q == k) {
            return true;
        } else {
            return false;
        }
    }
}
