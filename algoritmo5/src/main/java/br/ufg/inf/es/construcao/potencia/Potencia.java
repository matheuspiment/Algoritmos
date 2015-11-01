package br.ufg.inf.es.construcao.potencia;

/**
 * Implementação do algoritmo que realiza a exponenciação.
 */
public class Potencia {
    
    /**
     * Multiplica o número x por ele mesmo y vezes(exponenciação).
     * 
     * @param x A base. 
     * @param y O expoente.
     * @return A potência.
     * @throws IllegalArgumentException Caso x ou y seja inválido.
     */
    public static int potencia(int x, int y) {
        if (x <= 0 || y < 0) {
            if (x <= 0) {
                throw new IllegalArgumentException("x inválido");
            } else {
                throw new IllegalArgumentException("y inválido");
            }
        }
        
        int i = 1;
        int p = 1;
        
        while (i <= y) {
            p = p * x;
            i = i + 1;
        }
        
        return p;
    }    
}
