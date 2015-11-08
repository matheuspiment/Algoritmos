package br.ufg.inf.es.construcao.matematica;

/**
 * Implementa��o do algoritmo para verifica��o da raz�o �urea.
 */
public class RazaoAurea {

    /**
     * Verifica a raz�o �urea com base nos dados de entrada fornecidos.
     *
     * @param t1 N�mero para termo corrente.
     * @param t2 N�mero para termo anterior.
     * @param fator Fator de precis�o.
     *
     * @return A raz�o �urea.
     *
     * @throws IllegalArgumentException Caso t1, t2 ou fator estejam abaixo dos
     * limites de entrada estabelecidos.
     * O par�metro t1 deve ser maior que 0.
     * O par�metro t2 deve ser maior que t1.
     * O par�metro fator deve ser maior que 0.
     */
    public static double razaoAurea(int t1, int t2, int fator) {
        if (t1 <= 0) {
            throw new IllegalArgumentException("t1 invalido");
        }

        if (t2 <= t1) {
            throw new IllegalArgumentException("t2 invalido");
        }

        if (fator <= 0) {
            throw new IllegalArgumentException("fator invalido");
        }

        double tc = t2;
        double ta = t1;
        int i = 1;

        while (i <= fator) {
            tc = tc + ta;
            ta = tc - ta;
            i++;
        }

        return tc / ta;
    }
}