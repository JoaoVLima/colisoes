package org.limadeveloper;

abstract class Sort {
    int trocas = 0;
    int iteracoes = 0;
    abstract int[] sort(int[] arr, int tam);
    void reset(){
        trocas = 0;
        iteracoes = 0;
    };
}
