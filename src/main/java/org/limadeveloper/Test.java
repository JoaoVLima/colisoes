package org.limadeveloper;

import java.awt.desktop.SystemEventListener;

class Test {
    Sort[] algoritmos;
    int[][] vetores;
    Resultado[][] resultados;

    Test(Sort[] algoritmos, int[][] vetores) {
        this.vetores = vetores;
        this.algoritmos = algoritmos;
        this.resultados = new Resultado[vetores.length][algoritmos.length];
    }

    void test() {
        for (int vetor_index = 0; vetor_index < vetores.length; vetor_index++) {
            int[] vetor = vetores[vetor_index];

            // test
            for (int algoritmo_index = 0; algoritmo_index < algoritmos.length; algoritmo_index++) {
                Sort algoritmo = algoritmos[algoritmo_index];
                int[] vetor_resultado = algoritmo.sort(vetor.clone(), vetor.length);

                // save results
                String nome_algoritmo = algoritmo.getClass().getSimpleName();
                int trocas = algoritmo.trocas;
                int iteracoes = algoritmo.iteracoes;
                resultados[vetor_index][algoritmo_index] = new Resultado(
                        nome_algoritmo,
                        trocas,
                        iteracoes,
                        vetor,
                        vetor_resultado
                );
            }

            // rank (mais um sort)
            int n = algoritmos.length;
            int[] valores_trocas = new int[n];
            int[] valores_iteracoes = new int[n];

            for (int i = 0; i < n; i++) {
                valores_trocas[i] = resultados[vetor_index][i].trocas;
                valores_iteracoes[i] = resultados[vetor_index][i].iteracoes;
            }

            Sort algoritmoQualquer = new GnomeSort();
            int[] valores_trocas_sort = algoritmoQualquer.sort(valores_trocas.clone(), n);
            int[] valores_iteracoes_sort = algoritmoQualquer.sort(valores_iteracoes.clone(), n);


            System.out.println(string_array("", vetor) + "\n");
            // rank trocas print na ordem
            System.out.println("Trocas: \n");
            System.out.println("| Posicao | Trocas | Algoritmo | Vetor |");
            System.out.println("|:-:|---|:-:|:-:|");
            for (int posicao = 0; posicao < n; posicao++) {
                for (int index_troca = 0; index_troca < n; index_troca++) {
                    if(valores_trocas_sort[posicao]==valores_trocas[index_troca]){
                        System.out.print("| " + (posicao+1) + "º" + " | ");
                        Resultado res = resultados[vetor_index][index_troca];
                        res.print_trocas();
                        valores_trocas[index_troca] = -1;
                    }
                }
            }

            // rank iteracoes print na ordem
            System.out.println("\nIteracoes: \n");
            System.out.println("| Posicao | Iteracoes | Algoritmo | Vetor |");
            System.out.println("|:-:|---|:-:|:-:|");
            for (int posicao = 0; posicao < n; posicao++) {
                for (int index_iteracao = 0; index_iteracao < n; index_iteracao++) {
                    if(valores_iteracoes_sort[posicao]==valores_iteracoes[index_iteracao]){
                        System.out.print("| " + (posicao+1) + "º" + " | ");
                        Resultado res = resultados[vetor_index][index_iteracao];
                        res.print_iteracoes();
                        valores_iteracoes[index_iteracao] = -1;
                    }
                }
            }



            // reset
            for (Sort algoritmo : algoritmos) {
                algoritmo.reset();
            }

        }
    }

    String string_array(String string, int[] arr) {
        string += "[";
        for (int i = 0; i < arr.length - 1; i++) {
            string += arr[i] + ",";
        }
        string += arr[arr.length - 1];
        string += "]";
        return string;
    }

}
