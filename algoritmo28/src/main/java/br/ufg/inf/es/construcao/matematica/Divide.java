package br.ufg.inf.es.construcao.matematica;

/**
 *
 */
public class Divide {

    /**
     *
     *
     * @param a Dividendo.
     * @param b Divisor.
     * @param k
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
