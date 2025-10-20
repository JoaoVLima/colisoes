package org.limadeveloper;

import java.util.Arrays;

public class Test {
    public Test(Sort[] algoritmos, int[][] vetores) {
        for (int[] vetor : vetores) {
            String resultado = "vetor = ";
            resultado = sprintf(resultado, vetor);
            resultado += "\n\n";


            for (Sort algoritmo : algoritmos) {
                resultado += algoritmo.getClass().getSimpleName();
                resultado += "(vetor)\n";

                int[] vetor_resultado = algoritmo.sort(vetor.clone(), vetor.length);

                resultado += "trocas = " + algoritmo.trocas + "\n";
                resultado += "iteracoes = " + algoritmo.iteracoes + "\n";

                resultado = sprintf(resultado, vetor_resultado);
                resultado += "\n\n";
            }

            System.out.println(resultado);
        }
    }

    public String sprintf(String resultado, int[] arr) {
        resultado += "[";
        for (int i = 0; i < arr.length - 1; i++) {
            resultado += arr[i] + ",";
        }
        resultado += arr[arr.length - 1];
        resultado += "]";
        return resultado;
    }
}
