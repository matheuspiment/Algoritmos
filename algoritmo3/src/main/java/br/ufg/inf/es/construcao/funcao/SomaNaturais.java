package br.ufg.inf.es.construcao.funcao;

/**
 * Implementa��o do algoritmo que realiza a soma dos n primeiros naturais.
 */
public class SomaNaturais {

    /**
     * Soma os n primeiros naturais, de 1 at� n.
     *
     * @param n O n�mero de termos a serem somados.
     * @return Retorna a soma dos n naturais.
     * @throws IllegalArgumentException Se n for menor que 1.
     */
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inv�lido");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }
}
