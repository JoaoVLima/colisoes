package org.limadeveloper;

import java.util.Arrays;

public class Test {
    public Sort[] algoritmos;
    public int[][] vetores;
    public String[][] resultados;

    public Test(Sort[] algoritmos, int[][] vetores) {
        this.vetores = vetores;
        this.algoritmos = algoritmos;
        this.resultados = new String[vetores.length][algoritmos.length];
    }

    public void test() {
        for (int vetor_index = 0; vetor_index < vetores.length; vetor_index++) {
            int[] vetor = vetores[vetor_index].clone();
            String resultado = "vetor = ";
            resultado = string_array(resultado, vetor);
            resultado += "\n\n";


            for (Sort algoritmo : algoritmos) {
                resultado += algoritmo.getClass().getSimpleName();
                resultado += "(vetor)\n";

                int[] vetor_resultado = algoritmo.sort(vetor.clone(), vetor.length);

                resultado += "trocas = " + algoritmo.trocas + "\n";
                resultado += "iteracoes = " + algoritmo.iteracoes + "\n";

                resultado = string_array(resultado, vetor_resultado);
                resultado += "\n\n";
                algoritmo.reset();
            }

            System.out.println(resultado);
        }
    }


    public String string_array(String resultado, int[] arr) {
        resultado += "[";
        for (int i = 0; i < arr.length - 1; i++) {
            resultado += arr[i] + ",";
        }
        resultado += arr[arr.length - 1];
        resultado += "]";
        return resultado;
    }

}
