package br.ufg.inf.es.construcao.matematica;

/**
 * Implementação do algoritmo para verificação da razão áurea.
 */
public class RazaoAurea {

    /**
     * Verifica a razão áurea com base nos dados de entrada fornecidos.
     *
     * @param t1 Nímero para termo corrente.
     * @param t2 Número para termo anterior.
     * @param fator Fator de precisão.
     *
     * @return A razão áurea.
     *
     * @throws IllegalArgumentException Caso t1, t2 ou fator estejam abaixo dos
     * limites de entrada estabelecidos.
     * O parâmetro t1 deve ser maior que 0.
     * O parâmetro t2 deve ser maior que t1.
     * O parâmetro fator deve ser maior que 0.
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