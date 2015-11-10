package br.ufg.inf.es.construcao.matematica;

/**
 * Implementação do algoritmo que calcula a quantidade de soluções possíveis
 * para a equação 2x + 3y + 5z + 7w = 210.
 */
public class Equacao {

    /**
     * Calcula a quantidade de soluções possíveis
     * para a equação 2x + 3y + 5z + 7w = 210. Com x variando de 1 á 96,
     * y de 1 á 65, z de 1 á 39 e w de 1 á 28.
     *
     * @return Quantidade de soluções possíveis
     * para a equação.
     */
    public static int equacao() {
        int s = 0; // Conta as soluções.
        int x = 1;

        while (x <= 96) {
            int y = 1;

            while (y <= 65) {
                int z = 1;

                while (z <= 39) {
                    int w = 1;

                    while (w <= 28) {
                        if (2 * x + 3 * y + 5 * z + 7 * w == 210) {
                            s = s + 1;
                        }

                        w = w + 1;
                    }

                    z = z + 1;
                }

                y = y + 1;
            }

            x = x + 1;
        }

        return s;
    }
}
