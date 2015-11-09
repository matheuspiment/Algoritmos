package br.ufg.inf.es.construcao.matematica;

import br.ufg.inf.es.construcao.matematica.Potencia;

/**
 * Implementação do algoritmo que calcula polinômio simples.
 */
public class PolinomioSimples {

    /**
     * Calcula o polinômio simples.
     *
     * @param x Valor da variável x do polinômio.
     * @param g Número de elementos do vetor.
     * @param a Velores que compõem o vetor.
     *
     * @return Resultado do polinômio.
     *
     * @throws IllegalArgumentException Caso g , a[g], ou o tamanho do vetor
     * não atendam as exigências de entrada estabelecidas.
     * O parâmetro g deve ser maior que 0.
     * O tamanho do vetor deve ser maior que g + 1.
     * A posição a[g] do vetor tem que ser diferente de 0.
     */
    public static int polinomio(int x, int g, int[] a) {
        if (g < 1) {
            throw new IllegalArgumentException("g inválido");
        }

        if (a.length < (g + 1)) {
            throw new IllegalArgumentException("tamanho do vetor");
        }

        if (a[g] == 0){
            throw new IllegalArgumentException("vetor inválido");
        }

        int t = Potencia.potencia(x, g);
        int p = a[0];
        int i = 1;

        while (i <= g) {
            t = Potencia.potencia(x, i);
            p = p + a[i] * t;
            i = i + 1;
        }

        return p;
    }
}
