package br.ufg.inf.es.construcao.produto;

/**
 * Implementação do algoritmo que realiza a multiplicação de dois números.
 */
public class Produto {
    
    /**
     * Realiza a multiplicação de dois números.
     * 
     * @param a O multiplicador.
     * @param b O multiplicando.
     * @return O produto da multiplpicação.
     * @throws IllegalArgumentException Caso a ou b seja inválido.
     */
    public static int produto(int a, int b) {
        if (a < 0 || b < 0) {
            if (a < 0) {
                throw new IllegalArgumentException("a inválido");
            } else {
                throw new IllegalArgumentException("b inválido");
            }
        } 
        
        int i = 1;
        int s = 0;
        
        while (i <= b) {
            s = s + a;
            i = i + 1;
        }
        
        return s;                                
    }  
}
