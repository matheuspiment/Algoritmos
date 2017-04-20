package br.ufg.inf.es.construcao.propriedade153;

/**
 * Implementa��o do algoritmo que verifica a exist�ncia de propriedade 153
 * em um dado n�mero.
 */
public class Propriedade153 {

    /**
     * Verifica a exist�ncia da propriedade 153 em um dado n�mero.
     *
     * @param n N�mero � ser verificado.
     *
     * @return Retorna true para a exist�ncia da propriedade no n�mero ou false,
     * caso contr�rio.
     *
     * @throws IllegalArgumentException Caso n esteja fora do intervalo
     * estabelecido.
     * O n deve ser maior que -1 e menor que 1000.
     */
    public static boolean propriedade153(int n) {
        if (n < 0 || n > 999) {
            throw new IllegalArgumentException("n inv�lido");
        }

        int i = n / 100;
        int j = (n - 100 * i) / 10;
        int k = n % 10;

        return (i * i * i + j * j * j + k * k * k == n);
    }
}
