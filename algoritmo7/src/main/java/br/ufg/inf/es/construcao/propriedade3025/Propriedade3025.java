package br.ufg.inf.es.construcao.propriedade3025;

/**
 * Implementa��o do algoritmo que verifica a exist�ncia da propriedade 3025
 * em um dado n�mero.
 */
public class Propriedade3025 {

    /**
     * Verifica a exist�ncia da propriedade 3025 em um dado n�mero.
     *
     * @param n N�mero � ser verificado.
     * @return Retorna true para a exist�ncia da propriedade no n�mero e false,
     * caso contr�rio.
     * @throws IllegalArgumentException Caso n esteja fora do intervalo estabelecido.
     * O n deve ser maior que 0, inclusive, e menor que 9999, inclisive.
     */
    public static boolean propriedade3025(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("n inv�lido");
        }

        int i = n / 100; // Dois d�gitos mais significativos.
        int j = n % 100; // Dois d�gitos menos significativos.

        if ((i + j) * (i + j) == n) {
            return true;
        } else {
            return false;
        }
    }
}
