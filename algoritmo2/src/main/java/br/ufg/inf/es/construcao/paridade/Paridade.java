package br.ufg.inf.es.construcao.paridade;

/**
 * Implementação do algoritmo que verifica a paridade de um dado número.
 */
public class Paridade {

    /**
     * Verifica se um dado número é par.
     *
     * @param n Número fornecido.
     * 
     * @return Valor true caso o número seja par,
     * caso contrário, retorna false.
     */
    public static boolean paridade(int n) {
        return n % 2 == 0;
    }
}
