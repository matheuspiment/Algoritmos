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
     * O x deve ser um valor maior que 0.
     * O y deve ser um valor maior ou igual à 0.
     */
    public static int potencia(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("x inválido");
        }

        if (y < 0) {
            throw new IllegalArgumentException("y inválido");
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
