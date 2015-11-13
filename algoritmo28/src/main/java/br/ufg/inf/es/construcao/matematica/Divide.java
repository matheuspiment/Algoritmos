package br.ufg.inf.es.construcao.matematica;

import br.ufg.inf.es.construcao.matematica.DivideSomas;
import br.ufg.inf.es.construcao.matematica.Mod;
import br.ufg.inf.es.construcao.matematica.Produto;

/**
 * Implementação do algoritmo que calcula o resultado de uma divisão
 */
public class Divide {

    /**
     * Calcula a divisão entre dois dados números.
     *
     * @param a Dividendo.
     * @param b Divisor.
     * @param k Indica a precisão(casas decimais).
     *
     * @throws IllegalArgumentException Caso os valores de a ou b sejam menores
     * que os valores de entrada estabelecidos.
     * O parâmetro a deve ser maior que 0.
     * O parâmetro b deve ser maior que 0.
     */
    public static void divide(int a, int b, int k) {
        if (a <= 0) {
            throw new IllegalArgumentException("a inválido");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("b inválido");
        }

        int d = DivideSomas.divideSomas(a, b);
        System.out.print(d);

        int r = Mod.mod(a, b);

        if (r != 0) {
            System.out.print(",");
        }

        while (r != 0 && k > 0) {
            r = Produto.produto(10, r);
            d = DivideSomas.divideSomas(r, b);
            System.out.print(d);
            r = Mod.mod(r, b);
            k = k - 1;
        }
    }
}
