package br.ufg.inf.es.construcao.matematica;

import java.util.List;

/**
 * Implementação do algoritmo recursivo de permutação de elementos
 * de um conjunto.
 */
public class Permutacao {
    public static List<String> permuta(
            String prefixo,
            String conjunto,
            List<String> resultadoParcial) {
        if (conjunto.length() == 1) {
            resultadoParcial.add(prefixo + conjunto);
            return resultadoParcial;
        }

        for (int i = 0; i < conjunto.length(); i++) {
            char cI = conjunto.charAt(i);

            StringBuilder sLinha = new StringBuilder(conjunto);
            sLinha.deleteCharAt(i);

            String pLinha = prefixo + cI;

            permuta(pLinha, sLinha.toString(), resultadoParcial);
        }

        return resultadoParcial;
    }
}