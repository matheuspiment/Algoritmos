package br.ufg.inf.es.construcao.matematica;

public class Log {
    public static double log(int n, int k) {
        if (n < 1) {
            throw new IllegalArgumentException("n inválido");
        }

        if (k < 2) {
            throw new IllegalArgumentException("k inválido");
        }

        int i = 2;
        double e = n + 1;

        while (i <= k) {
            double p = Potencia.potencia(n, i);
            double f = Fatorial.fatorial(i);
            e = e + p / f;
            i = i + 1;
        }

        return e;
    }
}
