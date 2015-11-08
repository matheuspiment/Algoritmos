package br.ufg.inf.es.construcao.matematica;

/**
 * Implementa��o do algoritmo que calcula o log natural com base na soma
 * dos termos 1 + n + (n * 2) / 2! + ... + (n ^ (k - 1) / (k - 1)!) +
 * (n ^ k / k!).
 */
public class Log {

    /**
     * Calcula o log natural com base na somat�ria de termos.
     *
     * @param n N�mero ao qual se pretende obter o log.
     * @param k Define a quantidade de termos a serem somados(precis�o).
     *
     * @return O log.
     *
     * @throws IllegalArgumentException Caso n ou k estejam abaixo do limite
     * de entrada estabelecido.
     * O par�metro n deve ser maior que 0.
     * O par�metro k deve ser maior que 1.
     */
    public static double log(int n, int k) {
        if (n < 1) {
            throw new IllegalArgumentException("n inv�lido");
        }

        if (k < 2) {
            throw new IllegalArgumentException("k inv�lido");
        }

        int i = 2;
        double e = n + 1;

        while (i <= k) {
            double p = Potencia.potencia(n, i);
            double f = Fatorial.fatorial(i);
            e = e + p / f;
            i = i + 1;
        }

        return e;
    }
}
