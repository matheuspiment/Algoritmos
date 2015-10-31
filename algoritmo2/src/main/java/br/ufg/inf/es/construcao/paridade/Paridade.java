package br.ufg.inf.es.construcao.paridade;

/**
 * Implementa��o do algoritmo que verifica a paridade de um dado n�mero.
 */
public class Paridade {

    /**
     * Verifica se um dado n�mero � par.
     *
     * @param n N�mero fornecido.
     * @return Valor true caso o n�mero seja par,
     * caso contr�rio, retorna false.
     */
    public static boolean paridade(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
