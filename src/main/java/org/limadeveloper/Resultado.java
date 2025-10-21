package org.limadeveloper;

class Resultado {
    String nome;
    int trocas;
    int iteracoes;
    int[] vetor_antes;
    int[] vetor_depois;
    Resultado(String nome, int trocas, int iteracoes, int[] vetor_antes, int[] vetor_depois) {
        this.nome = nome;
        this.trocas = trocas;
        this.iteracoes = iteracoes;
        this.vetor_antes = vetor_antes;
        this.vetor_depois = vetor_depois;
    }

    void print_trocas(){
        System.out.print(trocas+ " | ");
        System.out.print(nome + " | ");
        System.out.println(string_array("", vetor_depois) + " |");
    }

    void print_iteracoes(){
        System.out.print(iteracoes+ " | ");
        System.out.print(nome + " | ");
        System.out.println(string_array("", vetor_depois) + " |");
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
