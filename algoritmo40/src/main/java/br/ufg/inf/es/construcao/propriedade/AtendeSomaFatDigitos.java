package br.ufg.inf.es.construcao.propriedade;

import br.ufg.inf.es.construcao.matematica.Fatorial;

/**
 * Implementação do algoritmo que verifica se um dado número atende
 * a proriedade de a soma do fatorial de seus algarismos(dígitos)
 * ser igual ao próprio número dado.
 */
public class AtendeSomaFatDigitos {

    /**
     * Verifica se um dado número atende a proriedade de a soma do fatorial de
     * seus algarismos ser igual ao próprio número.
     *
     * @param n Número á ser verificado.
     *
     * @return Retorna true caso o dado número atenda a propriedade ou false,
     * caso contrário.
     *
     * @throws IllegalArgumentException Caso n não atenda a exigência de
     * entrada estabelecida.
     * O parâmetro n deve ser maior que 0 e menor que 1000.
     */
    public static boolean verifica(int n) {
        if (n <= 0 || n >= 1000) {
            throw new IllegalArgumentException("n inválido");
        }

        int a = n / 100;
        int b = (n - 100 * a) / 10;
        int c = n % 10;
        int s = Fatorial.fatorial(a) + Fatorial.fatorial(b) + Fatorial.fatorial(c);

        if (s == n) {
            return true;
        } else {
            return false;
        }
    }
}
