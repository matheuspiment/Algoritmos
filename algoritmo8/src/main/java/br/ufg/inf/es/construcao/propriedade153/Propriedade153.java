package br.ufg.inf.es.construcao.propriedade153;

/**
 * Implementação do algoritmo que verifica a existência de propriedade 153
 * em um dado número.
 */
public class Propriedade153 {

    /**
     * Verifica a existência da propriedade 153 em um dado número.
     *
     * @param n Número à ser verificado.
     * @return Retorna true para a existência da propriedade no número ou false,
     * caso contrário.
     * @throws IllegalArgumentException Caso n esteja fora do intervalo
     * estabelecido.
     * O n deve ser maior que -1 e menor que 1000.
     */
    public static boolean propriedade153(int n) {
        if (n < 0 || n > 999) {
            throw new IllegalArgumentException("n inválido");
        }

        int i = n / 100;
        int j = (n - 100 * i) / 10;
        int k = n % 10;

        if (i * i * i + j * j * j + k * k * k == n) {
            return true;
        }

        else {
            return false;
        }
    }
}