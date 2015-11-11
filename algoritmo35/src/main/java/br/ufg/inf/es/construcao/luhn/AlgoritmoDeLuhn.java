package br.ufg.inf.es.construcao.luhn;

import br.ufg.inf.es.construcao.matematica.Mod;

/**
 * Implementação do algoritmo de Luhn.
 */
public class AlgoritmoDeLuhn {

    /**
     * Confere o digito de verificação para uma dada sequência por meio do
     * algoritmo de Luhn.
     *
     * @param n "Sequência" de dígitos cujo digito de verifificação se quer conferir.
     *
     * @return Digito de verificaçao, de acordo com o algoritmo de Luhn.
     *
     * @throws IllegalArgumentException Caso k não atenda a exigência de
     * entrada estabelecida.
     * O inteiro k deve ser maior que 1.
     */
    public static int checkDigit(int[] n) {
        int k = n.length;

        if (k < 2) {
            throw new IllegalArgumentException("k inválido");
        }

        int i = 0;
        int p = 0;
        int l = k - 2;
        boolean a = false;

        while (l >= 0) {
            if (a) {
                p = p + n[l];
            } else {
                int t = n[l] * 2;
                i = i + t / 10 + Mod.mod(t, 10);
            }

            l = l - 1;
            a = !a;
        }

        return 10 - Mod.mod(i + p, 10);
    }
}