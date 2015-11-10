package br.ufg.inf.es.construcao.matematica.funcoes;

/**
 * Implementação do algoritmo da função de Ackermann.
 */
public class Ackermann {

    /**
     * Aplica a função de Ackermann nos dados inteiros.
     *
     * @param x Primeiro inteiro.
     * @param y Segundo inteiro.
     *
     * @return O resultado da aplicação da função de Ackermann
     * nos dados inteiros.
     *
     * @throws IllegalArgumentException Caso x ou y não atendam as exigências
     * de entrada.
     * O parâmetro x deve ser maior que -1.
     * O parâmetro y deve ser maior que -1.
     */
    public static int funcaoAckermann(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("x inválido");
        }

        if (y < 0) {
            throw new IllegalArgumentException("y inválido");
        }

        if (x == 0) {
            return y + 1;
        }

        if (y == 0) {
            return funcaoAckermann(x - 1, 1);
        }

        return funcaoAckermann(x - 1, funcaoAckermann(x, y - 1));
    }
}
