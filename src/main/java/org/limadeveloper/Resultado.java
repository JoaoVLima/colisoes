package org.limadeveloper;

class Resultado {
    String nome_classe;
    int trocas;
    int iteracoes;
    int[] vetor_antes;
    int[] vetor_depois;
    Resultado(String nome_classe, int trocas, int iteracoes, int[] vetor_antes, int[] vetor_depois) {
        this.nome_classe = nome_classe;
        this.trocas = trocas;
        this.iteracoes = iteracoes;
        this.vetor_antes = vetor_antes;
        this.vetor_depois = vetor_depois;
    }
}
