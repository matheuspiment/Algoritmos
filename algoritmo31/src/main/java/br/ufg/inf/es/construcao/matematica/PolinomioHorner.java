package br.ufg.inf.es.construcao.matematica;

/**
 * Implementação do algoritmo qua avalia polinômios utilizando o
 * esquema de Horner.
 */
public class PolinomioHorner {

    /**
     * Avalia o polinômio utilizando o esquema de Horner.
     *
     * @param x Valor da variável x do polinômio.
     * @param g Número de elementos do vetor.
     * @param a Velores que compõem o vetor.
     *
     * @return Resultado do polinômio.
     *
     * @throws IllegalArgumentException Caso g ou o tamanho do vetor
     * não atendam as exigências de entrada estabelecidas.
     * O parâmetro g deve ser maior que 0.
     * O tamanho do vetor deve ser maior que g + 1.
     */
    public static int polinomioHorner(int x, int g, int[] a) {
        if (g < 1) {
            throw new IllegalArgumentException("g inválido");
        }

        if (a.length < (g + 1)) {
            throw new IllegalArgumentException("tamanho do vetor");
        }

        int p = a[g];
        int i = g - 1;

        while (i >= 0) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }
}
