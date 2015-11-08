package br.ufg.inf.es.construcao.matematica;

/**
 * Implementa��o do algoritmo para obten��o do valor de pi envolvendo a
 * somat�ria de um total de n termos.
 */
public class Pi {

    /**
     * Calcula o valor de pi envolvendo a somat�ria de um total de n termos.
     *
     * @param n Inteiro que define o n�mero de termos a serem somados,
     *          quanto mais preciso o valor desejado, maior ter� que ser o
     *          valor de n.
     *
     * @return O valor de pi.
     *
     * @throws IllegalArgumentException Caso n esteja abaixo
     * do limite de entrada estabelecido.
     * O par�metro n deve ser igual ou maior que 1.
     */
    public static double pi(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inv�lido");
        }

        int i = 1;
        double s = -1;
        double d = -1;
        double p = 0;

        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
            i = i + 1;
        }

        return p;
    }
}

