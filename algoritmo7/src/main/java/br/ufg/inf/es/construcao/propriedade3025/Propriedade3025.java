package br.ufg.inf.es.construcao.propriedade3025;

/**
 * Implementação do algoritmo que verifica a existência da propriedade 3025
 * em um dado número.
 */
public class Propriedade3025 {

    /**
     * Verifica a existência da propriedade 3025 em um dado número.
     *
     * @param n Número à ser verificado.
     *
     * @return Retorna true para a existência da propriedade no número ou false,
     * caso contrário.
     *
     * @throws IllegalArgumentException Caso n esteja fora do intervalo
     * estabelecido.
     * O n deve ser maior que -1 e menor que 10000.
     */
    public static boolean propriedade3025(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("n inválido");
        }

        int i = n / 100; // Dois dígitos mais significativos.
        int j = n % 100; // Dois dígitos menos significativos.

        if ((i + j) * (i + j) == n) {
            return true;
        } else {
            return false;
        }
    }
}
