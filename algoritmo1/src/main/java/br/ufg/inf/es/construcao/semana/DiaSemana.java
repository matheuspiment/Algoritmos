package br.ufg.inf.es.construcao.semana;

/**
 * Implementação do algoritmo que obtem o dia da semana de uma dada data.
 */
public class DiaSemana {

    /**
     * Calcula o dia da semana de uma data.
     *
     * @param d Dia da data.
     * @param m Mês da data.
     * @param a Ano da data.
     * @return Valor 0 para segunda-feira, 1 para terça-feira
     * e assim sucessivamente.
     *
     * @throws IllegalArgumentException Caso o dia, o mês ou o ano fornecidos
     * estejam fora dos limites admitidos.
     * O dia deve ser um valor entre 1 e 31, inclusive.
     * O mês deve ser um valor entre 1 e 12, inclusive.
     * O ano deve ser um valor maior que 1752.
     */
    public static int diaDaSemana(int d, int m, int a) {
        if (d < 1 || d > 31) {
            throw new IllegalArgumentException("Dia inválido");
        }

        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("Mês inválido");
        }

        if (a < 1753) {
            throw new IllegalArgumentException("Ano inválido");
        }

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        int s = d + 2 * m + (3 * (m + 1) / 5) + a + a / 4 - a / 100 + a / 400;

        return (s % 7);
    }
}
